package server

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

case class StartServer()

class MudServer extends Actor {
  def receive = null
}

object MudServer extends App {
  val system = ActorSystem("MorgantownMUD")
  val server = system.actorOf(Props(new MudServer()), "server")
  server ! StartServer
}