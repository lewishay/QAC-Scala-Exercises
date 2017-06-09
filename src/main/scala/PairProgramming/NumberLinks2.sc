import scala.collection.mutable._

// This isn't a great solution. It gives the correct results but doesn't print the
// context out of what was done to get that result.

var addList: ListBuffer[Int] = new ListBuffer[Int]
var subList: ListBuffer[Int] = new ListBuffer[Int]
var multList: ListBuffer[Int] = new ListBuffer[Int]
var divList: ListBuffer[Int] = new ListBuffer[Int]

var addMap: Map[Int, String] = new HashMap[Int, String]
var subMap:  Map[Int, String] = new HashMap[Int, String]
var multMap:  Map[Int, String] = new HashMap[Int, String]
var divMap:  Map[Int, String] = new HashMap[Int, String]

def findTheLinks(numbers: Int*) = {
  for(i <- 0 to numbers.length - 1) {
    for(value <- numbers) {
      addList += (numbers(i) + value)
      subList += (numbers(i) - value)
      multList += (numbers(i) * value)
      divList += (numbers(i) / value)
    }
  }
  for(value <- numbers) {
    if(addList.contains(value)) println(s"Addition result found: $value")
    if(subList.contains(value)) println(s"Subtraction result found: $value")
    if(multList.contains(value)) println(s"Multiplication result found: $value")
    if(divList.contains(value)) println(s"Division result found: $value")
  }
}

findTheLinks(3, 5, 15, 45, 75)