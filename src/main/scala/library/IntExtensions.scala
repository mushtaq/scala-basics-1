package library

object IntExtensions {

  implicit class RichInt(a: Int) {

    def rangeSet(b: Int): Set[Int] = (a.min(b) to a.max(b)).to[Set]
  }

//  implicit def toRichInt(a: Int) = new RichInt(a)

}
