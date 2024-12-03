package ru.example.City.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ru.example.City.entity.Person;
import ru.example.City.entity.PersonId;

public interface PersonRepository extends JpaRepository<Person, PersonId>{
	@Query("SELECT p FROM Person p WHERE p.cityOfLiving = :city")
	List<Person> getPersonsByCity(String city);
	
}
