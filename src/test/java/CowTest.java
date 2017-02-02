import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ryangross on 1/31/17.
 */
public class CowTest {
    Cow aCow;
    Cow bCow;

    @Before
    public void setUp() {
        aCow = new Cow();
        bCow = new Cow();
        aCow.setName("Agatha");
        bCow.setName("Agatha");
    }

    @Test
    public void speakTest() {
        Assert.assertEquals("Moo", aCow.speak());
        Assert.assertEquals(0, aCow.compareTo(bCow));
    }
}
