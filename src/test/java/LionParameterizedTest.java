import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class LionParameterizedTest {

    private String sex;
    private boolean expected;

    public LionParameterizedTest(String sex, boolean expected){
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeReturnHasMane() throws Exception {
        Lion lion = new Lion(sex);
        assertEquals(expected, lion.doesHaveMane());
    }
}