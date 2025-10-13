
interface LightBehavior {
    void activate();
}

class SmartLightController {
    private LightBehavior behavior;

    public void setBehavior(LightBehavior behavior) {
        this.behavior = behavior;
    }

    public void trigger() {
        if (behavior != null) {
            behavior.activate();
        } else {
            System.out.println("No behavior set.");
        }
    }
}

public class SmartHomeLighting {
    public static void main(String[] args) {
        SmartLightController controller = new SmartLightController();

        controller.setBehavior(() -> System.out.println("Motion detected: Turning on hallway lights."));
        controller.trigger();

        controller.setBehavior(() -> System.out.println("Night time: Activating dim bedroom lights."));
        controller.trigger();

        controller.setBehavior(() -> System.out.println("Voice command 'party': Activating disco lights!"));
        controller.trigger();
    }
}