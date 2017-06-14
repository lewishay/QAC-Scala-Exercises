def bunnyEars(x: Int): Int = {
  var total = 0
  def bunnyHelper(bunnies: Int): Int = {
    if (bunnies == 0) return total
    else total += 2;
    bunnyHelper(bunnies - 1)
  }
  bunnyHelper(x)
}

bunnyEars(0)
bunnyEars(1)
bunnyEars(2)