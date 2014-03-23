package typeclasses

trait Monoid[T] {
  def zero: T
  def plus(a: T, b: T): T
}

object Monoid {

  implicit val intMonoid = new Monoid[Int] {
    def zero = 0
    def plus(a: Int, b: Int) = a + b
  }

  implicit val strMonoid = new Monoid[String] {
    def zero = ""
    def plus(a: String, b: String) = a + b
  }

  implicit def optionMonoid[T](implicit tMonoid: Monoid[T]) = new Monoid[Option[T]] {
    def zero = None
    def plus(a: Option[T], b: Option[T]) = {
      val all = a ++ b
      if(all.isEmpty) None else Some(all.reduceLeft(tMonoid.plus))
    }
  }

  implicit def tuple2Monoid[A, B](implicit aMonoid: Monoid[A], bMonoid: Monoid[B]) = new Monoid[(A, B)] {
    def zero = (aMonoid.zero, bMonoid.zero)

    def plus(x: (A, B), y: (A, B)) = (x, y) match {
      case ((a1, b1), (a2, b2)) => (aMonoid.plus(a1, a2), bMonoid.plus(b1, b2))
    }
  }
}
