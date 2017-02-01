import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ryangross on 1/31/17.
 */
public class CowTest {
    Cow aCow;

    @Before
    public void setUp() {
        aCow = new Cow();
    }

    @Test
    public void speakTest() {
        Assert.assertEquals("Moo", aCow.speak());
    }
}
