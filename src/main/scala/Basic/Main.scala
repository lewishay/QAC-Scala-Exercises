package Basic

/**
  * Created by Administrator on 05/06/2017.
  */
object Main {
  var iteration2Helper = ""
  var iteration3Helper = ""

  def main(args: Array[String]) = {
    println("Hello world")
    val hello = "Hello world!"
    println(hello)
    stringOutputter("Hey world")
    stringReturner()
    println("-----")
    multiType("String")
    multiType(65)
    multiType(7.345)
    multiType(false)
    println("-----")
    println(fromEnd("Hello", 3))
    println(charReplace("Ha", "llo", 'a', 'e'))
    println("-----")
    println(sum(500, 68, true))
    println(sum(0, 6, true))
    println(sum(57, 0, true))
    println(sum(0, 0, false))
    println(sum(67, 68, false))
    println("-----")
    iteration1("Hi", 3)
    println("-----")
    iteration2("H", 4)
    println("-----")
    iteration3("Fizz", "Buzz", 20)
    println("\n-----")
    println(newIteration1("Hi", 3))
    println("-----")
    println(newIteration2("H", 4))
    println("-----")
    println(newIteration3("Fizz", "Buzz", 20))
    println("-----")
  }

  def stringOutputter(theString: String) = {
    println(theString)
  }

  def stringReturner(): String = {
    "Heya world"
  }

  def multiType(vari: Any) = {
    println(vari)
  }

  def fromEnd(word: String, number: Int): String = {
    word.substring(word.length() - number)
  }

  def charReplace(sub1: String, sub2: String, char1: Char, char2: Char): String = {
    val concat = sub1.concat(sub2)
    (concat.replace(char1, char2))
  }

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

  def iteration1(word: String, number: Int) = {
    for(i<-1 to number) {
      println(word)
    }
  }

  def iteration2(word: String, number: Int) = {
    for(i<-1 to number) {
      for(j<-1 to number) {
        print(word)
      }
      println()
    }
  }

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

  def newIteration1(word: String, number: Int): String = {
    if(number == 1) {
      word
    }
    else {
      println(word)
      newIteration1(word, number - 1)
    }
  }

  def newIteration2(word: String, number: Int): String = {
    if(number < 1) {
      newIteration1(iteration2Helper, iteration2Helper.length)
    }
    else {
      iteration2Helper += word
      newIteration2(word, number - 1)
    }
  }

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
}
