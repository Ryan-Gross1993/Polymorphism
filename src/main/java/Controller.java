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
        System.out.println("How many pets do you have?");

        int answer =  getDisplay().getScanner().nextInt();
        return answer;
    }

    public String askUserForPetName() {
        System.out.println("What's the pet's name?");
        String answer = getDisplay().getScanner().next();
        return answer;
    }

    public String askUserForPetType() {
        System.out.println("What kind of pet is it?");
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

    public void displayPet(Pet aPet) {
        System.out.println("Your pet " + aPet.getName() + " is a " + aPet.getClass().getSimpleName() + "\n" +
                            aPet.getName() + " says, " + aPet.speak());
    }

    public void displayAllPets() {
        for(int i = 0 ; i < getPetManagement().getAllPets().size(); i++) {
            displayPet(getPetManagement().getAllPets().get(i));
        }
    }

    public void run() {
        askUserForPetInfo();
        displayAllPets();
    }


}
