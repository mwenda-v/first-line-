public class VariablesDemo2 {
    public static void main(String[] args) {
        String name = "Units I have not Yet Done";
        int totalUnits = 22;
        double gpa = 3.75; //This line has options that are valid and might cause errorrs
        char grade = 'B';
        boolean mustStudy = true;

        System.out.println("Name: " + name);
        System.out.println("Total Units: " + totalUnits);
        System.out.println("GPA: " + gpa);
        System.out.println("Grade: " + grade);
        System.out.println("Must Study: " + mustStudy);

        int unitperDay = totalUnits; // update a variable
        System.out.println("Units per Day: " + unitperDay);
         
        if (unitperDay <1) {
            System.out.println("You must work on your GPA");
        } else {
            System.out.println("You are on track to maintain your GPA");
            
        }
    }
}
