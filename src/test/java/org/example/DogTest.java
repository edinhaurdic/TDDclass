package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DogTest {

    @Test
    public void constructor_withProperties_shouldExistWithProperties(){

        //given
        Dog dog;

        //when
        dog = new Dog(12, "Boxy");
        int age = dog.getAge();
        String name = dog.getName();

        //then
        assertAll(
                () -> assertNotNull(dog),
                () -> assertEquals(12, age),
                () -> assertEquals("Boxy", name),
                () -> assertEquals(new Dog(12, "Boxy"), dog)
        );




    }

}
