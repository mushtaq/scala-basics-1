import data._
import data.Data._

books foreach println
books.take(2) foreach println
books.drop(2) foreach println
books.splitAt(2)

books.takeWhile(_.author == "minsky")

books.groupBy(_.author).mapValues(_.map(_.basePrice).sum)

Seq(2, 3, 1, 4).sorted

val ord = Ordering.fromLessThan[Book](_.basePrice > _.basePrice)

books.sorted(ord) foreach println
books.sortBy(_.basePrice) foreach println
books.sortWith(_.basePrice > _.basePrice) foreach println












