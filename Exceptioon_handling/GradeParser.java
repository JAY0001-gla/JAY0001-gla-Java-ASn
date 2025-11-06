class GradeParser {
    public static void main(String[] args) {
        String[] grades = {"90", "A+", "85"};

        for (String grade : grades) {
            try {
                int g = Integer.parseInt(grade);
                System.out.println("Parsed grade: " + g);
            } catch (NumberFormatException e) {
                System.out.println("Invalid grade input: " + grade);
            }
        } 
    }
}