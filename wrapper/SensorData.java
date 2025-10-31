public class Q13_SensorData {
    public static void logData(double primitive, Double wrapper) {
        Double boxed = primitive; 
        double unboxed = wrapper;
        System.out.println("Boxed value: " + boxed);
        System.out.println("Unboxed value: " + unboxed);
    }

    public static void main(String[] args) {
        logData(36.5, 25.8);
    }
}
