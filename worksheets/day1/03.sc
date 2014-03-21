def filter[T](xs: Seq[T])(choose: T => Boolean): Seq[T] = {

  var result = Seq.empty[T]

  val iterator = xs.iterator

  while(iterator.hasNext) {
    val next = iterator.next()
    if(choose(next))
      result = result :+ next
  }

  result
}
val xs = Seq(1, 4, 6, 2, 3, 0)

filter(xs)(_ > 3)
filter(xs)(isEven)

def isEven(x: Int) = x % 2 == 0

def square(x: Int) = x * x

val ys = Seq("abc", "erdft", "qqqqqqqq", "d")
filter(ys)(y => y.length > 3)



1
1
