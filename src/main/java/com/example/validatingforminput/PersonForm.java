package com.example.validatingforminput;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

// This is the PersonForm Object.
public class PersonForm {

//	Has two attributesL name and age
	@NotNull
	@Size(min=2, max=30)
	private String name;

	@NotNull
	@Min(18)
	private Integer age;

//	getter and setters for the two attributes
	public String getName() {

		return this.name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public Integer getAge() {

		return age;
	}

	public void setAge(Integer age) {

		this.age = age;
	}

//	And a toString method. Look familiar??
	public String toString() {

		return "Person(Name: " + this.name + ", Age: " + this.age + ")";
	}
}
