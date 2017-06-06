package Intermediate.Garage

/**
  * Created by Administrator on 06/06/2017.
  */
class Customer(name: String, age: Int, vehicle: Vehicle) extends Person(name, age) {
  override def toString: String = s"This customer's name is $name and they are $age years old. Their vehicle is a " + vehicle.getManufacturer() + " " + vehicle.getModel() + "."
  def getVehicle() = vehicle
}
