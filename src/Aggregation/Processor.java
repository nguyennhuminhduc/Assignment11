package Aggregation;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentList studentList = new StudentList();

        while (true) {
            System.out.println("Student Management System");
            System.out.println("1. Enter information for n students");
            System.out.println("2. Display all students");
            System.out.println("3. Find student by ID");
            System.out.println("4. Delete student by ID");
            System.out.println("5. Edit student by ID");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of students to input: ");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    studentList.enterStudentListInfo(n);
                    break;
                case 2:
                    studentList.displayAllStudents();
                    break;
                case 3:
                    System.out.print("Enter student ID to search: ");
                    String searchId = scanner.nextLine();
                    Student foundStudent = studentList.findStudentByID(searchId);
                    if (foundStudent != null) {
                        foundStudent.displayStudentInfor();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter student ID to delete: ");
                    String deleteId = scanner.nextLine();
                    boolean deleted = studentList.deleteStudentById(deleteId);
                    if (deleted) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter student ID to edit: ");
                    String editId = scanner.nextLine();
                    boolean edited = studentList.editStudentById(editId);
                    if (edited) {
                        System.out.println("Student updated successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
