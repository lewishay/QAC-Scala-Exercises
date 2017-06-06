package Intermediate.Garage

/**
  * Created by Administrator on 06/06/2017.
  */
abstract class Vehicle(manufacturer: String, model: String, licencePlate: String) {
  override def toString: String = s"This vehicle is a $manufacturer $model and has the licence plate $licencePlate."
  def getManufacturer() = manufacturer
  def getModel() = model
  def getLicencePlate() = licencePlate
}
