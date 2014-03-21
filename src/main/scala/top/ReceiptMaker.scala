package top

object ReceiptMaker {
  def make(book: Book, taxes: Seq[Tax]): Receipt = {
    val computedTaxes = taxes.map(tax => tax.applyTax(book))
    val totalTax = computedTaxes.sum
    Receipt(book, totalTax)
  }
}
