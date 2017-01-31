import java.util.ArrayList;

/**
 * Created by ryangross on 1/31/17.
 */
public class Controller {
    private PetManagement aPetManagement = new PetManagement();
    private Display aDisplay = new Display();
    private PetFactory aPetFactory = new PetFactory();

    public Display getDisplay() {
        return this.aDisplay;
    }

    public PetManagement getPetManagement() {
        return this.aPetManagement;
    }

    public PetFactory getPetFactory() {
        return this.aPetFactory;
    }

    public int askUserForNumberOfPets() {
        getDisplay().displayNumber();
        int answer =  getDisplay().getScanner().nextInt();
        return answer;
    }

    public String askUserForPetName() {
        getDisplay().displayName();
        String answer = getDisplay().getScanner().next();
        return answer;
    }

    public String askUserForPetType() {
        getDisplay().displayType();
        String answer = getDisplay().getScanner().next();
        return answer;
    }


    public void askUserForPetInfo() {
        int number = askUserForNumberOfPets();

        for(int i = 0; i < number; i++) {
            String name = askUserForPetName();
            String type = askUserForPetType();
            getPetManagement().addPetToList(getPetFactory().makeAPet(name, type));
        }
    }

    public void run() {
        askUserForPetInfo();
        getDisplay().displayAllPets(getPetManagement());
    }


}
