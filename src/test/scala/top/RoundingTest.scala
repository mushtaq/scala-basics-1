package top

import org.specs2.mutable.Specification

class RoundingTest extends Specification {

  "up" in {
    Rounding.up(101.2) mustEqual 102
    Rounding.up(11.98) mustEqual 12
  }

  "down" in {
    Rounding.down(101.2) mustEqual 101
    Rounding.down(11.98) mustEqual 11
  }

}
