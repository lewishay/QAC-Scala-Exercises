package Intermediate.Garage

import scala.collection.mutable

/**
  * Created by Administrator on 06/06/2017.
  */
class Garage() {
  var peopleAndVehicles: mutable.HashSet[Any] = new mutable.HashSet[Any]()

  def addVehicle(vehicle: Vehicle) = peopleAndVehicles.add(vehicle)

  def removeVehicleByLicence(licence: String) = for(item <- peopleAndVehicles) item match {
    case item: Vehicle  if(item.getLicencePlate() == licence) => peopleAndVehicles.remove(item)
    case _ =>
  }

  def removeVehicleByType(theType: String) = for(item <- peopleAndVehicles) theType match {
    case "Car" if(item.isInstanceOf[Car]) => peopleAndVehicles.remove(item)
    case "Bike" if(item.isInstanceOf[Bike]) => peopleAndVehicles.remove(item)
    case _ =>
  }

  def registerEmployee(name: String, age: Int, jobPosition: String) = peopleAndVehicles.add(new Employee(name, age, jobPosition))

  def registerCustomer(name: String, age: Int, vehicle: Vehicle) = peopleAndVehicles.add(new Customer(name, age, vehicle))

  def fixVehicle(vehicle: Vehicle) = {

  }

  def getAllItems() = (getVehicles(), getPeople())

  def getVehicles() = for(item <- peopleAndVehicles) item match {
    case item: Vehicle => println(item)
    case _ =>
  }

  def getPeople() = for(item <- peopleAndVehicles) item match {
    case item: Person => println(item)
    case _ =>
  }

}
