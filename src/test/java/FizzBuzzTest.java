import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    //start < end
    @Test
    public void testStartLessThanEnd_HappyPath() {
        int start = 1;
        int end = 20;
        String [] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz",
                    "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};

        //FizzBazz fizzBuzz = new FizzBazz();

        String [] actualResult = new FizzBuzz().fizzBuzz(start, end);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //start == end
    @Test
    public void testStartEqualsEnd_HappyPath() {
        //AAA
        //arrange
        int start = 1;
        int end = 1;
        String [] expectedResult = {"1"};

        //act
        String [] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //start < end

    @Test
    public void testStartLessThanEnd_StartEndAreNegative_HappyPath() {
        int start = -20;
        int end = -1;
        String [] expectedResult = {"Buzz", "-19", "Fizz", "-17", "-16", "FizzBuzz", "-14", "-13", "Fizz", "-11",
                "Buzz", "Fizz", "-8", "-7", "Fizz", "Buzz", "-4", "Fizz", "-2", "-1"};

        //FizzBazz fizzBuzz = new FizzBazz();

        String [] actualResult = new FizzBuzz().fizzBuzz(start, end);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2.Negative testing
    //if start > end
    //return new String[0]
    @Test
    public void testStartGreatThanEnd_Negative() {
        int start = 20;
        int end = 1;
        String [] expectedResult = {};

        //FizzBazz fizzBuzz = new FizzBazz();

        String [] actualResult = new FizzBuzz().fizzBuzz(start, end);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
