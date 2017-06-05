import java.util.Calendar

/**
  * Created by Administrator on 05/06/2017.
  */
object Main {
  def main(args: Array[String]) = {
    for(i<-1 to 3; j<-1 to 3) {
      println("Hey world " + i + "." + j)
    }
    val theDate = Calendar.getInstance()
    println("The current date is: " + theDate.getTime())
  }
}
