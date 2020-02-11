package by.htp.wu.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name="student")
public class StudentRegistrationData {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@NotEmpty(message="is required")
	@Column(name="login")
	private String login;
	@NotEmpty(message="is required")
	@Column(name="password")
	private String password;
	@NotEmpty(message="is required")
	@Column(name="name")
	private String name;
	@NotEmpty(message="is required")
	@Column(name="surname")
	private String surname;
	@NotEmpty(message="is required")
	@Column(name="email")
	private String email;
	
	public StudentRegistrationData() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "StudentRegistrationData [id=" + id + ", login=" + login + ", password=" + password + ", name=" + name
				+ ", surname=" + surname + ", email=" + email + "]";
	}
	
	

}
