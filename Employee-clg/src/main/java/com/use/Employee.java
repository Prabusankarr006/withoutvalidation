package com.use;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name="employeedata")
	public class Employee{
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		int id;
	
		String name;
		float salary;
		
		public Employee(String name,float salary) {
			super();
			this.name=name;
			this.salary=salary;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}

	}


