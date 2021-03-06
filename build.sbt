name := "scala-crash-course-es"

version := "1.0"

addCommandAlias("namaste", "~test-only es.lambda.functionalkoans.forscala.Koans")

scalaVersion := "2.10.4"

traceLevel := -1

logLevel := Level.Info

// disable printing timing information, but still print [success]
showTiming := false

// disable printing a message indicating the success or failure of running a task
showSuccess := false

// append -deprecation to the options passed to the Scala compiler
scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

// disable updating dynamic revisions (including -SNAPSHOT versions)
offline := true

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.9.1" % "test" withSources() withJavadoc()
)
