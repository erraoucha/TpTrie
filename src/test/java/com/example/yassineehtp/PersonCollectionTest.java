package com.example.yassineehtp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import lombok.Builder;

public class PersonCollectionTest {

        @Test
        public void testSortPerson() {
                List<Person> people = new ArrayList<>();
                people.add(Person.builder().firstName("Hamid").lastName("Jamila").build());
                people.add(Person.builder().firstName("Martin").lastName("Bob").build());
                people.add(Person.builder().firstName("Hamid").lastName("Charles").build());
                people.add(Person.builder().firstName("Bernard").lastName("Charles").build());

                Collections.sort(people);

                assertThat(people.get(0))
                                .isEqualTo(Person.builder().firstName("Martin").lastName("Bob").build());
                assertThat(people.get(1))
                                .isEqualTo(Person.builder().firstName("Bernard").lastName("Charles").build());
                assertThat(people.get(2))
                                .isEqualTo(Person.builder().firstName("Hamid").lastName("Charles").build());
                assertThat(people.get(3))
                                .isEqualTo(Person.builder().firstName("Hamid").lastName("Jamila").build());

        }

}