# How to build this project

To build PNML Framework libraries into the update site, run Maven on the config file PFW-Releng-Package.launch. Basically, it launches: _mvn clean package -Pall -Dmaven.javadoc.skip=true_

where _all_ is the id of a profile that is defined in the pom.xml file.

Once the build is completed, the PnmlFramework_UpdateSite/target/repository will contain the artefacts to publish in an Eclipse update site. 

If you want to install the built libraries in your local .m2 repository, run Maven on the config ile PFW-Releng-Install.launch. 
