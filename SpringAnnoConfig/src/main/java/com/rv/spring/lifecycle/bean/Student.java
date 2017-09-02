package com.rv.spring.lifecycle.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	private String name;
	private Integer age;
	private Address address;
	private Bio bio;
	@Autowired
	@Qualifier("adhar1")
	private Adhar adhar;

	public Student(Bio bio) {
		// TODO Auto-generated constructor stub
		this.bio = bio;
	}

	public Bio getBio() {
		return bio;
	}

	// public void setBio(Bio bio) {
	// this.bio = bio;
	// }

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", adhar=" + adhar + "]";
	}

	public Address getAddress() {
		return address;
	}

	public Adhar getAdhar() {
		return adhar;
	}

	// public void setAdhar(Adhar adhar) {
	// this.adhar = adhar;
	// }

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	@Required
	public void setAge(Integer age) {
		this.age = age;
	}

}
