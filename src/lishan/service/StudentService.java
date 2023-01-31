package lishan.service;

import lishan.pojo.Student;

import java.util.List;

public interface StudentService {
    void init(List<Student> students);

    void add(List<Student> students);

    void select(List<Student> students);

    void update(List<Student> students);

    void delete(List<Student> students);
}
