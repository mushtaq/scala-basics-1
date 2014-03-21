
case class Book(
  isbn: String,
  title: String,
  basePrice: Double,
  isImported: Boolean
  )    {
}

val books = Seq(
  Book("123", "scala", 100, true),
  Book("123", "scala", 200, false)
)

books.map(_.basePrice)
books.filter(_.isImported)
books.collect {
  case Book(_, _, price, true) => price
}

def size(obj: Any) = obj match {
  case 1 => 1
  case 10 | 11| 21 => 2
  case x: String => x.length
  case x if x == "aa" => "bb"
  case x: Int if x > 20 => 20
  case (a: Int, b: Int) => a + b
  case book @ Book(isbn, _, price @ 100, true) =>
    val tax = price * 12 /100
    s"book with id: $isbn and title: ${book.title} is taxed at $tax"
  case book: Book => book.basePrice
  case Seq(1, a) => a
  case _ => obj
}
size(Book("123", "scala", 100, true))
size(Book("123", "scala", 100, false))
size(Seq(1, 55))
