import com.github.sbt.JavaFormatterPlugin.autoImport.*
import com.google.googlejavaformat.java.JavaFormatterOptions

enablePlugins(GatlingOssPlugin)

organization := "io.gatling"
licenses := Seq("Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0.html"))
startYear := Some(2024)

githubPath := "gatling/gatling-shared-cli"
gatlingDevelopers := Seq(
  GatlingDeveloper("slandelle@gatling.io", "Stephane Landelle", isGatlingCorp = true)
)

lazy val root = (project in file("."))
  .settings(
    name := "gatling-shared-cli",
    crossPaths := false, // drop off Scala suffix from artifact names.
    autoScalaLibrary := false, // exclude scala-library from dependencies
    libraryDependencies ++= Seq(
      "org.jspecify" % "jspecify" % "1.0.1"
    ),
    javafmtOnCompile := !sys.env.getOrElse("CI", "false").toBoolean,
    javafmtFormatterCompatibleJavaVersion := 21,
    javafmtStyle := JavaFormatterOptions.Style.GOOGLE,
    Compile / packageSrc / mappings := Nil
  )
