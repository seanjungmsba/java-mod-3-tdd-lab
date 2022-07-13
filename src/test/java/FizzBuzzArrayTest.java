import org.junit.jupiter.api.BeforeEach;
import src.main.java.FizzBuzzArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzArrayTest {

    FizzBuzzArray fizzBuzzArrayTester;
    @BeforeEach
    void setUp() {
        fizzBuzzArrayTester = new FizzBuzzArray();
    }
    @Test
    void startsWithFShouldReturnFizz() {
        String[] startsWithF = {"friday","fast","frankly"};
        String[] expected = {"Fizz","Fizz","Fizz"};
        String[] test = fizzBuzzArrayTester.fizzBuzzString(startsWithF);
        assertArrayEquals(expected, test);
    }
    @Test
    void endsWithBShouldReturnBuzz() {
        String[] endWithB = {"bathtub","climb","comb"};
        String[] expected = {"Buzz","Buzz","Buzz"};
        String[] test = fizzBuzzArrayTester.fizzBuzzString(endWithB);
        assertArrayEquals(expected, test);
    }
    @Test
    void startsWithFAndEndsWithBShouldReturnFizzBuzz() {
        String[] startsWithFAndEndsWithB = {"firebomb","flashbulb","flub"};
        String[] expected = {"FizzBuzz","FizzBuzz","FizzBuzz"};
        String[] test = fizzBuzzArrayTester.fizzBuzzString(startsWithFAndEndsWithB);
        assertArrayEquals(expected, test);
    }
    @Test
    void neitherStartWithFNorEndsWithBShouldReturnEmptyString() {
        String[] neitherStartsWithFNorEndsWithB = {"other","bravo","topdog"};
        String[] expected = {"","",""};
        String[] test = fizzBuzzArrayTester.fizzBuzzString(neitherStartsWithFNorEndsWithB);
        assertArrayEquals(expected, test);
    }
    @Test
    void emptyStringShouldReturnNull() {
        String[] nullArray = {};
        assertNull(fizzBuzzArrayTester.fizzBuzzString(nullArray));
    }

}