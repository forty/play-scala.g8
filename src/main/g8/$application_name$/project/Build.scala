import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName = "$application_name$"
  val appVersion = "1.0"

  val appDependencies = Seq( // Add your project dependencies here,
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    lessEntryPoints <<= (sourceDirectory in Compile)(base => (
      (base / "assets" / "stylesheets" / "bootstrap" / "bootstrap.less") +++
      (base / "assets" / "stylesheets" / "bootstrap" / "responsive.less")))
      // Add your own project settings here      
    )

}
