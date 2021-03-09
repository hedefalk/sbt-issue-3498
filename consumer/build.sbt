ThisBuild / scalaVersion     := "2.13.4"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "se.woodenstake"

lazy val root = (project in file("."))
  .settings(
    name := "consumer",
    Compile / sourceGenerators += Def.task {
      LocalPlugin.gen()
    }.taskValue
  )

