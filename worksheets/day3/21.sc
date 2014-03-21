
val pf1: PartialFunction[Int, String] = {
  case x if x < 10 => "less than 10"
}

val pf2: PartialFunction[Int, String] = {
  case 15 => "i am 15"
}

type M = Map[Int, String]
val M = Map
val m: M = M.empty[Int, String]

val pf3: PartialFunction[Int, String] = {
  case x if x >= 100 => "i am greater than 100"
}

val ff = pf1
  .orElse(pf3)
  .orElse(pf2)
  .lift

ff(4)
ff(5)
ff(50)
ff(14)
ff(15)
ff(150)

