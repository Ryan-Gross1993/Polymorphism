/**
 * Created by ryangross on 1/31/17.
 */
public class PetFactory {

    public Pet makeAPet(String aName, String aType) {
        switch (aName) {
            case "dog":
                Dog dog = new Dog();
                dog.setName(aName);
                return dog;

            case "cat":
                Cat cat = new Cat();
                cat.setName(aName);
                return cat;
            case "cow":
                Cow cow = new Cow();
                cow.setName(aName);
                return cow;
            default:
                Cat aCat = new Cat();
                aCat.setName(aName);
                return aCat;
        }
    }
}
