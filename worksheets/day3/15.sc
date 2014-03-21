case class Book(title: String, author: String, price: Double, isImported: Boolean)

val book = Book("scala", "odersky", 100, false)

object ImportedBook {
  def unapply(book: Book) = if(book.isImported) Some(book.title) else None
}

object DesiBook {
  def unapply(book: Book) = if(!book.isImported) Some((book.title, book.price)) else None
}

//val Book(name, author, price, flag) = book
book match {
  case Book(title, _, _, true)  => s"$title is imported"
  case Book(title, _, _, false) => s"$title desi book"
}

book match {
  case ImportedBook(name)  => s"$name is imported"
  case name DesiBook p => s"$name desi book at cheap price of $p"
}
























