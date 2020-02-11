package by.htp.wu.service;

import java.util.List;

import by.htp.wu.bean.Instructor;
import by.htp.wu.bean.Student;
import by.htp.wu.bean.StudentRegistrationData;

public interface UserService {
	 
	public List<Student> takeStudents();
	public void deleteStudent(int idStudent);
	public List<Instructor> takeInstructors();
	public void saveStudent(StudentRegistrationData student);
	public Student getStudent(int idStudent);
	public void updateStudent(Student student);
	
}
