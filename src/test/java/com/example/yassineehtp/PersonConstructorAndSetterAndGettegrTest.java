package com.example.yassineehtp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PersonConstructorAndSetterAndGettegrTest {

    @Test
    public void testConstructorAndGetters() {
        // Création d'une instance de Person
        Person person = new Person("Doe", "John");

        // Test des getters
        assertEquals("Doe", person.getLastName());
        assertEquals("John", person.getFirstName());
    }

    @Test
    public void testCompareTo_DifferentLastName() {
        // Création de deux personnes avec des noms de famille différents
        Person person1 = new Person("Smith", "Alice");
        Person person2 = new Person("Doe", "John");

        // Test de comparaison
        assertTrue(person1.compareTo(person2) > 0);
        assertTrue(person2.compareTo(person1) < 0);
    }

    @Test
    public void testCompareTo_SameLastName() {
        // Création de deux personnes avec le même nom de famille mais des prénoms
        // différents
        Person person1 = new Person("Doe", "Alice");
        Person person2 = new Person("Doe", "John");

        // Test de comparaison
        assertTrue(person1.compareTo(person2) < 0);
        assertTrue(person2.compareTo(person1) > 0);
    }

    @Test
    public void testToString() {
        // Création d'une instance de Person
        Person person = new Person("Doe", "John");

        // Test de la méthode toString
        assertEquals("Doe, John", person.toString());
    }

}
