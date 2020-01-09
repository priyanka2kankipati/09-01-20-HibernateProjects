package hbn;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity	
@Table(name="employee")//table name in db
//when parameters are declared in this class the table is created by the xml file
public class Employee {//class name=table name in db
	@Id//=>empcode is primary id
	private int empcode;
	@Column(length=25)//=>empname is a column whose length is customizable
	private String empname;
	@Column//=>salary is a column in the table
	private double salary;
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
