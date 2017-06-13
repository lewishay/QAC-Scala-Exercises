import scala.collection.mutable.ArrayBuffer
import scala.util.control.Breaks

val startTime = System.nanoTime()
val loop = new Breaks
def isOdd(x: Int): Boolean = x % 2 != 0
def byFive(x: Int): Boolean = x % 5 != 0
var allNums = (3 to 3000000).filter(isOdd).filter(byFive)

def getPrimes(numbers: IndexedSeq[Int]): ArrayBuffer[Int] = {
  val primes = new ArrayBuffer[Int]
  for(num <- numbers) {
    loop breakable {
      for (primeNum <- primes) {
        if (num % primeNum == 0) loop.break()
      }
      primes += num
    }
  }
  primes.insert(0, 2); primes.insert(2, 5)
  primes
}

val result = getPrimes(allNums)
s"The number of primes numbers between 1 and ${allNums.max + 1} is ${result.length}"
f"The time taken for this code to run was ${(System.nanoTime() - startTime)/1000000000.0}%4.2f seconds"

