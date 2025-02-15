package Aggregation;

import java.util.Date;
import java.util.Scanner;

class Student {

    String studentID;
    private String fullName;
    private Date dateOfBirth;
    private String major;
    private float gpa;

    public Student(String studentID, String fullName, Date dateOfBirth, String major, float gpa) {
        this.studentID = studentID;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.major = major;
        this.gpa = gpa;
    }

    Student() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void enterStudentInfo() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Student Id: ");
        studentID = kb.nextLine();
        System.out.println("Enter Full Name: ");
        fullName = kb.nextLine();
        System.out.println("Enter Date of Birth: ");
        dateOfBirth = java.sql.Date.valueOf(kb.nextLine());
        System.out.println("Enter major: ");
        major = kb.nextLine();
        System.out.println("Enter gpa: ");
        gpa = kb.nextFloat();
    }

    public void displayStudentInfor() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Major : " + major);
        System.out.println("GPA : " + gpa);

    }
}
