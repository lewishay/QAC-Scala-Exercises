import scala.collection.mutable._

// I borrowed the same functions from Strings1 as helper methods for the main function
// These functions check the two strings for matching substrings
def getAllSubs(theString: String): ListBuffer[String] = {
  val allSubs = new ListBuffer[String]
  for(i <- 0 to (theString.length - 1); j <- 1 to theString.length) {
    if(j > i) allSubs += theString.substring(i, j)
  }
  allSubs
}

def findLongestCommonSub(string1: String, string2: String) = {
  val subs1 = getAllSubs(string1).toSet ; val subs2 = getAllSubs(string2).toSet
  val commonElems = subs1.filter(x => subs2.contains(x))
  commonElems.maxBy(x => x.length)
}

def stringHomogeny(string1: String, string2: String): String = {
  var numOfChanges = 0
  var counter = 0
  val string1Split = string1.toCharArray
  val string2Split = string2.toCharArray
  val commonSubLength = findLongestCommonSub(string1, string2).length
  for(char <- string1Split) {
    if(counter < string2.length) {
      if (string1Split(counter) == string2Split(counter)) numOfChanges += 0
      if (char != string2Split(counter)) numOfChanges += 1
      counter += 1
    }
  }
  if(commonSubLength > 1) numOfChanges = string1.length - commonSubLength
  if(string2.length > string1.length) numOfChanges += string2.length - string1.length
  else if(string2.length < string1.length) numOfChanges += string1.length - string2.length
  s"The fewest number of changes needed to turn $string2 into $string1 is $numOfChanges"
}

stringHomogeny("ham", "jam")
stringHomogeny("party", "sparta")
stringHomogeny("wine", "water")
stringHomogeny("pounds", "penny")
stringHomogeny("fijimitiki", "fojomotoko")
