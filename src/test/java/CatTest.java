import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ryangross on 1/31/17.
 */
public class CatTest {
    Cat aCat;
    Cat bCat;
    Dog aDog;

    @Before
    public void setUp() {
        aCat = new Cat();
        bCat = new Cat();
        aDog = new Dog();
        aCat.setName("A");
        bCat.setName("B");
        aDog.setName("derp");
    }

    @Test
    public void speakTest() {
        Assert.assertEquals("Meow", aCat.speak());
    }

    @Test
    public void compareToTest() {
        Assert.assertEquals(-1, aCat.compareTo(bCat));
        Assert.assertTrue( aDog.compareTo(aCat) > 1);
    }
}
