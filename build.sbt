organization := "com.turbolent"
name := "xdotai-diff"
version := "1.3.0"

scalaVersion := "2.12.1"

scalacOptions ++= Seq("-feature", "-Xfatal-warnings")

libraryDependencies ++= Seq(
  "com.chuusai" %% "shapeless" % "2.3.2",
  "org.cvogt" %% "scala-extensions" % "0.5.3"
)

publishMavenStyle := true

publishTo := {
  val repositoryPath = System.getProperty("repositoryPath")
  if (repositoryPath == null) None
  else Some("internal.repo" at file(repositoryPath).toURI.toURL.toString)
}
