def add1(a: Int, b: Int) =  a + b
def add(a: Int)(b: Int) =  a + b
val adderTwo: Int => Int = add(2)
val adderTwo1 = add(2) _
adderTwo(5)
adderTwo(67)
adderTwo1(5)
adderTwo1(67)
def transform1(xs: Seq[Int], transformer: Int => Int): Seq[Int] = {
  def loop(remains: Seq[Int], result: Seq[Int]): Seq[Int] =
    if(remains.isEmpty)
      result
    else
      loop(remains.tail, result :+ transformer(remains.head))
  loop(xs, Seq.empty)
}
val xs = Seq(1, 4, 6, 2, 3, 0)

transform1(xs, add(2))
transform1(xs, adderTwo)
transform1(xs, x => add1(x, 22))
transform1(xs, add1(_, 2))














