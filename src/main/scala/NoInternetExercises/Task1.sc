import scala.collection.mutable.ArrayBuffer

def doubleChar(theString: String) = {
  val stringSplit = theString.toCharArray
  var newArray = new ArrayBuffer[Char]
  for(char <- stringSplit) {newArray += char; newArray += char}
  var resultString = ""
  for(char <- newArray) resultString += char
  resultString
}

doubleChar("The")
doubleChar("AAbb")
doubleChar("Hi-There")