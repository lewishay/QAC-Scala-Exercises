def evenlySpaced(x: Int, y: Int, z: Int): Boolean = {
  val theList = List(x, y, z)
  val biggest = theList.max
  val smallest = theList.min
  var middle = 0
  for(value <- theList) {
    if(value != biggest && value != smallest) {
      middle = value
    }
  }
  if((biggest - middle) == (middle - smallest)) true
  else false
}

evenlySpaced(2, 4, 6)
evenlySpaced(4, 6, 2)
evenlySpaced(4, 6, 3)


