import java.util.Scanner;

//class used to get user input
public class UserInputs {

    Scanner scan = new Scanner(System.in);

    //get string from user
    public String getInput(){
        String line = "";
        line = scan.nextLine();

        return line;
    }
}
