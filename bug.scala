```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T]): Boolean = {
    value == other.value // This is where the problem is if T is a custom class without proper equals
  }
}

object Main extends App {
  case class Person(name:String)
  val p1 = new MyClass(Person("John"))
  val p2 = new MyClass(Person("John"))
  println(p1.myMethod(p2)) // This prints false due to reference comparison
}
```