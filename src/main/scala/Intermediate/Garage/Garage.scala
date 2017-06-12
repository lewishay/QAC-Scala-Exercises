package Intermediate.Garage

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.util.Random

/**
  * Created by Administrator on 06/06/2017.
  */
class Garage() {
  var peopleAndVehicles = new mutable.HashSet[Any]()
  var totalEarnings = 0

  def addVehicle(vehicle: Vehicle) = {
    peopleAndVehicles.add(vehicle)
  }

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

  def fixVehicle(vehicle: Vehicle):String = {
    if (peopleAndVehicles.count(x => x.isInstanceOf[Employee]) > 0) {
      val employees = new ListBuffer[Employee]
      for(item <- peopleAndVehicles) item match {
        case item: Employee => employees += item
        case _ =>
      }
      for (part <- vehicle.getParts()) part match {
        case _ if(part.isBroken) => part.fix(); totalEarnings += 100
        case _ =>
      }
      val random = scala.util.Random
      s"The employee that fixed this vehicle was ${employees(random.nextInt(employees.size)).getName()}."
    }
    else "There is no employee available"
  }

  def calculateBill(vehicle: Vehicle): String = {
    var total = 0
    if(peopleAndVehicles.contains(vehicle)) {
      for(part <- vehicle.getParts()) if(part.getIsBroken()) total += 100
      s"The bill for the ${vehicle.getManufacturer()} ${vehicle.getModel()} with ${total/100} broken parts is £$total"+"."
    }
    else "Vehicle does not exist."
  }

  def getVehicles() = for(item <- peopleAndVehicles) item match {
    case item: Vehicle => println(item)
    case _ =>
  }

  def getPeople() = for(item <- peopleAndVehicles) item match {
    case item: Person => println(item)
    case _ =>
  }

  def getFixTime(vehicle: Vehicle): Int = {
    var mins = 0
    for(part <- vehicle.getParts()) if(part.isBroken) mins += 10
    mins
  }

  def getTotalFixTime(): String = {
    var mins = 0
    var numberOfEmployees = 0
    for (item <- peopleAndVehicles) item match {
      case item: Vehicle => mins += getFixTime(item)
      case item: Employee => numberOfEmployees += 1
      case _ =>
    }
    s"The total time required to fix all vehicles in the garage is ${mins/numberOfEmployees} minutes."
  }


}
