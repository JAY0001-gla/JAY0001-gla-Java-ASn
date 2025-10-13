package Interfaces;

public class BackgroundJob {
    public static void main(String[] args) {
        Runnable job = () -> {
            System.out.println("Background job started");
            try { 
                Thread.sleep(1000); 
            } 
            catch (InterruptedException e) {}
            System.out.println("Background job completed");
        };

        new Thread(job).start();
    }
}

