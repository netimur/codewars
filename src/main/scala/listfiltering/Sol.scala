package listfiltering

object Sol extends App {

  def filterList(list: List[Any]): List[Int] = {
    list.toStream.filter(obj => {
      obj match {
        case v: Int => true
        case v: String => false
      }
    })
  }.map(obj => obj.asInstanceOf[Int]).toList
}
