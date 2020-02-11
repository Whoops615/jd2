package by.htp.wu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.htp.wu.bean.Instructor;
import by.htp.wu.bean.Student;
import by.htp.wu.bean.StudentRegistrationData;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public List<Student> takeStudents() {

		Session currentSession = sessionFactory.getCurrentSession();
		Query<Student> theQuery = currentSession.createQuery("from Student", Student.class);
		List<Student> students = theQuery.getResultList();

		return students;
	}

	public void deleteStudent(int idStudent) {

		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete Student where id=:idStudent");
		query.setParameter("idStudent", idStudent);
		query.executeUpdate();

	}

	public List<Instructor> takeInstructors() {

		Session currentSession = sessionFactory.getCurrentSession();
		Query<Instructor> theQuery = currentSession.createQuery("from Instructor", Instructor.class);
		List<Instructor> instructors = theQuery.getResultList();

		return instructors;
	}

	public void saveStudent(StudentRegistrationData student) {

		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(student);

	}

	public Student getStudent(int idStudent) {
		
		Session session = sessionFactory.getCurrentSession();
		Student student = session.get(Student.class, idStudent);
		
		return student;
		
	}

	public void updateStudent(Student student) {
		
		Session session = sessionFactory.getCurrentSession();
		session.update(student);
		
	}

}
