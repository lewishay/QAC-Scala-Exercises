var total = 0

def init() = total = 0

def bunnyEars(bunnies: Int): Int = {
  if(bunnies == 0) return total
  else total += 2; bunnyEars(bunnies - 1)
}

init(); bunnyEars(0)
init(); bunnyEars(1)
init(); bunnyEars(2)