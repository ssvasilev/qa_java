import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    Feline feline;

    @Test
    public void eatMeatReturnsPredatorMeal() throws Exception {

        Mockito.when(feline.getFood("Хищник")).thenReturn (List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(feline.eatMeat(), List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void getFamilyReturnsFelines() {
        Feline feline = new Feline();
        Assert.assertEquals(feline.getFamily(), "Кошачьи");
    }

    @Test
    public void getKittensReturnOneCount(){
        Feline feline = new Feline();
        Assert.assertEquals(feline.getKittens(), 1);

    }

    @Test
    public void  getKittensReturnRandomCount() {
        Feline feline = new Feline();
        int randomCount = (int) (Math.random() * 200); //Задаём случайное число котят
        Assert.assertEquals(feline.getKittens(randomCount), randomCount); //Проверяем, что количество котят не изменилось.
    }

}
