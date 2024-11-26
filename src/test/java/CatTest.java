import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private Feline feline;
    private Cat cat;

    @Before
    public void setUp() {
        feline = Mockito.mock(Feline.class);
        cat = new Cat(feline);
    }

    @Test
    public void getSoundReturnsValidString() {
        String expectedResult = "Мяу";
        String actualResult = cat.getSound();
        assertEquals("getSound() возвращает корректное значение", expectedResult, actualResult);
    }

    @Test
    public void getFood() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expectedResult = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualResult = cat.getFood();
        assertEquals("getFood should return valid list", expectedResult, actualResult);
    }
}
