import scala.annotation.tailrec

def sumUpTo(n: Int): Int  = {
  if(n == 0)
    0
  else
    n + sumUpTo(n-1)
}

def sumUpTo1(n: Int): Int  = {

  def loop(remains: Int, result: Int): Int = {
    if(remains == 0)
      result
    else
      loop(remains -1, result + remains)
  }
  loop(n, 0)
}
sumUpTo1(10000)
