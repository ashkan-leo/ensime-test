
name := "dsi-match-engine-main"

organization := "com.conversantmedia"

val sparkVersion = "2.2.0"

scalaVersion in ThisBuild := "2.11.12"

resolvers += "Spark Packages Repo" at "http://dl.bintray.com/spark-packages/maven"

libraryDependencies += "org.parboiled"           %% "parboiled"          % "2.1.4"
libraryDependencies += "com.typesafe"            %  "config"             % "1.2.1"
libraryDependencies += "com.github.azakordonets" %  "fabricator_2.11"    % "2.1.5"
libraryDependencies += "org.parboiled"           %% "parboiled"          % "2.1.4"
libraryDependencies += "org.scalacheck"          %% "scalacheck"         % "1.13.4"  // Not in "test" because we create generators in this library!
libraryDependencies += "org.scalatest"           %% "scalatest"          % "3.0.3"   // Not in "test" because we create test stags in this library
libraryDependencies += "com.typesafe"            %  "config"             % "1.2.1"
libraryDependencies += "com.github.scopt"        %  "scopt_2.11"         % "3.7.0"
libraryDependencies += "org.apache.spark"        %% "spark-core"         % "2.2.0.cloudera2"        % "provided"
libraryDependencies += "org.apache.spark"        %% "spark-sql"          % "2.2.0.cloudera2"        % "provided"
libraryDependencies += "org.apache.spark"        %% "spark-hive"         % "2.2.0.cloudera2"        % "provided,test"
libraryDependencies += "org.apache.hadoop"        % "hadoop-core"        % "2.6.0-mr1-cdh5.12.0"    % "provided,test" excludeAll ExclusionRule(organization = "javax.servlet")
libraryDependencies += "org.apache.hadoop"        % "hadoop-minicluster" % "2.6.0"                  % "test"
libraryDependencies += "com.holdenkarau"         %% "spark-testing-base" % s"${sparkVersion}_0.8.0" % "test"  // requires sbt0.13.9+
libraryDependencies += "org.rogach"              %% "scallop"            % "3.1.2"

libraryDependencies += "io.frees" %% "frees-core" % "0.8.2"
libraryDependencies += compilerPlugin("org.scalameta" % "paradise" % "3.0.0-M11" cross CrossVersion.full)
libraryDependencies += compilerPlugin("org.spire-math" %% "kind-projector" % "0.9.8")
