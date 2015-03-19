name := """kafka-on-actors"""

organization := "com.roundup"

version := "0.1"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.9",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.9" % "test",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "org.apache.kafka" % "kafka-clients" % "0.8.2.0",
  "org.apache.kafka" %% "kafka" % "0.8.2.0"
      exclude("javax.jms", "jms")
      exclude("com.sun.jdmk", "jmxtools")
      exclude("com.sun.jmx", "jmxri")
      exclude("org.slf4j", "slf4j-simple")
)

resolvers ++= Seq(
    "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
    "Apache repo" at "https://repository.apache.org/content/repositories/releases"
)

publishTo := Option(Resolver.defaultLocal)

// To be removed when publishing to Maven
isSnapshot := true