import play.Project._

name := """mud-app"""

version := "1.0-SNAPSHOT"

exportJars := true

lazy val app = project.in(file("app"))

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.2.0", 
  "org.webjars" % "bootstrap" % "2.3.1", 
  "org.scalatest" %% "scalatest" % "2.1.6" % "test",
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.10" % "test"
)

playScalaSettings
