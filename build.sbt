val scala3Version = "3.2.0"

organization := "icu.harx"

lazy val root = project
  .in(file("."))
  .settings(
    name := "pojo-plugin",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scala-lang" %% "scala3-compiler" % scala3Version
  )
