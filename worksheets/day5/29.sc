
object A {

  import typeclasses._

  def sum[T](xs: Seq[T])(monoid: Monoid[T]) =
    xs.foldLeft(monoid.zero)(monoid.plus)


  sum(Seq(1, 2, 3, 4))(Monoid.intMonoid)
}
