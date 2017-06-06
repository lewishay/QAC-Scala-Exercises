package Intermediate.Garage

/**
  * Created by Administrator on 06/06/2017.
  */
class Employee(name: String, age: Int, jobPosition: String) extends Person(name, age) {
  override def toString: String = s"This employee's name is $name and they are $age years old. Their job position is $jobPosition."
  def getJobPosition() = jobPosition
}
