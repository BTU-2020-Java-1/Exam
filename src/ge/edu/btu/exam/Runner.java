package ge.edu.btu.exam;

import java.util.Map;

public class Runner {

    public static void main(String[] args) {
        Student student1 = new Student(1, "Name 1", 27);
        Student student2 = new Student(2, "Name 2", 22);
        Student student3 = new Student(3, "Name 3", 29);
        Student student4 = new Student(4, "Name 4", 23);
        Student student5 = new Student(5, "Name 5", 26);

        Exam exam = new Exam("შუალედური გამოცდა");
        exam.initGroups();

        exam.addStudent(ExamGroup.GROUP_1, student1);
        exam.addStudent(ExamGroup.GROUP_1, student2);
        exam.addStudent(ExamGroup.GROUP_1, student3);
        exam.addStudent(ExamGroup.GROUP_2, student4);
        exam.addStudent(ExamGroup.GROUP_2, student5);

        exam.printInfo();

        Map<ExamGroup, Double> averagePoints = exam.getAveragePoints();
        System.out.println(averagePoints);
    }
}
