import scala.annotation.tailrec

1 :: 2 :: Nil
val xs = List(1, 2, 3, 4)
def reverse(xs: List[Int]): List[Int] = xs match {
  case Nil => Nil
  case 3 :: tail => reverse(tail) ::: List(100)
  case head :: tail => reverse(tail) ::: List(head)
}
reverse(xs)
