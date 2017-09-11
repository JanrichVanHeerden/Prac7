package Prac7.Coding;

import java.util.Scanner;

/**
 * Created by jc259968 on 11/09/17.
 */
public class ValidatePassword {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter a password that contains two uppercase, two lowercase and two digits ");
        String PassWord = userinput.nextLine();
        int x;
        int count = 0;
        int quotelength = PassWord.length();
        for (x = 0; x < quotelength; ++x) {
            if (PassWord.charAt(x) == ' ')
                count+= 1;

        }

        System.out.println("There are " + count + " spaces");
    }

}

