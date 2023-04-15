package evenorodd

class EvenNumber(number: Int) extends AbstractNumber(number) {
  override def parityProperty(): String = "Odd"
}