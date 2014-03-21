
trait OptionStr
case class SomeStr(value: String) extends OptionStr
case object NoneStr extends OptionStr

def concat(s1: OptionStr, s2: OptionStr): OptionStr =
  if(s1 == NoneStr) s2
  else if (s2 == NoneStr) s1
  else SomeStr(
    s1.asInstanceOf[SomeStr].value
      + s2.asInstanceOf[SomeStr].value
  )

concat(SomeStr("s1"), SomeStr("s2"))
concat(NoneStr, SomeStr("s2"))
concat(SomeStr("s1"), NoneStr)
concat(NoneStr, NoneStr)
