package ge.edu.btu.exam;

import java.util.Map;

public interface IExam {

    void initGroups();

    void addStudent(ExamGroup group, Student student);

    Map<ExamGroup, Double> getAveragePoints();

    void printInfo();
}
