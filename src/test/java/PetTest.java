import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

<<<<<<< HEAD
/**
 * Created by ryangross on 1/30/17.
 */
public class PetTest {
    Cat kitty;
    Dog doge;
    Snake snek;

    @Before
    public void setUp() {
        kitty = new Cat();
        doge = new Dog();
        snek = new Snake();
    }

    @Test
    public void speakTest() {
        Assert.assertEquals("I am a sneaky snek", snek.speak());
        Assert.assertEquals("Meow.", kitty.speak());
        Assert.assertEquals("Bork, bork, bork.", doge.speak());
    }


=======
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ryangross on 2/1/17.
 */
public class PetTest {
    Dog aDog;
    Dog bDog;
    Cat aCat;
    ArrayList<Pet> test = new ArrayList<Pet>();

    @Before
    public void setUp() {
        aDog = new Dog();
        bDog = new Dog();
        aCat = new Cat();
        aDog.setName("Bobby");
        bDog.setName("Bobby");
        aCat.setName("Jimmy");
        test.add(aCat);
        test.add(aDog);
        test.add(bDog);
        Collections.sort(test);

    }

    @Test
    public void compareToTest() {
        Assert.assertEquals(0, aDog.compareTo(bDog));
        Assert.assertTrue(aCat.compareTo(bDog) < 1);
        Assert.assertEquals(aCat, test.get(0));
        Assert.assertEquals(aDog, test.get(1));
        Assert.assertEquals(bDog, test.get(2));

    }
>>>>>>> backup
}
