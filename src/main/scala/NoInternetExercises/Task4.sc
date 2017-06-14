import scala.collection.mutable.ListBuffer

var theList = new ListBuffer[Int]
var lengthStore = 0
var counter = 0

def init() = {
  if(theList.length > 0) theList.clear()
  theList += 0; theList += 1;
  lengthStore = -1
  counter = 0
}

def fibonacci(n: Int): Int = {
  if(lengthStore == -1) lengthStore = n
  n match {
    case _ if (lengthStore == 0) => theList(0)
    case _ if (lengthStore == 1) => theList(1)
    case _ if (theList.length == lengthStore) => theList(lengthStore - 2) + theList(lengthStore - 1)
    case _ => {
      theList += (theList(counter) + theList(counter + 1)); counter += 1; fibonacci(n + 1)
    }
  }
}

init(); fibonacci(0)
init(); fibonacci(1)
init(); fibonacci(2)
init(); fibonacci(3)
init(); fibonacci(4)
init(); fibonacci(5)
init(); fibonacci(6)
init(); fibonacci(7)
init(); fibonacci(8)
init(); fibonacci(9)
init(); fibonacci(10)