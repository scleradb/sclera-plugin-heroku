name := "sclera-plugin-heroku"

description := "Add-on that enables Sclera to work with data stored in Heroku PostgreSQL"

version := "4.0-SNAPSHOT"

organization := "com.scleradb"

organizationName := "Sclera, Inc."

organizationHomepage := Some(url("https://www.scleradb.com"))

startYear := Some(2012)

scalaVersion := "2.13.1"

licenses := Seq("Apache License version 2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0.txt"))

libraryDependencies ++= Seq(
    "org.postgresql" % "postgresql" % "42.2.8" % "provided",
    "com.scleradb" %% "sclera-plugin-postgresql" % "4.0-SNAPSHOT" % "provided",
    "com.scleradb" %% "sclera-core" % "4.0-SNAPSHOT" % "provided"
)

scalacOptions ++= Seq(
    "-Werror", "-feature", "-deprecation", "-unchecked"
)

exportJars := true
