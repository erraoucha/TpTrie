package com.example.yassineehtp;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person implements Comparable<Person> {
	private String lastName;
	private String firstName;

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