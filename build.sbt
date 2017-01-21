
lazy val root = (project in file("."))
  .enablePlugins(AndroidApp)
  .settings(
    name := "test-espresso",
    scalaVersion := "2.11.8",
    version := "0.1",
    platformTarget := "android-23",
    javacOptions in Compile ++= Seq("-source", "1.7", "-target", "1.7"),
    libraryDependencies ++= Seq()
  )