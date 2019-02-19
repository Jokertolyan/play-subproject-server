name := "play-subproject-server"
 
version := "1.0"

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

lazy val server = (project in file("server") )
  .enablePlugins(PlayScala)
  .settings(
    scalaVersion := "2.11.11",
    libraryDependencies ++= Seq( jdbc , cache , ws , specs2 % Test ),
    name := "server"
  )

lazy val root = (project in file("."))
  .settings(
    name := "root"
  )
