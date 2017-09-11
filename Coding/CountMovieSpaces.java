package Prac7.Coding;

/**
 * Created by jc259968 on 11/09/17.
 */
public class CountMovieSpaces {
    public static void main(String[] args) {
        String quote = "YOU SHALL NOT PASS!";
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



