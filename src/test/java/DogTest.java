import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ryangross on 1/31/17.
 */
public class DogTest {
    Dog aDog;
    Dog bDog;

    @Before
    public void setUp() {
        aDog = new Dog();
        bDog = new Dog();
        aDog.setName("Doge");
        bDog.setName("Charlie");

    }

    @Test
    public void speakTest() {
        Assert.assertEquals("Bork", aDog.speak());
        Assert.assertEquals(1, aDog.compareTo(bDog));

    }

}
