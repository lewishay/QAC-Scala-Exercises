package Intermediate.Garage

/**
  * Created by Administrator on 07/06/2017.
  */
object Runner extends App {
  val car1 = new Car("Nissan", "Sunny", "KL43 9KJ", 5000); val car2 = new Car("Audi", "A7", "NV40 OPW", 350); val car3 = new Car("Toyota", "Yaris", "ED33 9K8", 3918)
  val bike1 = new Bike("Honda", "Navi", "LK43 NGJ", 110); val bike2 = new Bike("Ducati", "Hyperstrada", "NG48 YH4", 821)
  val garage = new Garage()

  garage.addVehicle(car1); garage.addVehicle(car2); garage.addVehicle(car3); garage.addVehicle(bike1); garage.addVehicle(bike2);
  garage.registerEmployee("Becky", 18, "Clerical support"); garage.registerEmployee("Derek", 35, "Senior Mechanic")
  garage.registerCustomer("Jeff", 25, car1); garage.registerCustomer("Alfred", 57, car2); garage.registerCustomer("Sarah", 34, car3)
  garage.registerCustomer("Bill", 41, bike1); garage.registerCustomer("Ross", 21, bike2)

  garage.getAllItems()
}
