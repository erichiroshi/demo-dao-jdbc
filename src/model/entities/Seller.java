package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable {

	private Integer id;
	private String name;
	private String email;
	private Date birthDate;
	private double baseSalary;

	private Department department;

	public Seller(Integer id, String name, String email, Date birthDate, double baseSalary, Department department) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + email + ", " + birthDate + ", " + baseSalary + ", " + department;
	}

}
