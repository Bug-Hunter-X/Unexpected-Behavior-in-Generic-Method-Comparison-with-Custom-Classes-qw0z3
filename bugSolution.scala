```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T]): Boolean = {
    value.equals(other.value) // Use equals method for value comparison
  }
}

object Main extends App {
  case class Person(name:String) {
    override def equals(other: Any): Boolean = other match {
      case that: Person => this.name == that.name
      case _ => false
    }
    override def hashCode(): Int = name.hashCode
  }
  val p1 = new MyClass(Person("John"))
  val p2 = new MyClass(Person("John"))
  println(p1.myMethod(p2)) // This now prints true
}
```