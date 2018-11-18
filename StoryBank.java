import java.util.*;
import java.io.*;
/**
* The StoryBank class functions as the storage program of all narratives that
the HickeyLibs program can call upon.
* @author Jonah Sanders
* @version 1.0
* @since 2018-11-6
*/
public class StoryBank{
  /**
  * The storyCall method choses a the narrative according to the input the user
  * gave in the HickeyLibs class or if none was given, a random one.
  * @author Jonah Sanders
  * @version 1.0
  * @since 2018-11-6
  */
  public static File storyCall(int storyNumber){
      Random rand = new Random();
      File story = new File("StoryOne.txt");
      switch(storyNumber){
        case 1:
          System.out.println("Fetching Story #1...");
          story = new File("StoryOne.txt");
          break;
        case 2:
          System.out.println("Fetching Story #2...");
          story = new File("StoryTwo.txt");
          break;
        case 3:
          System.out.println("Fetching Story #3...");
          story = new File("StoryThree.txt");
          break;
        default:
          System.out.printf("The Story Number %d You Inputted Is Not Valid, As A Result, A Story Will Be Chosen At Random",storyNumber);
          storyCallRandom();
      }
      return story;
   }
   /**
   * The storyCallRandom method is used in case the user put forth an invalid parameter
   * or no parameter at all. In that case, storyCallRandom is used to select a random
   * story so the program doesn't crash.
   * @author Jonah Sanders
   * @version 1.1
   * @since 2018-11-18
   */
   public static File storyCallRandom(){
       Random rand = new Random();
       int storyNumber=rand.nextInt(3)+1;
       File story = new File("StoryOne.txt");
       switch(storyNumber){
         case 1:
           System.out.println("Fetching Story #1...");
           story = new File("StoryOne.txt");
           break;
         case 2:
           System.out.println("Fetching Story #2...");
           story = new File("StoryTwo.txt");
           break;
         case 3:
          System.out.println("Fetching Story #3...");
           story = new File("StoryThree.txt");
           break;
       }
       return story;
    }

  /**
  * The convertStory method takes the story and converts it into an array with
  * each word corresponding to a value
  * @author Jonah Sanders
  * @version 1.1
  * @since 2018-11-7
  */
 public static String[] convertStory(File story){
   String[] storyArray = new String[300];
   // int wordNumber = 0;
   try {
     Scanner fileScanner = new Scanner(story);
     while(fileScanner.hasNextLine()){
       String line = fileScanner.nextLine();
       Scanner lineScanner = new Scanner(line);
       storyArray = line.split(" "); //HELP, it's only adding last line to the array
       // wordNumber++;
     }
     fileScanner.close();
   } catch(Exception e) {
      e.printStackTrace();
   }
   return storyArray;
 }
}
