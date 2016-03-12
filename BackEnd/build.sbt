name := """Lifeline"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava,PlayEbean)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  "org.postgresql" % "postgresql" % "9.4.1208",
  "com.typesafe.play" %% "play-mailer" % "4.0.0-M1",
  javaWs
)
