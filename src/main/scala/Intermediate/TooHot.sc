def tooHot(temperature: Int, isSummer: Boolean): Boolean = {
  temperature match {
    case _ if(temperature > 59 && temperature < 91) => true
    case _ if(temperature > 90 && temperature < 101 && isSummer) => true
    case _ => false
  }
}

tooHot(80, false)
tooHot(100, false)
tooHot(100, true)
