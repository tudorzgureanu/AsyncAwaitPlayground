name := "AsyncAwaitPlayground"

organization := "com.ted"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.0"

//scalacOptions += "-Ymacro-debug-lite"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-async" % "0.9.6",
  "org.scalatest" %% "scalatest" % "3.0.0" % "test"
)
