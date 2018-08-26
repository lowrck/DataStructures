
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean done = false;
        Scanner input = new Scanner(System.in);
        while(done != true) {
            System.out.println("Please enter file address: ");
            File inputFile = new File(input.next());
            // Inputs
            try {
                Scanner file = new Scanner(inputFile);
            } catch (Exception ex) {
                System.out.println("The file address is invalid please enter a valid path");
                continue;
            }
        done = true;
        }








    }
}
