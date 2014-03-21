case class Book(
  isbn: String,
  title: String,
  basePrice: Double,
  isImported: Boolean
  )    {
}

trait Rounding {
  def up(value: Double) = value.ceil
  def down(value: Double) = value.floor
}

object Rounding extends Rounding

abstract class Tax {
  def taxRate: Double
  def applyTax(book: Book): Double
  protected def computeTax(book: Book) =
    (book.basePrice * taxRate)/100
}

case class SalesTax(taxRate: Double) extends Tax with Rounding {
  def applyTax(book: Book) = up(computeTax(book))
}

case class ImportDuty(taxRate: Double) extends Tax {

  Seq(1)
    .map(_ + 1)
    .filter(_ > 3)
    .sum

  def applyTax(book: Book) =
    if(book.isImported)  Rounding.down(computeTax(book))
    else                 0
}

case class Receipt(book: Book, taxes: Seq[Tax]) {
  def computedTaxes = taxes.map(tax => tax.applyTax(book))
  def totalTax = computedTaxes.sum
}

val b1 = Book("abc", "clojure is cool", 100, true)

Receipt(b1, Seq(SalesTax(12.3), ImportDuty(18))).totalTax


