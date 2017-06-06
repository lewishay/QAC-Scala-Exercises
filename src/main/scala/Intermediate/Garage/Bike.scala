package Intermediate.Garage

/**
  * Created by Administrator on 06/06/2017.
  */
class Bike(manufacturer: String, model: String, licencePlate: String, cylinderCapacity: Int) extends Vehicle(manufacturer, model, licencePlate){
  override def toString: String = s"This bike is a $manufacturer $model and has the licence plate $licencePlate. It's engine is $cylinderCapacity" + "cc."
  def getCylinderCapacity() = cylinderCapacity
}
