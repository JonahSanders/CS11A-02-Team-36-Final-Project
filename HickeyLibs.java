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
    //Welcome Message, etc.
    story = StoryBank.storyCall(/*UserInput*/1);
    story = StoryBank.convertStoryToString(story);
    String[] storyArray = StoryBank.convertStoryToArray(story);
    System.out.println(Arrays.toString(storyArray));
    StoryBank.iterateThroughStory(storyArray);
    //Would you like your story read aloud Message
    //Jiale: add a conditional if they say yeah add the voice thing from L30 in class using SimpleTTS
    //Thank you for playing message
  }
}
