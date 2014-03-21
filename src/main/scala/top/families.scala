package top

case class Person(name: String, dob: String, dod: Option[String], mother: Option[Person]) {
  def isAlive = dod.isEmpty
  def hasMother = mother.nonEmpty
  def hasMotherWithName(otherName: String) =
    mother.exists(_.name == otherName)
}

case class FamilyTree(person: Person, childTrees: Seq[FamilyTree]) {
  lazy val progeny: Seq[Person] = person +: childTrees.flatMap(_.progeny)
  def liveProgenyCount = progeny.count(_.isAlive)
  def countProgenyWithSameName = progeny.count(_.name == person.name)
}

case class PeopleStore(people: Seq[Person]) {
  
  val db = people
    .filter(_.hasMother)
    .groupBy(_.mother.get)
  
  def familyTreeOf(person: Person): FamilyTree = {
    val childTrees = childrenOf(person).map(familyTreeOf)
    FamilyTree(person, childTrees)
  }

  def progenyOf(person: Person): Seq[Person] =
    person +: childrenOf(person).flatMap(progenyOf)
  
  def childrenOf(person: Person) = db.getOrElse(person, Seq.empty)
}

