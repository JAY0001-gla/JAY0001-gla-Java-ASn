public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double dObj = 45.67; 
        double dVal = dObj.doubleValue(); 
        int iVal = (int) dObj.doubleValue(); 

        System.out.println("Double object: " + dObj);
        System.out.println("Primitive double: " + dVal);
        System.out.println("Primitive int (cast): " + iVal);
    }
}
