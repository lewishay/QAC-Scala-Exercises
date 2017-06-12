import scala.collection.mutable._

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

findLongestCommonSub("ighjo", "lmnvi")
findLongestCommonSub("ilovechocolatecake", "nobodylovesme")
findLongestCommonSub("jumptowork", "flytotheshops")
findLongestCommonSub("mypartyisthebset", "icantwaitfortheparty")

