name := "MyFirstServer"

version := "1.0.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(guice)

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"

