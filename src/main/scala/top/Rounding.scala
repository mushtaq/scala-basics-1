package top

object Rounding extends Rounding

trait Rounding {
  def up(value: Double) = value.ceil
  def down(value: Double) = value.floor
}


trait RoundingComp {

  lazy val rounding = new Rounding

  class Rounding {
    def up(value: Double) = value.ceil
    def down(value: Double) = value.floor
  }
}
