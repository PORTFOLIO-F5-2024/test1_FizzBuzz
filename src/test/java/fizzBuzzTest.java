import org.TBMA.FizzBuzz;
import org.junit.jupiter.api.DisplayName;
import  org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class fizzBuzzTest<fizzbuzz> {
    @Test
    @DisplayName("Test si el número es divisible por 3")
    void test_whenTheNUmberIsDivisibleByThree_thenReturnFizz(){
        //  GIVEN DADO
        FizzBuzz fizzBuzz = new FizzBuzz();
        //  WHEN CUANDO
        String result= fizzBuzz.checkNumber(9);
        //  THEN PUES
        assertEquals("Fizz", result);
    }

    @Test
    @DisplayName("Test si el número es divisible por 5")
    void test_whenTheNUmberIsDivisibleByFive_thenReturnBuzz(){
        //  GIVEN DADO
        FizzBuzz fizzBuzz = new FizzBuzz();
        //  WHEN CUANDO
        String result = fizzBuzz.checkNumber(10);
        //  THEN PUES
        assertEquals("Buzz", result);
    }

    @Test
    @DisplayName("Test si el número es divisible por 3 y por 5")
    void test_whenTheNUmberIsDivisibleByFiveAndThree_thenReturnFizzBuzz(){
        //  GIVEN DADO
        FizzBuzz fizzBuzz = new FizzBuzz();
        //  WHEN CUANDO
        String result = fizzBuzz.checkNumber(15);
        //  THEN PUES
        assertEquals("FizzBuzz", result);
    }

    @Test
    @DisplayName("Test si el número NO es divisible por 3 y por 5")
    void test_whenTheNUmberIsNotDivisibleByFiveAndThree_thenReturnFizzBuzz(){
        //  GIVEN DADO
        FizzBuzz fizzBuzz = new FizzBuzz();
        //  WHEN CUANDO
        String result = fizzBuzz.checkNumber(8);
        //  THEN PUES
        assertEquals("8", result);
    }
}
