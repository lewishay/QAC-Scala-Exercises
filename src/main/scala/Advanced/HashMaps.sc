import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.io.Source

// I used an online word list of 4000 common small and medium-sized words

def getWordsFromFile(filename: String): Array[String] = {
  Source.fromFile(filename).getLines.toArray
}

def sortedString(theString: String): String = {
  val chars = theString.toCharArray
  chars.sorted.mkString
}

def isAnagram(string1: String, string2: String): Boolean = {
  string1 match {
    case _ if(string1.length != string2.length) => false
    case _ if(sortedString(string1) != sortedString(string2)) => false
    case _ => true
  }
}

def populateMap(filename: String): mutable.HashMap[String, ArrayBuffer[String]] = {
  val theMap = new mutable.HashMap[String, ArrayBuffer[String]]()
  val wordList = getWordsFromFile(filename)
  val keyList = getWordsFromFile(filename).map(x => sortedString(x))
  for(elem <- keyList) {
    var tempArray = new ArrayBuffer[String]
    for(word <- wordList) {
      if(sortedString(word) == elem) tempArray += word
    }
    theMap.put(elem, tempArray)
  }
  theMap
}

val resultMap = populateMap("C:\\Users\\Administrator\\Documents\\ScalaProject\\src\\main\\scala\\Advanced\\commonWordList.txt")

// The max number of anagrams for any word in the list
val maxNumOfAnagrams = resultMap.valuesIterator.maxBy(_.length).length

// Printing out all sorted words with the max number of anagrams on the word list
for(item <- resultMap.keys) {
  if(resultMap(item).length == maxNumOfAnagrams) {
    println(s"Sorted word: '$item', anagrams: ${resultMap(item)}")
  }
}