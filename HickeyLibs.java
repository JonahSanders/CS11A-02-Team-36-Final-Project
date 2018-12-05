import java.util.*;
import java.io.*;
import java.nio.*;
import java.nio.file.*;
/**
* The HickeyLibs class generates a preset random storyline and allows the user to
* fill in the blanks with nouns, adjectives, verbs, adverbs, and interjections to
* create a humorous fun experience. At the conclusion of the program, it outputs
* the new story with narration by Timothy Hickey and a friendly GUI.
* @author Jonah Sanders, Jiale Hao, Leah Fernandez
* @version 1.0
* @since 2018-11-6
*/
public class HickeyLibs {
  public static String story = "";
  public static void main(String[] args) {
    System.out.println("Welcome to HickeyLibs!!!!");
    System.out.printf("In this Program we will be completing a Madlibs. %nMad Libs is a phrasal template word game where a player is prompted for a list of words to substitute for blanks in a story");
    System.out.println("You will be asked to enter either nouns, adjectives, verbs, adverbs, or interjections");
    System.out.println("");
    System.out.println("Ready to start?");
    System.out.println("Please enter 1, 2, 3 to choose the storyline you will be completing: ");
    Scanner scan = new Scanner(System.in);
    int storyChoice = scan.nextInt();

    story = StoryBank.storyCall(storyChoice);
    story = StoryBank.convertStoryToString(story);
    String[] storyArray = StoryBank.convertStoryToArray(story);
    //System.out.println(Arrays.toString(storyArray));
    StoryBank.iterateThroughStory(storyArray);
    //Would you like your story read aloud Message
    //Jiale: add a conditional if they say yeah add the voice thing from L30 in class using SimpleTTS
    System.out.println("Thank you for playing HickeyLibs!!");
    System.out.println("We hope you had fun and enjoyed the game.");
  }
}
