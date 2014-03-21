import scala.collection.BitSet

val xs = Seq(1, 2)
val xs1 = Seq("a", "b")
val ys = Set(1, 2, 3)
val ms = Map(1 -> "a", 2 -> "b", 3 -> "c")

xs: Int => Int
xs1: Int => String

ys: Int => Boolean
ms: Int => String
xs.map(x => ms(x))

case class A(a: Int, b: Int)

val dd = for {
  x <- xs
  if x < 2
  y <- ys
  if y > 1
} yield A(x, y)








