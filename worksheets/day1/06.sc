def m: Int = {
  println("hi")
  5
}

def square(a: => Int) = a * a
square(m)


Option(2).getOrElse(10)
Option.empty[Int].getOrElse(10)

def While(cond: => Boolean)(body: => Unit): Unit = if(cond) {
  body
  While(cond)(body)
}

object A {
  var x = 0

  While(x < 10) {
    println(x)
    x += 1
  }
}

A











