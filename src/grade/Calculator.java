package grade;

import javax.swing.*;

public class Calculator {
    public void calculate() {
        double grade1 = 0;
        double grade2 = 0;
        double grade3 = 0;
        double grade4 = 0;
        double grade5 = 0;
        double gpa = 0;
        int noOfErrors=0;
        String letterGrade;
        String name = JOptionPane.showInputDialog("Hi what's your name ", null);
        System.out.println("Welcome " + name);
        do {
            noOfErrors = 0;
            try {
                String inputG1 = JOptionPane.showInputDialog("Enter your Social studies grade in decimal form: ", null);
                grade1 = Double.parseDouble(inputG1);
            } catch (Exception ex) {
                System.out.println("Invalid grade, Please enter correctly");
                noOfErrors++;
            }
        }while(noOfErrors>0);

        do {
            noOfErrors = 0;
            try {
                String inputG2 = JOptionPane.showInputDialog("Enter your ELA grade in decimal form: ", null);
                grade2 = Double.parseDouble(inputG2);
            } catch (Exception ex) {
                System.out.println("Invalid grade, please enter in correct form");
                noOfErrors++;
            }
        }while(noOfErrors>0);


        do {
            noOfErrors = 0;
            try {
                String inputG3 = JOptionPane.showInputDialog("Enter your Math grade in decimal form: ", null);
                grade3 = Double.parseDouble(inputG3);
            } catch (Exception ex) {
                System.out.println("Invalid grade, please enter in correct form");
                noOfErrors++;
            }
        }
        while (noOfErrors > 0) ;
        do{
            noOfErrors = 0;
            try {
                String inputG4 = JOptionPane.showInputDialog("Enter your PE grade in decimal form: ", null);
                grade4 = Double.parseDouble(inputG4);
            } catch (Exception ex) {
                System.out.println("Invalid grade, please enter in correct form");
                noOfErrors++;
            }
        }while(noOfErrors>0);
        do {
            try {
                String inputG5 = JOptionPane.showInputDialog("Enter your Science grade in decimal form: ", null);
                grade5 = Double.parseDouble(inputG5);
            } catch (Exception ex) {
                System.out.println("Invalid grade, please enter in correct form");
                noOfErrors++;
            }
        }while(noOfErrors>0);
        gpa = (grade1 + grade2 + grade3 + grade5 + grade4) / 5;
        System.out.println("Your gpa is: " + gpa);

        letterGrade = " ";

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

        StringBuffer sb = new StringBuffer();
        sb.append("Name:" + name);
        sb.append("\nSocial Studies: " + grade1);
        sb.append("\nELA: " + grade2);
        sb.append("\nMath: " + grade3);
        sb.append("\nPe: " + grade4);
        sb.append("\nScience: " + grade5);
        sb.append("\nTotal GPA: " + gpa);
        sb.append("\nTotal Letter Grade: " + letterGrade);

        JOptionPane.showMessageDialog(null, sb.toString(), "Your score", JOptionPane.INFORMATION_MESSAGE);
    }
}
