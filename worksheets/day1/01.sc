def drinkStrategy(age: Int) = age > 50

class Person(age: Int, isFemale: Boolean) {

  def wisdomAge = if(isFemale) 18 else 21

  def isWise = age >= wisdomAge

  def canMarry(canDrink: Int => Boolean) = canDrink(age) && isWise
}

val person = new Person(10, false)
person.canMarry(age => age >= 40)
//person.canMarry(_ >= 40)
person.canMarry(drinkStrategy)

val x: Int => Boolean = drinkStrategy

person.canMarry(age => drinkStrategy(age))
//person.canMarry(drinkStrategy(_))

