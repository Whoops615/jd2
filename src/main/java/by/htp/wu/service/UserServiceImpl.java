package by.htp.wu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.htp.wu.bean.Instructor;
import by.htp.wu.bean.Student;
import by.htp.wu.bean.StudentRegistrationData;
import by.htp.wu.dao.UserDAO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao;

	@Transactional
	public List<Student> takeStudents() {
		List<Student> list = userDao.takeStudents();
		return list;
	}

	@Transactional
	public void deleteStudent(int idStudent) {
		userDao.deleteStudent(idStudent);
	}

	@Transactional
	public List<Instructor> takeInstructors() {
		return userDao.takeInstructors();
	}

	@Transactional
	public void saveStudent(StudentRegistrationData student) {
		userDao.saveStudent(student);

	}

	@Transactional
	public Student getStudent(int idStudent) {

		return userDao.getStudent(idStudent);
		
	}
	@Transactional
	public void updateStudent(Student student) {
		
		userDao.updateStudent(student);
		
	}

}
