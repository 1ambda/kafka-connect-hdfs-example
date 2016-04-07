name := "kafka-connector-hdfs-example"

version := "1.0"

scalaVersion := "2.11.8"

val LIB_VERSION_HADOOP = "2.6.0"
val LIB_VERSION_HIVE = "1.2.1"
val LIB_VERSION_KAFKA = "0.9.0.0-cp1"
val LIB_VERSION_CONFLUENT = "2.0.0"
val LIB_VERSION_SCALATEST = "3.0.0-M15"
val LIB_VERSION_TYPESAFE_CONFIG = "1.3.0"
val LIB_VERSION_SLF4J = "1.7.21"
val LIB_VERSION_LOGBACK = "1.1.7"
val LIB_VERSION_IVY = "2.4.0"

resolvers ++= Seq(
  "confluent" at "http://packages.confluent.io/maven/",
  "conjars" at "http://conjars.org/repo/"
)

libraryDependencies ++= Seq(
  /** scala */
  "com.typesafe" % "config" % LIB_VERSION_TYPESAFE_CONFIG,
  "org.scalatest" %% "scalatest" % LIB_VERSION_SCALATEST % "test",
  /** java */
  "io.confluent" % "kafka-connect-hdfs" % LIB_VERSION_CONFLUENT,
  "org.slf4j" % "slf4j-api" % LIB_VERSION_SLF4J,
  "ch.qos.logback" % "logback-classic" % LIB_VERSION_LOGBACK,
  "ch.qos.logback" % "logback-core" %  LIB_VERSION_LOGBACK,
  "org.apache.hadoop" % "hadoop-client" % LIB_VERSION_HADOOP,
//  "org.apache.hadoop" % "hadoop-minijdc" % LIB_VERSION_HADOOP % "test",
//  "org.apache.hadoop" % "minicluster" % LIB_VERSION_HADOOP % "test",
  "org.apache.hive" % "hive-cli" % LIB_VERSION_HIVE % "compile",
  "org.apache.hive" % "hive-exec" % LIB_VERSION_HIVE % "compile",
  "org.apache.hive" % "hive-common" % LIB_VERSION_HIVE % "compile",
//  "org.apache.hive" % "hive-hcatalog-core" % LIB_VERSION_HIVE % "compile",
  "org.apache.parquet" % "parquet-hadoop-bundle" % "1.7.0",
  "org.apache.parquet" % "parquet-avro" % "1.7.0",
  "org.apache.parquet" % "parquet-column" % "1.7.0",
  "org.apache.parquet" % "parquet-hadoop-bundle" % "1.7.0",
  "org.apache.avro" % "avro-mapred" % "1.7.7"
)