import java.util.*;
import java.io.*;
import java.nio.file.*;
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
  public static String storyCall(int storyNumber){
    String story = new String("StoryOne.txt");
    switch(storyNumber){
      case 1:
        System.out.println("Fetching Story #1...");
        story = new String("StoryOne.txt");
        break;
      case 2:
        System.out.println("Fetching Story #2...");
        story = new String("StoryTwo.txt");
        break;
      case 3:
        System.out.println("Fetching Story #3...");
        story = new String("StoryThree.txt");
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
  public static String storyCallRandom(){
    Random rand = new Random();
    int storyNumber=rand.nextInt(3)+1;
    String story = new String("StoryOne.txt");
    switch(storyNumber){
      case 1:
        System.out.println("Fetching Story #1...");
        story = new String("StoryOne.txt");
        break;
      case 2:
        System.out.println("Fetching Story #2...");
        story = new String("StoryTwo.txt");
        break;
      case 3:
        System.out.println("Fetching Story #3...");
        story = new String("StoryThree.txt");
        break;
    }
    return story;
  }

  /**
  * The convertStoryToString method takes the story and converts it into a large String
  * @author Jonah Sanders
  * @version 1.1
  * @since 2018-11-7
  */
  public static String convertStoryToString(String story){
    try {
      return new String(Files.readAllBytes(Paths.get(story)));
    } catch(Exception e){
        return "ERROR: "+e.getMessage();
    }
  }

  /**
  * The convertStoryToArray method takes the story, now a large String value,
  * and from that converts it to an Array, with each word corresponding to an
  * element in an array
  * @author Jonah Sanders
  * @version 1.1
  * @since 2018-11-22
  */
  public static String[] convertStoryToArray(String story){
    return story.split("[^a-zA-Z'-]+//$");
  }

  /**
  * The iterateThroughStory method goes through the array and prompts the user to
  * input nouns,verbs, etc when needed then prints the new story!
  * @author Leah Fernandez
  * @version 1.1
  * @since 2018-11-22
  */
  public static void iterateThroughStory(String[] storyArray){
    Scanner user = new Scanner(System.in); //to have the user put in that word
    for(int i=0; i<storyArray.length;i++){
      if(storyArray[i]=="NOUN"){
        System.out.print("Please Enter A Noun:");
        storyArray[i]=user.next();
        System.out.println("");
      }
      //     else if...
    }
    System.out.println(Arrays.toString(storyArray)); //Print out new story with the user's input
  }
}
