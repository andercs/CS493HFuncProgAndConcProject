package server

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import java.net.ServerSocket
import users.User
import users.ClientConnection
import akka.actor.Props

case class StartServer()

class MudServer extends Actor {
  def receive = {
    case StartServer => startServer
  }

  private def startServer = {
    val serverPort = new ServerSocket(8080)

    while (true) {
      println("Listening for connections...")
      val clientConnection = serverPort.accept
      val user = context.actorOf(Props(new User))
      println("Connection made, creating user...")
      user ! ClientConnection(clientConnection)
    }
  }
}

object MudServer extends App {
  val system = ActorSystem("MorgantownMUD")
  val server = system.actorOf(Props(new MudServer), "server")
  println("Server starting...")
  server ! StartServer
}