Hawtio Jetty
============

To build this project use:

    mvn install


To run this project within a Jetty instance use the following Maven goal:

    mvn jetty:run

 
The project builds and uses Jetty to start an instance of a Hawtio Console.
Any existing instances of the console will be shut down.
     


Instructions for use of Hawtio Console
======================================

The Hawtio console will be made available at the default port, (8085).

E.g connect via http://localhost:8085

By default, authentication is not required (note: authentication is not yet supported in this version).

Provided that a JVM process has a Jolokia agent associated to it, the Hawtio Console can be used to connect to it.

The Discovery tab option can be used to locate Jolokia agents that have had discovery enabled.
 
The Remote tab option can be used to connect to the Jolokia agent.

Suggested setup for development is to adopt consistent use of ports for running individual Jetty instances 
and external ActiveMQ instances. The remote connection settings are persisted between Hawtio deployments.
The connection setting needed is to the agent url as show in the agent Discovery tab.
Once set up, the Remote tab can be used to initiate all the necessary connections.
