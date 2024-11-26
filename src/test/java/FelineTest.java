import com.example.Feline;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    @Test
    public void eatMeatReturnsValidList() throws Exception {
        Feline feline = new Feline();
        List<String> expectedResult = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        assertEquals("eatMeat() возвращает корректный список", expectedResult, actualResult);
    }

    @Test
    public void getFamilyReturnsValidString() {
        Feline feline = new Feline();
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals("getFamily() возвращает корректное значение", expectedResult, actualResult);
    }

    @Test
    public void getKittensWithoutArgumentsReturnsValidCount() {
        Feline feline = new Feline();
        int expectedResult = 1;
        int actualResult = feline.getKittens();
        assertEquals("getKittens() возвращает корректное значение", expectedResult, actualResult);
    }
}
