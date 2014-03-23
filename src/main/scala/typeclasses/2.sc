import typeclasses.Monoid

def sum[T](xs: Seq[T])(implicit monoid: Monoid[T]) =
  xs.foldLeft(monoid.zero)(monoid.plus)

sum(Seq(1, 2, 3, 4))
sum(Seq("a", "b", "c"))
sum(Seq(Option(1), Option(4)))
sum(Seq(Option(1), None))
sum(Seq(Option.empty[Int], None))
sum(Seq(Option("a"), Option("b")))
sum(Seq(Option("a"), None))
sum(Seq(Option.empty[String], None))
sum(
  Seq(
    (Option(10), Option("a")),
    (Option(4), None)
  )
)

object A{
  implicit val customIntMonoid = new Monoid[Int] {
    def zero = 1
    def plus(a: Int, b: Int) = a * b
  }
  def aa = sum(
    Seq(
      (Option(10), Option("a")),
      (Option(4), None)
    )
  )
}
A.aa