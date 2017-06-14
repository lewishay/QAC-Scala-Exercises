def nTwice(theString: String, theNum: Int): String = {
  val startString = theString.substring(0, theNum)
  val endString = theString.substring((theString.length) - theNum, (theString.length))
  val resultString = startString.concat(endString)
  resultString
}

nTwice("Hello", 2)
nTwice("Chocolate", 3)
nTwice("Chocolate", 1)