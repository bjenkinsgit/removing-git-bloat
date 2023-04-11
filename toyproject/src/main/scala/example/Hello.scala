package example

object Hello extends Greeting with App {
  println(greeting)
  println("How are you!")
}

trait Greeting {
  lazy val greeting: String = "hello"
}
