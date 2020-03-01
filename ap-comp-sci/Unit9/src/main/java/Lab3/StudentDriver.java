package Lab3;

public class StudentDriver {
    public static void main(String[] args) {

        //inits 3x2 2D array of students
        Student[][] studentBody = new Student[3][2];

        //2 objects of each grad class
        UnderGrad underGrad1 = new UnderGrad("Aditya", "Gender Studies", 97);
        UnderGrad underGrad2 = new UnderGrad("Liam", "Weapons Manufacturing", 121);

        Graduate graduate1 = new Graduate("Aryan", "National Security and Intelligence", 49);
        Graduate graduate2 = new Graduate("Andrew", "Being Extra", 948);

        PostGraduate postGrad1 = new PostGraduate("Max", "Politics of the Soviet Union", 86);
        PostGraduate postGrad2 = new PostGraduate("Justin", "Artificial Intelligence", 75);

        //sets each spot in array equal to a student object
        studentBody[0][0] = postGrad1;
        studentBody[0][1] = postGrad2;
        studentBody[1][0] = graduate1;
        studentBody[1][1] = graduate2;
        studentBody[2][0] = underGrad1;
        studentBody[2][1] = underGrad2;

        //uses enhanced for loop to print out array of students
        for(Student[] studentRow : studentBody) {
            for(Student student : studentRow) {
                System.out.println(student + "\nTuition: $" + student.calculateTuition(student.getUnitsTaken()) + "\n");
            }
        }
        System.out.println("\n");

        //uses for loop to print out array of students
        for(int row = 0; row < studentBody.length; row++) {
            for(int col = 0; col < studentBody[row].length; col++) {
                System.out.println(studentBody[row][col] + "\nTuition: $" +
                studentBody[row][col].calculateTuition(studentBody[row][col].getUnitsTaken()) + "\n");
            }
        }
    }
}
