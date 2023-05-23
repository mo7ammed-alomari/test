import java.util.*;
class Main {
    /**
     Write a java program that validates if a string read from the console is a valid floating-point number
     (e.g., 22.01, 2.0, 33, 0.4, .5 are all valid)
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String s =read.nextLine();
        System.out.println(s.matches("\\d+|\\d*\\w[.]\\d+|.\\d+"));

//add method returns the max int between two int numbers
        int x=5;
        int y=7;
        System.out.print(x==y);
    }
}