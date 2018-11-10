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
  public static void main(String[] args) {
    storyCall();
  }
  /**
  * The storyCall method choses a the narrative according to the input the user
  * gave in the HickeyLibs class or if none was given, a random one.
  * @author Jonah Sanders
  * @version 1.0
  * @since 2018-11-6
  */
  public static void storyCall(){
    //Scanner console = new Scanner(System.in);
    Random rand = new Random();
    File story = new File("StoryOne.txt");
    String content;
    try{
      Scanner fileReader = new Scanner(story);
      while (fileReader.hasNextLine()) {
         content = fileReader.nextLine();
         System.out.println(content);
        }
    } catch(Throwable t) {

    }


    //choosing a story at random code
    }
  //  return story;
  }
  /**
  * The convertStory method takes the story and converts it into an array with
  * each word corresponding to a value
  * @author Jonah Sanders
  * @version 1.1
  * @since 2018-11-7
  */
  /* public static String[] convertStory(String story){
  //  storyCall(1/*INPUT));
    String[] madLib = story.split(" ");
    return madLib;
  }
} */
