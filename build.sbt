lazy val root = (project in file("."))
  .settings(
    name := "project-name",
    version := "0.1",

    scalaVersion := "2.13.0",

    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest-funspec" % "3.2.11" % "test"
    ),

    scalacOptions ++= Seq("-Xfatal-warnings")
  )

