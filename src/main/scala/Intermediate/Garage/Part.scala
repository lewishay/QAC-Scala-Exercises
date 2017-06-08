package Intermediate.Garage

/**
  * Created by Administrator on 07/06/2017.
  */
class Part(identifier: String, var isBroken: Boolean) {
  override def toString: String = s"This part's ID is $identifier and it's broken status is: $isBroken" + "."
  def getIdentifier() = identifier
  def getIsBroken() = isBroken
  def fix() = isBroken = false
}
