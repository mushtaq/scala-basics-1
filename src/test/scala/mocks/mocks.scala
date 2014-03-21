package mocks

import top.{RoundingComp, Rounding}
import org.specs2.mock.Mockito

trait MockRounding extends Rounding {
  override def down(value: Double) = value
  override def up(value: Double) = value
}

trait MockRoundingComp extends RoundingComp with Mockito {
  override lazy val rounding = mock[Rounding]
}