package model.entities;

import java.io.Serializable;

public class Department implements Serializable {

	private int id;
	private String name;

	public Department(int id, String name) {
		this.id = id;
		this.name = name;
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
		Department other = (Department) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return id + ", " + name;
	}

	public int getId() {
		return id;
	}

}
