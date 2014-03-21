object A {
  var y = 10
  y = 11

  val v = {
    val time = System.nanoTime()
    println(time)
    time
  }

}


trait B {
  val z: Long
}

val x = System.nanoTime()
//def z = System.nanoTime()
trait A {
  def z: Long
}
class A1 extends A {
  def z = 11L
}
class A2 extends A {
  val z = 11L
}

