ThisBuild / scalaVersion     := "2.12.13"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "se.woodenstake"

lazy val root = (project in file("."))
  .settings(
    name := "library",
    crossPaths := false
  )