package by.htp.wu.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import by.htp.wu.bean.Instructor;
import by.htp.wu.bean.Student;
import by.htp.wu.bean.StudentRegistrationData;
import by.htp.wu.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/main-page")
	public String goToMainPage() {
		return "main-page";
	}

	@RequestMapping("/authorization-form")
	public String showAuthorizationForm() {
		return "authorization-form";
	}

	@RequestMapping("/authorization")
	public String authorization(@RequestParam("login") String login) {
		System.out.println(login);
		return "";
	}

	@RequestMapping("list-student")
	public String listStudent(Model model) {

		List<Student> list = userService.takeStudents();
		model.addAttribute("students", list);

		return "list-student";
	}

	@RequestMapping("delete-student")
	public String deleteStudent(@RequestParam("IdStudent") int idStudent) {

		userService.deleteStudent(idStudent);

		return "redirect:/list-student";
	}

	@RequestMapping("list-instructor")
	public String listInstructor(Model model) {

		List<Instructor> instructors = userService.takeInstructors();
		model.addAttribute("instructors", instructors);

		return "list-instructor";
	}

	@RequestMapping("/save-student")
	public String saveStudent(@Valid @ModelAttribute("student") StudentRegistrationData student, BindingResult bind) {

		if (bind.hasErrors()) {
			return "registration-form-student";
		} else {
			userService.saveStudent(student);
			return "student";
		}

	}

	@RequestMapping("/registration-student")
	public String registrationStudent(Model model) {
		StudentRegistrationData student = new StudentRegistrationData();
		model.addAttribute("student", student);

		return "registration-form-student";
	}

	@RequestMapping("/form-update-student")
	public String showFormUpdateStudent(@RequestParam("IdStudent") int idStudent, Model model) {

		Student student = userService.getStudent(idStudent);
		model.addAttribute("student", student);

		return "form-update-student";
	}

	@RequestMapping("/update-student")
	public String updateStudent(@ModelAttribute("student") Student student) {

		userService.updateStudent(student);

		return "redirect:/list-student";
	}

}
