//Couldn't get this one working

def stringClean(theString: String): String = {
  var splitString = theString.toCharArray
  var resultString = ""
  for(i <- 1 to (splitString.length - 1)) {
    if(splitString(i) == splitString(i - 1)) {
      var badInt = i
      for(j <- 0 to (splitString.length - 1)) {
        if(j != badInt) resultString += splitString(j)
      }
      stringClean(resultString)
    }
  }
  theString
}

stringClean("Hey")
//stringClean("HHHHey") // This gives infinite loop