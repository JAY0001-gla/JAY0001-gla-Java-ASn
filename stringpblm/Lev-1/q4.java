class q4 {

    public static void generate_exception(){
        String text = null;
        System.out.println("Lenght of string is : "+text.length());
    }

    public static void handle_exception(){
        String text = null;
        try {
            System.out.println("Lenght of string is : "+text.length());
        } catch (NullPointerException  e) {
            System.out.println("The exception is: "+e);
        }
        
    }
    public static  void main(String args[]){
        // generate_exception();
        handle_exception();
        
    }
}
