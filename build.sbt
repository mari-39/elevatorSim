ThisBuild / scalaVersion := "3.5.2"
ThisBuild / version := "0.0.1"

libraryDependencies += "org.scalameta" %% "munit" % "1.0.0-M10" % Test
libraryDependencies += "org.scalameta" %% "munit-scalacheck" % "1.0.0-M10" % Test

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.5"

lazy val root = (project in file("."))
  .settings(
    name := "elevatorSim"
  )
