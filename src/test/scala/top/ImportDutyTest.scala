package top

import org.specs2.mutable.Specification
import mocks.MockRoundingComp
import builders.DefaultBook

class ImportDutyTest extends Specification {

  object Assembly extends ImportDutyComp with MockRoundingComp
  import Assembly._

  "import duty" in {

    rounding.down(36) returns 36

    importDuty(18).applyTax(Book("1", "a", 200, true)) mustEqual 36
  }

}
