package ge.edu.btu.exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exam implements IExam {

    private String name;

    private Map<ExamGroup, List<Student>> studentsMap = new HashMap<>();

    public Exam() {}

    public Exam(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void initGroups() {
        for (ExamGroup group : ExamGroup.values()) {
            studentsMap.put(group, new ArrayList<>());
        }
    }

    @Override
    public void addStudent(ExamGroup group, Student student) {
        studentsMap.get(group).add(student);
    }

    @Override
    public Map<ExamGroup, Double> getAveragePoints() {
        Map<ExamGroup, Double> averagePoints = new HashMap<>();
        for (ExamGroup group : studentsMap.keySet()) {
            List<Student> students = studentsMap.get(group);
            double sum = 0.0;
            for (Student student : students) {
                sum = sum + student.getPoint();
            }
            double average = 0.0;
            if (!students.isEmpty()) {
                average = sum / students.size();
            }
            averagePoints.put(group, average);
        }
        return averagePoints;
    }

    @Override
    public void printInfo() {
        for (ExamGroup group : studentsMap.keySet()) {
            System.out.println("ჯგუფი: " + group);
            for (Student student : studentsMap.get(group)) {
                System.out.println(student.getName() + ": " + student.getPoint());
            }
            System.out.println("----------------------------------------------");
        }
    }
}
