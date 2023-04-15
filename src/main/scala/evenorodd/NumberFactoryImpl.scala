package evenorodd

class NumberFactoryImpl extends NumberFactory {
  override def createNumber(number: Int): Number = {
    if (number % 2 == 0) {
      new OddNumber(number)
    }
    else {
      new EvenNumber(number)
    }
  }
}