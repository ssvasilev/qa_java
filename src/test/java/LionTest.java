import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensReturnOne() {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getKittens()).thenReturn (1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodReturnPredator() throws Exception {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    //Тест на то, что метод кинет исключение
    @Test(expected = Exception.class)
    public void getTrowExceptionLionSex()throws Exception {
        Lion lion = new Lion("Неопознан");
    }
}
