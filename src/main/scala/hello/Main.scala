package hello

import akka.actor.{ActorSystem, Props}

object Main extends App {
  val system = ActorSystem("HelloSystem")
  // using default Actor constructor
  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
  helloActor ! "hello"
  helloActor ! "buenos dias"

  system.terminate()
}

