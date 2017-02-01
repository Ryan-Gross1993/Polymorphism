import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ryangross on 1/31/17.
 */
public class CatTest {
    Cat aCat;
    Cat bCat;
    Dog fuck;

    @Before
    public void setUp() {
        aCat = new Cat();
        bCat = new Cat();
        aCat.setName("A");
        bCat.setName("B");
        fuck.setName("derp");
    }

    @Test
    public void speakTest() {
        Assert.assertEquals("Meow", aCat.speak());
    }

    @Test
    public void compareToTest() {
        Assert.assertEquals(-1, aCat.compareTo(bCat));
        Assert.assertEquals(1, fuck.compareTo(aCat));
    }
}
