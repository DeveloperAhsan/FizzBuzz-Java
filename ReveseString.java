import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please Enter a Text That you want to revese: ");
            String userInput = scanner.nextLine();
            /*
            if you click exit the program will end
            */
            if(userInput.toLowerCase().equals("exit")){
                break;
            }
            String revString = reverse(userInput);
            System.out.println(revString);
        }
        System.out.println("Program Ended...");
    }

    public static String reverse(String args) {
        StringBuilder sb = new StringBuilder(args.length());
        for (int i = args.length()-1; i >= 0; i--) {
            sb.append(args.charAt(i));
        }
        String revString = sb.toString();
        return revString;
    }
}
