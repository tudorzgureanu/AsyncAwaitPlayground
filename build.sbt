name := "AsyncAwaitPlayground"

organization := "com.ted"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.0"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.0" % "test"
)

initialCommands := "import example._"
