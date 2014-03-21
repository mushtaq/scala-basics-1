package top

import org.specs2.mutable.Specification
import builders.DefaultBook
import mocks.{MockRoundingComp, MockRounding}

class SalesTaxTest extends Specification  {

  "sales tax" in {
    val book = DefaultBook.copy(basePrice = 100)
    val salesTax = new SalesTax(12.3) with MockRounding
    salesTax.applyTax(book) mustEqual 12.3
  }

}
