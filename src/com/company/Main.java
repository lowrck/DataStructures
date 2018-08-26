
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //variables
        boolean done1 = false, done2 = false, done3 = false;
        int ic = 0;
        int totalnums = 0;
        int[] intin = new int[5000];
        int[] intout = new int[5000];
        String userName;
        String outputString = "";
        //Scanners
        Scanner input = new Scanner(System.in);
        Scanner s = null;
        File inputFile = null;
        File outputFile = null;

//idiotproof path validation
        while(done1 != true) {
            System.out.println("Please enter file address: ");
            inputFile = new File(input.next());
            // Inputs
            try {
                Scanner file = new Scanner(inputFile);
            } catch (Exception ex) {
                System.out.println("The file address is invalid please enter a valid path");
                continue;
            }
        done1 = true;
        }
       //Scan in all the numbers from the specified files
        s = new Scanner(inputFile);
        while (s.hasNextInt()) {
            intin[ic] = s.nextInt();
            ic++;
        }
        //create file and printwriter
        userName = userName();
        outputFile = new File(userName + "Numbers.txt");
        java.io.PrintWriter cout = new java.io.PrintWriter(outputFile);
        //output numbers to file
        totalnums = numSort(intin, intout);
        System.out.println("Number of matching items: " + totalnums);
        for(int i = 0; i < intout.length; i++) {
            if(intout[i] != 0) {
                cout.print(intout[i]);
            }
            if(i < totalnums - 1) {
                cout.print("\n");
            }


        }

        cout.close();








    }
// Method to pass a user determined signed integer from one array to another
    static int numSort(int[] input, int[] output){
        Scanner in = new Scanner(System.in);
        int counterOutput = 0;
        System.out.println("Enter 1 for all positive, enter 2 for all negative");
        int menu = in.nextInt();
        for(int i = 0; i < input.length; i++){
            if(menu == 1) { if(input[i] > 0) { output[counterOutput++] = input[i]; } }
            else if(menu == 2) { if(input[i] < 0) { output[counterOutput++] = input[i]; } }
            else{ i--;
            System.out.println(
                    menu + " is not a valid menu option please enter 1 for all positive, or 2 for all negative");
            menu = in.nextInt();
            }
        } return counterOutput;
    }
    //Generate username and output as string using nice user input
    static String userName() {
        Scanner in = new Scanner(System.in);
        String firstName;
        String lastName;
        System.out.println("Please enter your name with space between first and last name");
        firstName = in.next();
        lastName = in.next();
        System.out.println( "Your name is: " + firstName + lastName);
        return firstName+lastName;
    }
}
