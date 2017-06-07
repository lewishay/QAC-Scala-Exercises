package Intermediate.Garage

/**
  * Created by Administrator on 06/06/2017.
  */
abstract class Person(name: String, age: Int) {
  override def toString: String = s"This person's name is $name and they are $age years old."
  def getName() = name
  def getAge() = age
}
