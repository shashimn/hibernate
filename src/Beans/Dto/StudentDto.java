package Beans.Dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="student1")
public class StudentDto  {
	@Id
	@GenericGenerator(name="dj",strategy="increment")
	@GeneratedValue(generator="dj")
	@Column(name="c_id")
	private int id;
	@Column(name="c_name")
	private String name;
	@Column(name="c_email")
	private String email;
	@Column(name="c_marks")
	private int marks;
	
	public StudentDto(){
		System.out.println("StudentDTO object created..");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmil() {
		return email;
	}
	public void setEmil(String emil) {
		this.email = emil;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}