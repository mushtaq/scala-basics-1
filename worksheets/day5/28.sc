class RichInt(a: Int) {

  def rangeSet(b: Int): Set[Int] = (a.min(b) to a.max(b)).to[Set]
}

implicit def toRI(a: Int) = (a * a).toString
implicit def toRSeq(a: Int) = Seq(1 to a : _*)

val x: String = 100
val x1: Seq[Int] = 100

9.map(_ + 1)

Array(1, 2, 3).map(_ + 1)

val a: Double = 10
