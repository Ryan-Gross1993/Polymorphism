import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ryangross on 1/31/17.
 */
public class CatTest {
    Cat aCat;

    @Before
    public void setUp() {
        aCat = new Cat();
    }

    @Test
    public void speakTest() {
        Assert.assertEquals("Meow", aCat.speak());
    }
}
