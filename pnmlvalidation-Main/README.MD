# BUILDING PNML VALIDATION PROJECT

To build this project using Maven, we converted all our Eclipse platform plugins into Maven artefacts, deployed in our local Maven repository (.m2), using the Eclipse-to-Maven plugin. 

The command line was: eclipse:to-maven -DstripQualifier=true -DeclipseDir=/path/to/our/Eclipse/installed/distribution/

See: "http://maven.apache.org/plugins/maven-eclipse-plugin/to-maven-mojo.html":http://maven.apache.org/plugins/maven-eclipse-plugin/to-maven-mojo.html

The Eclipse distribution we usually use for this project is the Modelling Distribution.


  