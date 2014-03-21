package top


abstract class Tax {
  def taxRate: Double
  def applyTax(book: Book): Double
  protected def computeTax(book: Book) =
    (book.basePrice * taxRate)/100
}

case class SalesTax(taxRate: Double) extends Tax with Rounding {

  def applyTax(book: Book) = up(computeTax(book))
}

trait ImportDutyComp extends RoundingComp {

  def importDuty(taxRate: Double) = new ImportDuty(taxRate)

  case class ImportDuty(taxRate: Double) extends Tax {
    def applyTax(book: Book) =
      if(book.isImported)  rounding.down(computeTax(book))
      else                 0
  }

}
