import java.util.*;
import java.io.*;
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
  public static void main(String[] args) {
    //Welcome Message, etc.
    File story = StoryBank.storyCall(/*UserInput*/1);
    String[] storyArray = StoryBank.convertStory(story);
    System.out.println(Arrays.toString(storyArray));
  }
}
