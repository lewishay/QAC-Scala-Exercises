package Intermediate.Garage

import scala.collection.mutable

/**
  * Created by Administrator on 06/06/2017.
  */
class Car(manufacturer: String, model: String, licencePlate: String, mileage: Int) extends Vehicle(manufacturer, model, licencePlate) {
  override def toString: String = s"This car is a $manufacturer $model and has the licence plate $licencePlate. It's mileage is $mileage miles."
  def getMileage() = mileage
}
