import scala.collection.mutable.ListBuffer

def fibonacci(x: Int): Int = {
  var theList = new ListBuffer[Int]
  theList += 0; theList += 1;
  var lengthStore = -1
  var counter = 0
  def fibonacciHelper(n: Int): Int = {
    if (lengthStore == -1) lengthStore = n
    n match {
      case _ if (lengthStore == 0) => theList(0)
      case _ if (lengthStore == 1) => theList(1)
      case _ if (theList.length == lengthStore) => theList(lengthStore - 2) + theList(lengthStore - 1)
      case _ => {
        theList += (theList(counter) + theList(counter + 1));
        counter += 1;
        fibonacciHelper(n + 1)
      }
    }
  }
  fibonacciHelper(x)
}

fibonacci(0)
fibonacci(1)
fibonacci(2)
fibonacci(3)
fibonacci(4)
fibonacci(5)
fibonacci(6)
fibonacci(7)
fibonacci(8)
fibonacci(9)
fibonacci(10)