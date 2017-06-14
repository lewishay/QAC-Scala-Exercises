def endsLy(theString: String): Boolean = theString match {
  case _ if(theString.length < 2) => false
  case _ if(theString.substring(theString.length - 2, theString.length) == "ly") => true
  case _ => false
}

endsLy("oddly")
endsLy("y")
endsLy("oddy")
