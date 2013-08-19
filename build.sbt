libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-filter" % "0.6.8",
  "javax.servlet" % "servlet-api" % "2.3" % "provided",
  "net.databinder" %% "unfiltered-jetty"  % "0.6.8" % "test",
  "net.databinder.dispatch" %% "dispatch-core" % "0.11.0",
  "net.databinder.dispatch" %% "dispatch-json4s-native" % "0.11.0",
  "joda-time" % "joda-time" % "2.1",
  "org.joda" % "joda-convert" % "1.2")

scalaVersion := "2.10.2"

organization := "no.arktekk"

name := "jz"