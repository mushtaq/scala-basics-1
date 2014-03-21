
trait MyList {
  def My_::(elm: Int) = new My_::(head = elm, tail = this)
}
case class My_::(head: Int, tail: MyList) extends MyList
case object MyNil extends MyList

1 My_:: 2 My_:: MyNil  match {
    case a My_:: b My_:: MyNil => a + b
//  case My_::(a, My_::(b, MyNil)) => a + b
}
MyNil.My_::(2).My_::(1)
