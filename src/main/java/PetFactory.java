/**
 * Created by ryangross on 1/31/17.
 */
public class PetFactory {

    public Pet makeAPet(String aName, String aType) {
        Pet aPet;
        switch (aType) {
            case "dog":
                aPet = new Dog();
                break;
            case "cat":
                aPet = new Cat();
                break;
            case "cow":
                aPet = new Cow();
                break;
            default:
                aPet = new Cat();
        }
        aPet.setName(aName);
        return aPet;
    }
}
