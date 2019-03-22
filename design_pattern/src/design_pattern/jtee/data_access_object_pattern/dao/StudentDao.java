package design_pattern.jtee.data_access_object_pattern.dao;

import design_pattern.jtee.data_access_object_pattern.entity.Student;
import java.util.List;

public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
