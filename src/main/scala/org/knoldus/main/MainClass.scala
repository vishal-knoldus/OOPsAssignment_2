package org.knoldus.main
import org.knoldus.main.classes.{DoubleQueue, SquareQueue}
object MainClass extends App {
  var doubleQueueObject = new DoubleQueue
  var squareQueueObject = new SquareQueue
  doubleQueueObject.enQueue(5)
  doubleQueueObject.enQueue(6)
  doubleQueueObject.enQueue(3)
  doubleQueueObject.deQueue()
  doubleQueueObject.deQueue()
  //Printing of elements of Double queue
  if( doubleQueueObject.queue.isEmpty)
    println("Queue is Empty")
  else {
    println("Elements of Queue are: ")
    for(element <- doubleQueueObject.queue)
      print(element+" ")
    println()
  }
  squareQueueObject.enQueue(1)
  squareQueueObject.enQueue(2)
  squareQueueObject.enQueue(3)
  squareQueueObject.enQueue(4)
  squareQueueObject.enQueue(5)
  squareQueueObject.deQueue()
  squareQueueObject.deQueue()
  squareQueueObject.deQueue()
  //Printing of elements of Square Queue
  if( squareQueueObject.queue.isEmpty)
    println("Queue is Empty")
  else {
    println("Elements of Queue are: ")
    for(element <- squareQueueObject.queue)
      print(element+" ")
    println()
  }
}
