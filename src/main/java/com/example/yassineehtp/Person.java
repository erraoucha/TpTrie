package com.example.yassineehtp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Person implements Comparable<Person> {
	private String lastName;
	private String firstName;

	public Person(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	@Override
	public int compareTo(Person other) {
		int lastNameComparison = this.lastName.compareTo(other.lastName);
		if (lastNameComparison != 0) {

			return lastNameComparison; // Tri par nom de famille
		} else {
			return this.firstName.compareTo(other.firstName); // Tripar prénom en cas de noms identiques
		}
	}

	@Override
	public String toString() {
		return lastName + ", " + firstName;
	}
}