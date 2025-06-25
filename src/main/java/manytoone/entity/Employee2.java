package manytoone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee2 {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	
	@ManyToOne
	private Department1 department1;
	
	public Employee2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee2(String name) {
		super();
		this.name = name;
	}
	public Employee2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Department1 getDepartment1() {
		return department1;
	}
	public void setDepartment1(Department1 department1) {
		this.department1 = department1;
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
	
	
}
