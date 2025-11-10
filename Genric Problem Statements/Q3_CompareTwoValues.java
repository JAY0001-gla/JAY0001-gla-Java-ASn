class CompareTwoValues {
    public static <T> boolean isEqual(T a, T b) { return a.equals(b); }
    public static void main(String[] args) {
        System.out.println(isEqual("Hello", "Hello"));
        System.out.println(isEqual(10, 20));
    }
}