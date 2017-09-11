package Prac7.Coding;

/**
 * Created by jc259968 on 11/09/17.
 */
import java.util.Scanner;
public class CountMovieSpaces2 {
        public static void main(String[] args) {
            Scanner userinput = new Scanner(System.in);
            System.out.println("Enter a movie title ");
            String quote = userinput.nextLine();
            int x;
            int count = 0;
            int quotelength = quote.length();
            for (x = 0; x < quotelength; ++x) {
                if (quote.charAt(x) == ' ')
                    count+= 1;

            }

            System.out.println("There are " + count + " spaces");
        }

    }

