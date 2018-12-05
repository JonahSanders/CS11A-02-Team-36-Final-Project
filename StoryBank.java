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
  * @author Jonah Sanders and Leah Fernandez
  * @version 1.1
  * @since 2018-11-22
  */
  public static String[] convertStoryToArray(String story){

    String[] result = story.split(" ");
    return result;
    //return story.split("[^a-zA-Z'-]+");
  }

  /**
  * The iterateThroughStory method goes through the array and prompts the user to
  * input nouns,verbs, etc when needed then prints the new story!
  * @author Leah Fernandez
  * @version 1.1
 * @throws IOException 
  * @since 2018-12-3
  */
  public static void iterateThroughStory(String[] storyArray) {
    Scanner input = new Scanner(System.in); //to have the user put in that word
    //StringBuffer buffer1= new StringBuffer(x);
    //z is the finalised string that includes all the new words that have been entered by the user
    String z = "";

    for(int i=0; i<storyArray.length;i++){

        if(storyArray[i].charAt(0)=='$'){

            String word = storyArray[i].substring(1);
            char firstLetter = word.charAt(0);

               if(firstLetter=='A'|| firstLetter== 'E'|| firstLetter=='I'|| firstLetter=='O'||firstLetter=='U'){
                  System.out.println("Enter an " + word + ": ");
               }
               else{
                   System.out.println("Enter a " + word + ": ");
               }  //Determines if vowel or consonant to choose a or an.

             String newWord = input.next();
             storyArray[i] = newWord; //replaces the word with a new word entered by user
             z += storyArray[i] + " ";
            }

        }
        DisplayClass.display(storyArray);
      }

  }
