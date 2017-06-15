// SLOW, not efficient enough for 2 billion, but this is an alternate way to get primes at least.
// My method in Prime1 is more efficient.

import scala.collection.mutable.ArrayBuffer

val startTime = System.nanoTime()
val allNums = (2 to 400000)

def getPrimes(x: IndexedSeq[Int]): ArrayBuffer[Int] = {
  var primes = new ArrayBuffer[Int]
  def primeHelper(numbers: IndexedSeq[Int]): ArrayBuffer[Int] = {
    var operation = numbers.filter(x => x % numbers.head != 0)
    numbers match {
      case _ if (numbers.isEmpty || numbers.length == operation.length) => return primes
      case _ => primes += numbers.head; primeHelper(operation)
    }
  }
  primeHelper(x)
}

val result = getPrimes(allNums)
s"The number of primes numbers between 1 and ${allNums.max} is ${result.length}"
f"The time taken for this code to run was ${(System.nanoTime() - startTime)/1000000000.0}%4.2f seconds"