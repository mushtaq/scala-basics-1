
val m = Map(1 -> "a", 2 -> "b")

val dd = for {
  x <- m.get(1)
  if x != "random"
  y <- m.get(2)
  if y == "b"
} yield s"$x: $y"

dd.getOrElse(throw new RuntimeException("asasdasd"))

