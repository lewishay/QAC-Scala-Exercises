package Intermediate.Garage

import scala.collection.mutable
import scala.util.Random

/**
  * Created by Administrator on 06/06/2017.
  */
abstract class Vehicle(manufacturer: String, model: String, licencePlate: String, parts: mutable.HashSet[Part] = Vehicle.generateParts()) {
  override def toString: String = s"This vehicle is a $manufacturer $model and has the licence plate $licencePlate."
  def getManufacturer() = manufacturer
  def getModel() = model
  def getLicencePlate() = licencePlate
  def getParts() = parts
}

object Vehicle {
  def generateParts(): mutable.HashSet[Part] = {
    val parts = new mutable.HashSet[Part]()
    val random = new Random()
    val numOfParts = (random.nextInt(10) + 10)
    for(i <- 1 to numOfParts) parts.add(new Part(Random.alphanumeric.take(6).mkString, random.nextBoolean()))
    parts
  }
}
