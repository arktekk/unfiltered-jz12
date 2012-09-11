seq(warSettings :_*)

libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-filter" % "0.6.3",
  "javax.servlet" % "servlet-api" % "2.3" % "provided",
  "net.databinder" %% "unfiltered-jetty"  % "0.6.3" % "test",
  "net.databinder" %% "dispatch-http" % "0.8.8",
  "net.liftweb" %% "lift-json" % "2.4",
  "joda-time" % "joda-time" % "2.1",
  "org.joda" % "joda-convert" % "1.2")

scalaVersion := "2.9.1"

organization := "no.arktekk"

name := "jz12"