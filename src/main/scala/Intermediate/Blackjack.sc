// Returns either the winning number, or a 0 if it's a draw.
def blackjack(x: Int, y: Int): Int = {
  x match {
    case _ if (x > 21 && y > 21) => 0
    case _ if (x > 21 && y < 21) => y
    case _ if (x < 21 && y > 21) => x
    case _ if (x == y) => 0
    case _ if (x > y) => x
    case _ if (y > x) => y
    case _ => 0
  }
}

blackjack(16, 18)
blackjack(20, 18)
blackjack(24, 23)
blackjack(16, 16)


