package library

object StringExtensions {

  implicit class RichString(val s: String) extends Common

  trait Common {
    def s: String

    def makeXml = <a>s</a>
    def hello = s"hello: $s"
  }

}
