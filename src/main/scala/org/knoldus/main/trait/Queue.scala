package org.knoldus.main.`trait`
//In Queue Trait there are two methods one is abstract method which is enQueue and another one is concrete method which is deQueue
trait Queue {
  var queue: List[Int] = Nil
  def enQueue(element: Int)
  def deQueue(): Unit = {
    if (queue.isEmpty)
      println("Queue is Empty")
    else
      {
        queue = queue.tail
      }
  }
}