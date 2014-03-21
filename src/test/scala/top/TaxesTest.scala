package top

import org.specs2.mutable.Specification

class TaxesTest extends Specification {

  "tax calculator" should {

    object x extends Rounding

    "rounding up" in {
      x.up(100.2) mustEqual 101
      x.up(1.9) mustEqual 2
    }

    "rounding down" in {
      x.down(100.2) mustEqual 100
      x.down(1.9) mustEqual 1
    }

    "generate receipt" in {
      val book = Book("1", "a", 9, isImported = true)
      ReceiptMaker.make(
        book,
        Seq(SalesTax(10))
      ) mustEqual Receipt(book, 2)
    }
  }
}
