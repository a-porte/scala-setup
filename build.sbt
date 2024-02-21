val sparkVersion = "3.2.1"

lazy val root = (project in file("."))
  .settings(
    name := "project-name",
    version := "0.1",

    scalaVersion := "2.13.0",

    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.11" % "test",
      "org.apache.spark" %%"spark-core" % sparkVersion,
      "org.apache.spark" %% "spark-hive" % sparkVersion
    ),

    scalacOptions ++= Seq("-Xfatal-warnings")
  )

