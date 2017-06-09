import scala.collection.mutable.ListBuffer
import scala.util.control.Breaks

val startTime = System.nanoTime()
val loop = new Breaks
def isOdd(x: Int): Boolean = x % 2 != 0
def byFive(x: Int): Boolean = x % 5 != 0
val allNums = (3 to 100).filter(isOdd).filter(byFive)
var tempCounter = 0

def getPrimes(numbers: IndexedSeq[Int]): ListBuffer[Int] = {
  val primes = new ListBuffer[Int]
  for(num <- numbers) {
    tempCounter = 0
    loop breakable {
      for (primeNum <- primes) {
        if (num % primeNum != 0) tempCounter += 1
        else loop.break()
      }
    }
    if(tempCounter == primes.length) primes += num
  }
  primes.insert(0, 2); primes.insert(2, 5)
  primes
}

val result = getPrimes(allNums)
s"The number of primes numbers between 1 and ${allNums.max + 1} is ${result.length}"
f"The time taken for this code to run was ${(System.nanoTime() - startTime)/1000000000}%4.2f seconds"


