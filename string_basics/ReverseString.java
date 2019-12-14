package string_basics;

import java.util.Scanner;

public class ReverseString {
    public static void main(String args[]){
        String ch;

        do {
            System.out.println("Enter thatishe string to the reverse activity:::=> ");
            Scanner sc = new Scanner(System.in);
            String source = sc.next();
            String reverse = "";

            for (int i = source.length() - 1; i >= 0; i--) {
                reverse = reverse + source.charAt(i);
            }
            System.out.println("Reverse String is= " + reverse);
            System.out.println("Do you want to continue(yes/no): ");
            ch=sc.next();
        }while(ch.equals("yes"));
    }
}
