import java.util.Scanner;

/**
 * Created by ryangross on 1/30/17.
 */
public class UserIO {
    Scanner sc = new Scanner(System.in);

    public String pickPet() {
        String answer = "";
        System.out.println("How many pets do you have?");
        answer = sc.next();
        return answer;
    }

}
