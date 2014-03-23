import typeclasses.ReverseOrder.RichT
case class Person(age: Int, name: String)
val ps = Seq(
  Person(22, "zzz"),
  Person(22, "aaa"),
  Person(11, "ddd")
)
ps.sortBy(p => p.age) foreach println
ps.sortBy(p => (p.age, p.name)) foreach println



ps.sortBy(p => (p.age.reversed, p.name)) foreach println





