import typeclasses.Monoid

val customIntMonoid = new Monoid[Int] {
  def zero = 1
  def plus(a: Int, b: Int) = a * b
}
def sum[T](xs: Seq[T])(monoid: Monoid[T]) =
  xs.foldLeft(monoid.zero)(monoid.plus)
sum(Seq(1, 2, 3, 4))(Monoid.intMonoid)
sum(Seq("a", "b", "c"))(Monoid.strMonoid)
sum(Seq(Option(1), Option(4)))(Monoid.optionMonoid(Monoid.intMonoid))
sum(Seq(Option(1), None))(Monoid.optionMonoid(Monoid.intMonoid))
sum(Seq(Option.empty[Int], None))(Monoid.optionMonoid(Monoid.intMonoid))
sum(Seq(Option("a"), Option("b")))(Monoid.optionMonoid(Monoid.strMonoid))
sum(Seq(Option("a"), None))(Monoid.optionMonoid(Monoid.strMonoid))
sum(Seq(Option.empty[String], None))(Monoid.optionMonoid(Monoid.strMonoid))


sum(
  Seq(
    (Option(10), Option("a")),
    (Option(4), None)
  )
)(Monoid.tuple2Monoid(
  Monoid.optionMonoid(Monoid.intMonoid),
  Monoid.optionMonoid(Monoid.strMonoid)
))
sum(
  Seq(
    (Option(10), Option("a")),
    (Option(4), None)
  )
)(Monoid.tuple2Monoid(
  Monoid.optionMonoid(customIntMonoid),
  Monoid.optionMonoid(Monoid.strMonoid)
))
