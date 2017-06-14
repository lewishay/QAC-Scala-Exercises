def getSandwich(theString: String) = {
  val firstBread = theString.indexOf("bread")
  val secondBread = theString.indexOf("bread", firstBread + 1)
  if(firstBread > -1 && secondBread > 0) {
    theString.substring(firstBread + 5, secondBread)
  }
  else ""
}

getSandwich("breadjambread")
getSandwich("xxbreadjambreadyy")
getSandwich("xxbreadyy")