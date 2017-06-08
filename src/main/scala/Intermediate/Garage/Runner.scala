package Intermediate.Garage

/**
  * Created by Administrator on 07/06/2017.
  */
object Runner extends App {
  // Creating objects
  val car1 = new Car("Nissan", "Sunny", "KL43 9KJ", 5000); val car2 = new Car("Audi", "A7", "NV40 OPW", 350); val car3 = new Car("Toyota", "Yaris", "ED33 9K8", 3918)
  val car4 = new Car("Honda", "Smasher", "MN98 9J8", 6019); val car5 = new Car("Toyota", "Spacewagon", "HG38 BHW", 19); val car6 = new Car("BMW", "Boomer", "SC23 2CB", 75291)
  val car7 = new Car("Nissan", "Slug", "BR88 8HN", 40140); val car8 = new Car("Ford", "Fiesta", "NW11 AWL", 305)
  val bike1 = new Bike("Honda", "Navi", "LK43 NGJ", 110); val bike2 = new Bike("Ducati", "Hyperstrada", "NG48 YH4", 821)
  val bike3 = new Bike("Suzuki", "Drifter", "PL21 NRW", 205); val bike4 = new Bike("Yamaha", "Switch", "MQ18 NR4", 550)
  val garage = new Garage()

  // Populating the garage with sample data
  garage.addVehicle(car1); garage.addVehicle(car2); garage.addVehicle(car3); garage.addVehicle(bike1); garage.addVehicle(bike2); garage.addVehicle(car4)
  garage.addVehicle(car5); garage.addVehicle(car6); garage.addVehicle(car7); garage.addVehicle(car8); garage.addVehicle(bike3); garage.addVehicle(bike4)
  garage.registerEmployee("Darak", 29, "Junior Mechanic"); garage.registerEmployee("Derek", 35, "Senior Mechanic")
  garage.registerCustomer("Jeff", 25, car1); garage.registerCustomer("Alfred", 57, car2); garage.registerCustomer("Sarah", 34, car3)
  garage.registerCustomer("Bill", 41, bike1); garage.registerCustomer("Ross", 21, bike2); garage.registerCustomer("Ben", 51, car4)
  garage.registerCustomer("Kay", 19, bike3); garage.registerCustomer("Robert", 43, car5); garage.registerCustomer("Naomi", 36, car6)
  garage.registerCustomer("Lee", 91, car7); garage.registerCustomer("Alice", 51, bike4)

  // Output of the garage scenario
  println(garage.getTotalFixTime()); println("-----")
  for (item <- garage.peopleAndVehicles) item match {
    case item: Vehicle => println(garage.calculateBill(item)); garage.fixVehicle(item)
    case _ =>
  }
  println("-----"); println(s"The total earnings for this session are £${garage.totalEarnings}" + ".")
}
