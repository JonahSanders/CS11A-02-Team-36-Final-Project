import java.util.*;
import java.io.*;
/**
* The StoryBank class functions as the storage program of all narratives that
the HickeyLibs program can call upon.
* @author Jonah Sanders, Jiale Hao, Leah Fernandez
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
      Random rand = new Random(4);
      File story = new File(StoryOne.txt);
      switch(storyNumber){
        case 1:
          story=StoryOne.txt;
          break;
        case 2:
          story=StoryTwo.txt;
          break;
        case 3:
          story=StoryThree.txt;
          break;
        default:
          storyNumber=rand.nextInt(3)+1;
          storyCall(storyNumber);
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
   String[] storyArray = new String[150];
   int wordNumber = 0;
   try {
     Scanner fileScanner = new Scanner(story);
     while(fileScanner.hasNextLine()){
       String line = fileScanner.nextLine();
       Scanner lineScanner = new Scanner(line);
  //     lineScanner.useDelimeter(" "); HELP TRYING TO SPLIT .NEXT() INTO SPACES
  //     CREATING CODE TO CREATE A NEW ARRAY WITH MORE VALUES IF IT RUNS OUT?
       storyArray[wordNumber] = lineScanner.next();
       wordNumber++;
     }
     fileScanner.close();
   } catch(Exception e) {
      e.printStackTrace();
   }
   return storyArray;
 }
}
