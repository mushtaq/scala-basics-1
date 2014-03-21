sealed trait OptionStr
case class SomeStr(value: String) extends OptionStr
case object NoneStr extends OptionStr

def concat(s1: OptionStr, s2: OptionStr): OptionStr = (s1, s2) match {
  case (NoneStr, _) => s2
  case (_, NoneStr) => s1
  case (SomeStr(""), SomeStr(v2)) => SomeStr("")
  case (SomeStr(v1), SomeStr(v2)) => SomeStr(v1 + v2)
}

//concat(SomeStr("s1"), SomeStr("s2"))
//concat(NoneStr, SomeStr("s2"))
//concat(SomeStr("s1"), NoneStr)
//concat(NoneStr, NoneStr)
