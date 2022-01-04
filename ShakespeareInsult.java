/**
 *  Creates a whole mess of Shakespearean insults, two adjectives followed by a noun.
 *  Precondition:
 *    Three files exist, holding NUM_WORDS words.  
 *      File Names: 
 *        shakespeare-1.txt  (adjectives)
 *        shakespeare-2.txt  (adjectives)
 *        shakespeare-3.txt  (nouns)
 */

import java.util.Scanner;
import java.io.*;

public class ShakespeareInsult
{
  // Thre text arrays hold the insulting words  
  private final int NUM_WORDS = 30;
  
  
  /** The Constructor loads insulting words from files  */
  public ShakespeareInsult()
  {
    // Initialize the arrays for words

    
    // Read the word lists from the files

  }
  
  // Reads NUM_WORDS words from a file (one word per line).
  // Stores the words in the String array wordList.
  // If the file doesn't exist, exits the program with an error message.
  private void readFile (String[] wordList, String fileName)
  {
    // open the file
    File file = new File(fileName);
    Scanner input = null;
    try
    {
        input = new Scanner(file);
    }
    catch (FileNotFoundException ex)
    {
        System.out.println("*** Cannot open " + fileName + " ***");
        System.exit(1);        // quit the program
    } 

    // read the words from the file, one per line
    for (int i = 0; i < NUM_WORDS; i++)
      wordList[i] = input.nextLine();
    input.close();
  }
  
  /**
   * Creates a Shakespearean insult based on three lists of 
   * insulting words.
   * @return an insult  
   */
  public String getInsult()
  {
    // This is a dummy response; fill in this code in a useful way.
    return "Thou suckest";
  }

}