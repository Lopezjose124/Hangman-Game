package wordguesser;

import java.io.*;
import java.util.*;

public class Word
{

    private String randomWord;

    private char[] result;

    public Word()
    {
        generateRandomWord();
 
        this.randomWord = randomWord;
        this.result = new char[randomWord.length()];

        for (int i = 0; i < randomWord.length(); i++)
        {
            result[i] = '*';
            System.out.print( result[i]);
        }

        checkGuess();

    }

    private void checkGuess()
    {
        String userInput = "";
        char letterGuessed;
        int index = 0;
        int wrongGuesses = 0;                 //Keeps track of the wrong Guesses
        int correctGuesses = 0;               //Keeps track of the correct Guesses

        StickFigure s;

        ArrayList<String> allLettersEntered // Create an ArrayList object
                = new ArrayList<String>();

        Scanner scanner // Create a Scanner object
                = new Scanner(System.in);

        //used for testing 
        System.out.println("");
       // System.out.println(getRandomWord());

        while (wrongGuesses < 6 && correctGuesses < randomWord.length())
        {
            System.out.println("\n\n");

            //prompt user to guess the random word
            System.out.print("\nEnter a letter that you think is included in the word: ");
            userInput = scanner.next();

            //add letter to arraylist
            allLettersEntered.add(userInput);

            while (hasBeenEntered(allLettersEntered, userInput))
            {

                //prompt user to guess the random word
                System.out.print("\nYou already entered that letter, try again with a different letter: ");
                userInput = scanner.next();

            }

            if (!hasBeenEntered(allLettersEntered, userInput) && randomWord.contains(userInput))
            {
                letterGuessed = userInput.charAt(0);

                revealLetter(letterGuessed);

                //System.out.println("\n\nGood guess!");

                System.out.println("");

                correctGuesses += countOccurencesInWord(randomWord, userInput);

            }// end if   
            
            else
            {
                //increment number of wrong guesses
                wrongGuesses++;

                System.out.println("\n\n\n");

                //create call to constructor of class that draws body parts of hang man
                s = new StickFigure(wrongGuesses);

                //Print out error guess
                System.out.println("\n\n\nSorry, but the word I'm thinking"
                        + " of doesnt include a " + userInput);

            }//end else

        }//end while

        if (correctGuesses == randomWord.length())
        {
            System.out.println("\nYou have guessed the word, it was " + randomWord);
        } else if (wrongGuesses == 6)
        {
            System.out.println("\nGame over. Unfortunately, you weren't able to"
                    + " guess the word. It was " + randomWord);
        } else
        {
            System.out.println("hello");
        }

    }// end check guess

    public void revealLetter(char letterBeingRevealed)
    {
        // The underlying char array of the secret word
        char[] wordArray = randomWord.toCharArray();

        for (int i = 0; i < wordArray.length; i++)
        {

            if (wordArray[i] == letterBeingRevealed)
            {
                result[i] = letterBeingRevealed;
            }

            System.out.print(result[i]);

        }

    }

    /*
    This method checks to see if the specified element is present in the array
    or not using a linear search. If the element is found then the method returns
    true if not it returns false.
     */
    private boolean hasBeenEntered(ArrayList<String> lettersGuessed, String letterGuessed)
    {
        boolean flag = false;
        int count = 0;

        for (String element : lettersGuessed)
        {
            if (element.equalsIgnoreCase(letterGuessed))
            {
                count++;

                if (count > 1)
                {
                    flag = true;

                }//end iner if

            }//end outer if

        }//end for

        return flag;
    }

    /*
    This method checks to see how many times a specified letter is found within 
    a word
     */
    private int countOccurencesInWord(String wordBeingSearched, String letterBeingCounted)
    {
        int count = 0;

        for (int i = 0; i < wordBeingSearched.length(); i++)
        {
            if (wordBeingSearched.substring(i, i + 1).equalsIgnoreCase(letterBeingCounted))
            {
                count++;

            }// end if 

        }//end for 

        return count;

    }// end count occurence

    /*  
    This method reads from an external file called 'Words.txt.' After reading 
    the file it goes through and adds each word from the file into an array. Finally,
    the method generates a random word from the external file and returns it when 
    called.
     */
    private String generateRandomWord()
    {
        String inPutFile = "Words.txt";	      //file name
        String line = "";                     //line of data read from file
        StringTokenizer inLine;               //tokenized string
        int wordsTotal = 0;
        ArrayList<String> words // Create an ArrayList object
                = new ArrayList<String>();
                                       
        Random r = new Random();              //create instance of random

        try
        {
            //open the input stream
            FileReader fRead = new FileReader(inPutFile);

            //buffer input stream one line at a time
            BufferedReader bRead = new BufferedReader(fRead);

            //read the first line of the file
            line = bRead.readLine();

            while (line != null)
            {
                //populate the array
                words.add(line);

               //increment number of words 
               wordsTotal++;
               
                //get the next line in the external file
                line = bRead.readLine();

            }//end while line not null

            //pick a random word from the arraylist
            setRandomWord(words.get(r.nextInt(wordsTotal)));

            //close the input stream
            bRead.close();

        }//end try
        catch (IOException | NoSuchElementException exception)
        {
            System.out.println(exception.getMessage());

        }//end catch

        return randomWord;

    }//end genrateRandomWord

    public void setRandomWord(String randomWord)
    {
        this.randomWord = randomWord;

    }//end setRandomWord

    public String getRandomWord()
    {
        return randomWord;

    }//end getRandomWod

    public char[] getResult()
    {
        return result;

    }//end get result

    public void setResult(char[] result)
    {
        this.result = result;

    }//end set result

}// end class
