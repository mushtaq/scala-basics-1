package top

case class Book(
  isbn: String,
  title: String,
  basePrice: Double,
  isImported: Boolean
)

case class Receipt(
  book: Book,
  totalTax: Double
)
