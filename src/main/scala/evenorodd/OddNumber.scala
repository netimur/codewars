package evenorodd

class OddNumber(number: Int) extends AbstractNumber(number) {
  override def parityProperty(): String = "Even"
}