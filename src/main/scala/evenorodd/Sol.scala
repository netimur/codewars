package evenorodd

object Sol {
  def evenOrOdd(number: Int): String = {
    val factory = new NumberFactoryImpl()
    val myNumber = factory.createNumber(number)
    return myNumber.parityProperty()
  }
}
