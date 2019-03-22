package design_pattern.jtee.data_access_object_pattern;

import design_pattern.jtee.data_access_object_pattern.entity.Student;
import design_pattern.jtee.data_access_object_pattern.impl.StudentDaoImpl;
import design_pattern.jtee.data_access_object_pattern.dao.StudentDao;

public class DaoPatternDemo {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        //输出所有的学生
        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    +student.getRollNo()+", Name : "+student.getName()+" ]");
        }


        //更新学生
        Student student =studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        //获取学生
        studentDao.getStudent(0);
        System.out.println("Student: [RollNo : "
                +student.getRollNo()+", Name : "+student.getName()+" ]");
    }
}
