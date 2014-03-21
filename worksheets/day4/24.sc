import data._
import data.Data._


books

val publishers = Seq("artima", "manning")

case class Publication(book: Book, publisher: String)

books
  .filter(_.author == "odersky")
  .flatMap { book =>
    publishers
      .filter(_ == "artima")
      .map { publisher =>
        Publication(book, publisher)
      }
    } foreach println


for {
  book <- books
  if book.author == "odersky"
  publisher <- publishers
  if publisher == "artima"
} yield Publication(book, publisher)

Seq(1, 2, 3).map { item =>
  item + 4
}

Seq((1, 1), (2, 2), (3, 3)).map { item =>
  item._1 + item._2
}

Seq((1, 1), (2, 2), (3, 3)).map { case (first, second) =>
  first + second
}


books.map(_.basePrice).sum

books.foldLeft(0.0)((acc, elm) => acc + elm.basePrice)
































