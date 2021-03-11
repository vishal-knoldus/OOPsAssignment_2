package org.knoldus.main.classes
import org.knoldus.main.`trait`.Queue
class DoubleQueue extends Queue{
   def enQueue(element: Int): Unit = {
    queue = queue :+ element*2
  }
}
class SquareQueue extends Queue{
  def enQueue(element: Int):Unit = {
    queue = queue :+ element*element
  }
}