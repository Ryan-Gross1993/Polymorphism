import java.util.Scanner;

/**
 * Created by ryangross on 1/31/17.
 */
public class Display {
    private Scanner aScanner = new Scanner(System.in);


    public Scanner getScanner() {
        return aScanner;
    }

    public void displayType() {
        System.out.println("What kind of pet is it?");
    }

    public void displayNumber() {
        System.out.println("How many pets do you have?");
    }

    public void displayName() {
        System.out.println("What's the pet's name?");
    }

    public void displayPet(Pet aPet) {
        System.out.println("Your pet " + aPet.getName() + " is a " + aPet.getClass().getSimpleName() + "\n" +
                aPet.getName() + " says, " + aPet.speak());
    }

    public void displayAllPets(PetManagement aPetManagement) {
        for(int i = 0 ; i < aPetManagement.getAllPets().size(); i++) {
            displayPet(aPetManagement.getAllPets().get(i));
        }
    }
}
