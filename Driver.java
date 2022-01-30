package wordguesser;

import java.io.*;
import java.util.*;

public class Driver
{

    public static void main(String[] args)
    {
        int menuOption;
        //Window window = new Window( 500, 500, "Hangman");
        Scanner scan = new Scanner(System.in);
        char again = 'y';

        while (again == 'y' || again == 'Y')
        {
            System.out.println("\n\nHello, Welcome to my version of the hangman game! ");
            System.out.println("[1] To Start the program ");
            System.out.println("[2] To Exit the program ");
            System.out.print("Please make a selection from the menu above: ");
            menuOption = scan.nextInt();
            System.out.println("");

            switch (menuOption)
            {
                case 1:
                    Word w = new Word();

                    break;
                    
                case 2:

                    again = 'n';

                    break;
                    
            }//end switch

            System.out.print("\n\nWould you like to continue playing? Enter y or n: ");
            again = scan.next().charAt(0);
            
        }//ens while

    }//end main

} // end class