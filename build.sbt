name := "scala-tapir-demo"

version := "0.1"

scalaVersion := "2.13.4"

libraryDependencies ++= Seq(
  "com.softwaremill.sttp.tapir" %% "tapir-core" % "0.17.7",
  "com.softwaremill.sttp.tapir" %% "tapir-json-circe" % "0.17.7",
  "com.softwaremill.sttp.tapir" %% "tapir-http4s-server" % "0.17.7",
  "org.http4s" %% "http4s-dsl" % "0.21.15",
  "io.circe" %% "circe-generic" % "0.13.0",
  "org.apache.logging.log4j" % "log4j-slf4j-impl" % "2.14.0",
  "com.softwaremill.sttp.client3" %% "async-http-client-backend-cats" % "3.0.0",
  "com.softwaremill.sttp.client3" %% "circe" % "3.0.0",
  "com.pauldijou" %% "jwt-circe" % "5.0.0",
  "io.circe" %% "circe-generic-extras" % "0.13.0"
)
