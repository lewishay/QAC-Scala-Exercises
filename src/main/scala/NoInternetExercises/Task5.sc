def bunnyEars(x: Int): Int = {
  if (x == 0) return x
  else 2 + bunnyEars(x - 1)
}

bunnyEars(0)
bunnyEars(1)
bunnyEars(2)
bunnyEars(18)
bunnyEars(40)
bunnyEars(95)
bunnyEars(1005)