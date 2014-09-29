---

## In Brief

This is a collection of examples using modern frameworks mainly in Java language.

a list of frameworks being used is:

* Apache Camel
* Apache Lucene
* Spring IO
* Maven

containers like:

* Fabric8.io
* Apache Karaf

and persistence providers :

* Apache Cassandra
* Apache Sorl
* RedisIO

## Prerequisite

In order to use the examples you need to have maven 3.2.1 and above, the git version control system and java 1.7 or greater.

## Maven Project Structure

The project structure is organised in a way to make life easier, but first lets put some terminology through. When a project ends with "Aggregator" implies that it 's none of the other sub-projects are dependent on it. If it contains "Parent" it manages all dependencies and plugins of the sub-projects. When contain none of the above terms its a project Example

In order to use an example it has to be packaged by packaging its Parent project.

## Learn by example

This website itself is generated using Reflow Maven skin and is written in Markdown.
The source code is [available on GitHub][reflow-src].

Look for the site configuration and web page sources in `/src/site` of each module;
and for plug-in configuration in respective POM files.

[reflow-src]: http://github.com/andriusvelykis/reflow-maven-skin "Reflow Maven skin source code"

## Tools

The tools being used: [Tools][tools]

[tools]: tools.html

---

## Acknowledgement

Some tools made this place to exist:

* Linux
* Java(TM)
* Apache
* Fabric8.io
* Spring IO
* git
* lighttable
