import java.math.RoundingMode;
import java.security.DrbgParameters;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double grade1 = 0;
        double grade2 = 0;
        double grade3 = 0;
        double grade4 = 0;
        double grade5 = 0;
        double gpa = 0;
        boolean isDataCorrect;
        String letterGrade;
        System.out.println("Hi what's your name ");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name);
        System.out.println("Enter your Social studies grade in decimal form: ");
            String inputG1 = scanner.nextLine();
            do {
                try {
                    grade1 = Double.parseDouble(inputG1);
                } catch (Exception ex) {
                    System.out.println("Invalid grade, Please enter correctly");
                    isDataCorrect = false;
                }
            }
        System.out.println("Enter your ELA grade in decimal form: ");
           String inputG2 = scanner.nextLine();
           try {
               grade2 = Double.parseDouble(inputG2);
           } catch (Exception ex) {
               System.out.println("Invalid grade, please enter in correct form");
           }
        System.out.println("Enter your Math grade in decimal form: ");
            String inputG3 = scanner.nextLine();
            try {
                grade3 = Double.parseDouble(inputG3);
            } catch (Exception ex) {
                System.out.println("Invalid grade, please enter in correct form");
            }
        System.out.println("Enter your PE grade in decimal form: ");
           String inputG4 = scanner.nextLine();
           try {
               grade4 = Double.parseDouble(inputG4);
           } catch (Exception ex) {
               System.out.println("Invalid grade, please enter in correct form");
           }
        System.out.println("Enter your Science grade in decimal form: ");
           String inputG5 = scanner.nextLine();
           try {
               grade5 = Double.parseDouble(inputG5);
           } catch (Exception ex) {
               System.out.println("Invalid grade, please enter in correct form");
           }
        gpa = (grade1 + grade2 + grade3 + grade5 + grade4) / 5;
        System.out.println("Your gpa is: " + gpa);
        scanner.close();


        if (3.5 < gpa & 4.0 > gpa) {
            letterGrade = "A";
            System.out.println("Your letter grade is: " + letterGrade);
        } else System.out.print(" ");


        if (3.0 < gpa & 3.4 > gpa) {
            letterGrade = "B";
            System.out.println("Your letter grade is: " + letterGrade);
        } else System.out.print(" ");


        if (2.0 < gpa & 2.9 > gpa) {
            letterGrade = "C";
            System.out.println("Your letter grade is: " + letterGrade);
        } else System.out.print(" ");


        if (1.5 < gpa & 1.9 > gpa) {
            letterGrade = "D";
            System.out.println("Your letter grade is: " + letterGrade);
        } else System.out.print(" ");


        if (gpa < 1.5) {
            letterGrade = "N";
            System.out.println("Your letter grade is: " + letterGrade);
        } else System.out.print(" ");

    }
}