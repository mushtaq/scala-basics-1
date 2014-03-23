
val Date1 = """(\d+)-(\d+)-(\d+)""".r

"19-20-2345" match {
  case Date1(day, month, year) => s"$day/$month/$year"
  case _ => "error"
}

class A(val a: Int) {
  def this() = this(100)
}

new A().a


"""
  |xx x
  |a b c
  |asdasd
  |asdasd
  |
""".stripMargin