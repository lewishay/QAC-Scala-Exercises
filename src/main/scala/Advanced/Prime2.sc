// SLOW, not efficient enough for 2 billion, but this is an alternate way to get primes at least.
// My method in Prime1 is more efficient.

//import scala.collection.mutable.ArrayBuffer
//import scala.util.control.Breaks
//
//val startTime = System.nanoTime()
//val loop = new Breaks
//var primes = new ArrayBuffer[Int]
//val allNums = (2 to 400000)
//
//def getPrimes(numbers: IndexedSeq[Int]): ArrayBuffer[Int] = {
//  var operation = numbers.filter(x => x % numbers.head != 0)
//  numbers match {
//    case _ if (numbers.isEmpty || numbers.length == operation.length) => return primes
//    case _ => primes += numbers.head; getPrimes(operation)
//  }
//}
//
//val result = getPrimes(allNums)
//s"The number of primes numbers between 1 and ${allNums.max} is ${result.length}"
//f"The time taken for this code to run was ${(System.nanoTime() - startTime)/1000000000.0}%4.2f seconds"