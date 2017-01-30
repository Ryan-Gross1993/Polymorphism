import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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


}
