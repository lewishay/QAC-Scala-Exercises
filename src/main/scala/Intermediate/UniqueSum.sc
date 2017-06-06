def uniqueSum(x: Int, y: Int, z: Int): Int = {
  x match {
    case _ if(x == y && y == z) => x
    case _ if(x == y || x == z) => y + z
    case _ if(y == z) => x + y
    case _ => x + y + z
  }
}

uniqueSum(6, 10, 14)
uniqueSum(6, 6, 14)
uniqueSum(6, 10, 10)
uniqueSum(10, 6, 10)
uniqueSum(6, 6, 6)