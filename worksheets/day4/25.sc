import top.{PeopleStore, Person}

val p1 = Person("p1", "23May", Some("25Dec"), None)
val p2 = Person("p2", "23May", Some("25Dec"), Some(p1))
val p3 = Person("p3", "23May", None, Some(p1))
val p4 = Person("p4", "23May", Some("25Dec"), Some(p2))

val store = PeopleStore(Seq(p1, p2, p3, p4))
//val tree = store.familyTreeOf(p2)
//tree.progeny foreach println
store.progenyOf(p2) foreach println




