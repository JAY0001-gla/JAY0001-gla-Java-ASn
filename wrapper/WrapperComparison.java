public class Q4_WrapperComparison {
    public static void main(String[] args) {
        Integer a = 100, b = 100;
        Integer c = 200, d = 200;

        System.out.println("a == b : " + (a == b)); 
        System.out.println("c == d : " + (c == d));
        System.out.println("a.equals(b): " + a.equals(b)); 

        System.out.println("\nExplanation:");
        System.out.println("Java caches Integer values from -128 to 127, "
                + "so a and b refer to the same object, but c and d don’t.");
    }
}
