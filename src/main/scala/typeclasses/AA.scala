package typeclasses

case class ReverseOrder[T](value: T)
object ReverseOrder {
  implicit def reverseOrdering[T](implicit ord: Ordering[T]): Ordering[ReverseOrder[T]] =
    Ordering[T].reverse.on(_.value)

  implicit class RichT[T](value: T) {
    def reversed = ReverseOrder(value)
  }
}
