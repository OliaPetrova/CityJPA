package ru.example.City.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "PERSONS")
@IdClass(PersonId.class)
public class Person {

	@Id
	private String name;

	@Id
	private String surname;

	@Id
	private int age;

	@Column(name = "phone_number", nullable = false)
	private String phoneNumber;

	@Column(name = "city_of_living", nullable = false)
	private String cityOfLiving;

	public Person(String name, String surname, int age, String phoneNumber, String cityOfLiving) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.cityOfLiving = cityOfLiving;
	}

	public Person() {
		// TODO Auto-generated constructor stub
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCityOfLiving() {
		return cityOfLiving;
	}

	public void setCityOfLiving(String cityOfLiving) {
		this.cityOfLiving = cityOfLiving;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, cityOfLiving, name, phoneNumber, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(cityOfLiving, other.cityOfLiving) && Objects.equals(name, other.name)
				&& Objects.equals(phoneNumber, other.phoneNumber) && Objects.equals(surname, other.surname);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", age=" + age + ", phoneNumber=" + phoneNumber
				+ ", cityOfLiving=" + cityOfLiving + "]";
	}
	
	
	
}
