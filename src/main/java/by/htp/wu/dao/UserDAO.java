package by.htp.wu.dao;

import java.util.List;

import by.htp.wu.bean.Instructor;
import by.htp.wu.bean.Student;
import by.htp.wu.bean.StudentRegistrationData;

public interface UserDAO {

	public List<Student> takeStudents();
	public void deleteStudent(int idStudent);
	public List<Instructor> takeInstructors();
	public void saveStudent(StudentRegistrationData student);
	public Student getStudent(int idStudent);
	public void updateStudent(Student student);

}
