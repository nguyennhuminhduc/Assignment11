package Aggregation;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentList {

    ArrayList<Student> studentList = new ArrayList<Student>();

    public void enterStudentListInfo(int n) {
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter info for student " + (i + 1) + ":");
            Student student = new Student();
            student.enterStudentInfo();
            studentList.add(student);
        }
    }

    public void displayAllStudent() {
        if (studentList.isEmpty()) {
            System.out.println("No Students available.");
        } else {

            for (Student student : studentList) {
                student.displayStudentInfor();
                System.out.println("-------------------");
            }
        }
    }

    public Student findStudentByID(String idToFind) {
        for (Student student : studentList) {
            if (student.studentID.equals(idToFind)) {
                return student;
            }
        }
        return null;
    }

    public boolean deleteStudentById(String idToDelete) {
        Student student = findStudentByID(idToDelete);
        if (student != null) {
            studentList.remove(student);
            return true;
        }
        return false;
    }

    public boolean editStudentById(String idToEdit) {
        Student student = findStudentByID(idToEdit);
        if (student != null) {
            student.enterStudentInfo();
            return true;
        }
        return false;
    }

    void displayAllStudents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
