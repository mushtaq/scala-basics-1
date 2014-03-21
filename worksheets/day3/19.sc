import data.Book
import data.Data._
books foreach println





books.map(_.basePrice)
books.filter(_.basePrice > 400) foreach println


val pf: PartialFunction[Book, Double] = {
  case Book(_, _, price, _) if price > 400 => price
}
pf.isDefinedAt(Book("odersky", "scala prog", 100, false))
pf.isDefinedAt(Book("odersky", "scala prog", 400, false))
pf.isDefinedAt(Book("odersky", "scala prog", 401, false))


books
  .filter(book => pf.isDefinedAt(book))
  .map(book => pf(book))
books.collect(pf)
books.collect {
  case Book(_, _, price, _) if price > 400 => price
}


books.map {
  case book if book.basePrice > 100 => 100
  case book                         => book.basePrice
}














