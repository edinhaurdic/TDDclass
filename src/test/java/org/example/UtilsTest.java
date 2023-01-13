package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.* ;

public class UtilsTest {

   /* @Test
    @DisplayName("Det första Hello World Testet")
    public void hello_world_test(){

        //Given
        boolean bool= true;

        //When

        //Then
        assertFalse(bool, "variabeln var inte True");
    }*/

    @Test
    @DisplayName("A delat med B")
    public void divide_withEvenNumbers_shouldDivideEvenly(){

        //Given / Arrange
        int a = 10;
        int b = 5;

        //When / Act
        int result = Utils.divide(a , b);

        //Then / Assert
        assertEquals(2, result, "Testet gick igenom med resultatet blev fel");

    }

}
