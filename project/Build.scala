import sbt._
import sbt.Keys._

object ApplicationBuild extends Build {

  val appName = "play-plugins-salat-fixture"

  val baseSettings = Seq(
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "2.10.3",
    scalaBinaryVersion := "2.10",
    crossScalaVersions := Seq("2.10.3"),
    organization := "jp.osd"
  )

  val appDependencies = Seq(
    "se.radley" %% "play-plugins-salat" % "1.4.0",
    "com.typesafe.play" %% "play" % "2.2.2" % "provided"
  )

  val main = Project(id = "play-plugins-salat-fixture", base = file("."))
    .settings(baseSettings: _*)
    .settings(
      name := appName,
      scalacOptions ++= Seq("-encoding", "UTF-8", "-deprecation", "-unchecked", "-feature"),
      scalacOptions in Test ++= Seq("-Yrangepos"),
      parallelExecution in Test := false,
      libraryDependencies ++= appDependencies
    )
    
}
