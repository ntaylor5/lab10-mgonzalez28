package edu.luc.cs271.wordcount;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/** A map-based class for counting word frequencies from an iterator. */
public class WordCounter {

  /** The map for storing the word counts. */
  private final Map<String, Integer> theMap;

  /** Creates a word counter instance based on the given map. */
  public WordCounter(final Map<String, Integer> theMap) {

    // TODO
    // DONE
    this.theMap = theMap;

  }

  /** Counts the frequencies of all words in the given iterator. */
  public void countWords(final Iterator<String> words) {

    // TODO for each word in the iterator, update the corresponding frequency in the map
    // HINT to do this without a conditional, use the getOrDefault method

    // DONE, but check later

    int counter = 0;
    while (words.hasNext()) {
      String str = words.next();
      str.toLowerCase();
      if (theMap.containsKey(str)) {
        counter = theMap.get(str);
        theMap.put(str, counter + 1);
      }
      else theMap.put(str, 1);

    //while (words.hasNext()) {
    //  String str = words.next();
    //  str = str.toLowerCase();
    //  Integer someInt = this.theMap.getOrDefault(str, 0);
    //  this.theMap.put(str, someInt++);


    }
  }

  /** Retrieve the frequency of a particular word. */
  public int getCount(final String word) {

    // TODO
    // DONE
    int count = 0;
    if (theMap.containsKey(word)) {
      count = theMap.get(word);
      theMap.put(word, count);
    }
    else {
      theMap.put(word, 0);
    }
    return count;
  }



  /** Retrieve the map representing all word frequencies. */
  public Map<String, Integer> getCounts() {
    return Collections.unmodifiableMap(theMap);
  }
}
