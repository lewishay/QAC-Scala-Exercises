"Hello world"

val hello = "Hello world!"

def stringOutputter(theString: String) = println(theString)

stringOutputter("Hey world")

def stringReturner(): String = "Heya world"

stringReturner()

def multiType(vari: Any) = vari

multiType("String")
multiType(65)
multiType(7.345)
multiType(false)

def fromEnd(word: String, number: Int): String = {
  word.substring(word.length() - number)
}
fromEnd("Hello", 3)

def charReplace(sub1: String, sub2: String, char1: Char, char2: Char): String = {
  val concat = sub1.concat(sub2)
  concat.replace(char1, char2)
}
charReplace("Ha", "llo", 'a', 'e')

def sum(x: Int, y: Int, condition: Boolean): Int = {
  if(x == 0 && y > x) {
    y
  }
  else if(y == 0 && x > y) {
    x
  }
  else if(condition) {
    x + y
  }
  else {
    x * y
  }
}
sum(500, 68, true)
sum(0, 6, true)
sum(57, 0, true)
sum(0, 0, false)
sum(67, 68, false)

def iteration1(word: String, number: Int) = {
  for(i<-1 to number) {
    println(word)
  }
}
iteration1("Hi", 3)

def iteration2(word: String, number: Int) = {
  for(i<-1 to number) {
    for(j<-1 to number) {
      print(word)
    }
    println()
  }
}
iteration2("H", 4)

def iteration3(word1: String, word2: String, number: Int) = {
  for(i<-1 to number) {
    if(i % 3 == 0 && i % 5 == 0) {
      print(word1 + word2)
    }
    else if(i % 3 == 0) {
      print(word1)
    }
    else if(i % 5 == 0) {
      print(word2)
    }
    else {
      print(i)
    }
    print(", ")
  }
}
iteration3("Fizz", "Buzz", 20)

def newIteration1(word: String, number: Int): Unit = {
  if(number == 1) {
    println(word)
  }
  else {
    println(word)
    newIteration1(word, number - 1)
  }
}
newIteration1("Hi", 3)

var iteration2Helper = ""

def newIteration2(word: String, number: Int): Unit = {
  if(number < 1) {
    newIteration1(iteration2Helper, iteration2Helper.length)
  }
  else {
    iteration2Helper += word
    newIteration2(word, number - 1)
  }
}
newIteration2("H", 4)

var iteration3Helper = ""

def newIteration3(word1: String, word2: String, number: Int): String = {
  if(number < 1) {
    iteration3Helper
  }
  else {
    if(number % 3 == 0 && number % 5 == 0) {
      iteration3Helper += (word1 + word2)
    }
    else if(number % 3 == 0) {
      iteration3Helper += word1
    }
    else if(number % 5 == 0) {
      iteration3Helper += word2
    }
    else {
      iteration3Helper += number
    }
    iteration3Helper += ", "
    newIteration3(word1, word2, number - 1)
  }
}
newIteration3("Fizz", "Buzz", 20)

def patternMatch1(x: Int, y: Int, condition: Boolean): Int = {
  condition match {
    case true =>
      x match {
        case 0 => y
        case _ =>
          y match {
            case 0 => x
            case _ => x + y
          }
      }
    case false =>
      x match {
        case 0 => y
        case _ =>
          y match {
            case 0 => x
            case _ => x * y
          }
      }
  }
}
patternMatch1(56, 44, true)
patternMatch1(56, 0, false)
patternMatch1(0, 0, true)

def patternMatch2(twoInts: Any): Any = twoInts match {
  case (x, y) => (y, x)
  case List(x, y) => List(y, x)
  case Array(x, y) => Array(y, x)
  case _ => "Not a valid type"
}
patternMatch2((5, 7))
patternMatch2(List(5, 7))
patternMatch2(Array(5, 7))
patternMatch2("blah")

java.util.TimeZone.getAvailableIDs().map(item => item.split("/").filter(_.length > 1).last).grouped(20).toArray.map(value => value.head)