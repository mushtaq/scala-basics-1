class RichInt(a: Int) {

  def rangeSet(b: Int): Set[Int] = (a.min(b) to a.max(b)).to[Set]
}

implicit def toRI(a: Int) = new RichInt(a)

12.rangeSet(15)

val x: RichInt = 11

def m(a: RichInt) = a.rangeSet(10).sum

m(13)

1
