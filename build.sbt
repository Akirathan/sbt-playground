lazy val `lib` = (project in file("lib"))
  .settings(
    version := "0.1.0",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.9" % "test"
    )
  )
