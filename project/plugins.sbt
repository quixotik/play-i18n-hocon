logLevel := Level.Warn

resolvers += "jgit-repo" at "http://download.eclipse.org/jgit/maven"

resolvers += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.7.1")

// Code formatting
addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.2")

// Release plugins
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.2-1")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.5")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.11")

// Code coverage plugins
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")

addSbtPlugin("com.codacy" % "sbt-codacy-coverage" % "1.3.15")
