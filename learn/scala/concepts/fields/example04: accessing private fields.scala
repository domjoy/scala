package learn.scala.concepts.fields

class ReadOnlyCounter {
  private var value = 0
  def incr() { value += 1 }
  def current = value
}

object DemoReadOnlyCounter extends App {
  var f = new ReadOnlyCounter
  f.incr
  println(f.current)
}