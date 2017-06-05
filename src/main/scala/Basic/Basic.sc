"Hello world"

val hello = "Hello world!"

def stringOutputter(theString: String) = {
  println(theString)
}
stringOutputter("Hey world")

def stringReturner(): String = {
  "Heya world"
}
stringReturner()

def multiType(vari: Any) = {
  vari
}
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
  (concat.replace(char1, char2))
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