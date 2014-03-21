import scala.collection.mutable

def transform(xs: Seq[Int], transformer: Int => Int) = {

  var result = Seq.empty[Int]
//  val buffer = mutable.Buffer.empty[Int]

  val iterator = xs.iterator

  while(iterator.hasNext) {
    result = result :+ transformer(iterator.next())
  }

  result
}


def transform1(xs: Seq[Int], transformer: Int => Int) = {

  def loop(remains: Seq[Int], result: Seq[Int]): Seq[Int] =
    if(remains.isEmpty)
      result
    else
      loop(remains.tail, result :+ transformer(remains.head))
  loop(xs, Seq.empty)
}
val xs = Seq(1, 4, 6, 2, 3, 0)

transform(xs, x => x * x)
transform1(xs, x => square(x))
transform(xs, _ + 1)
transform1(xs, incr)

def square(x: Int) =  x * x
def incr(x: Int) =  x + 1
