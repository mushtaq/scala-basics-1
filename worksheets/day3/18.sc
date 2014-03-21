
def f(a: Int) = a


val ff: Function1[Int, Int] = {
  a: Int => a
}

val pf: PartialFunction[Int, Int] = {
  case a: Int if a > 10 => a
}

pf.isDefinedAt(11)
pf.isDefinedAt(9)