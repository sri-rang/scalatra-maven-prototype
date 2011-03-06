# Scalatra Maven Prototype

scalatra-maven-prototype is a port of [scalatra-sbt-prototype](https://github.com/scalatra/scalatra-sbt-prototype) as an Apache Maven project.

scalatra-sbt-prototype is the defacto getting started example for the Scalatra framework. It uses SBT, which is great. This is its port to Apache Maven.

Why Apache Maven? So that your Scalatra project plays nice with your existing Maven infrastructure.

# Getting started

1. Clone this repository:

		git clone git://github.com/Srirangan/scalatra-maven-prototype.git my-app

2. Change directory into your clone:

		cd my-app

3. Maven build

		mvn install

4. Start Jetty

		mvn jetty:run

5. Go to http://localhost:8080/

Learn more about [Scalatra](http://www.scalatra.org/)