package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

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

    @Test
    public void reverse_withInteger_shouldReverseList() {

        //Given
        List<Integer> numbers = List.of(1, 2, 3);

        //WHen
        List<Integer> reversedNumbers = Utils.reverse(numbers);

        //Then
        assertIterableEquals(List.of(3, 2, 1), reversedNumbers, "Listan gick igenom");
        // assertSame(List.of(3, 2, 1), reversedNumbers); funkar ej, inte samma på samam plats, bara samma innehåll
    }

}
