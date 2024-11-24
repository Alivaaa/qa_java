import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParamsTest {
    @Parameterized.Parameter()
    public int kittensCount;
    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters(name = "Kittens count: {0}; Expected result: {1}")
    public static Object[][] params() {
        return new Object[][]{
                {1, 1},
                {2, 2},
                {0, 0},
        };
    }

    @Test
    public void getKittensWithArgumentsReturnsValidCount() {
        Feline feline = new Feline();
        int actualResult = feline.getKittens(kittensCount);
        assertEquals("getKittens() возвращает корректное значение", expectedResult, actualResult);
    }
}
