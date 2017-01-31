import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ryangross on 1/31/17.
 */
public class DogTest {
    Dog aDog;

    @Before
    public void setUp() {
        aDog = new Dog();
    }

    @Test
    public void speakTest() {
        Assert.assertEquals("Bork", aDog.speak());
        Assert.assertFalse(aDog.speak().equals("Moo"));
    }

}
