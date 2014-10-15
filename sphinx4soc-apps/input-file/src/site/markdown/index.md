----

## Input MongoDB

MongoDB as input app.

## Configuration



## Schema

![mongodbSchema](media/Work/workspace/speech-recognition-apps/sphinx4soc-apps/input-mongodb/src/site/resources/images/sphinx4socMongodb.jpg)


## Deploy Spring MongoDB on Fabric8

Deploying the app to an Osgi container requires all the dependencies to be resolved. Spring Framework does not provide a ready to deploy bundle for the spring-data-mongodb artifact. The dependencies along with their versions has to be set manually using the bundles by the servicemix community. For the Spring MongoDB version 1.5.4.RELEASE the list of mandatory bundles is given below.


```xml
mvn:joda-time/joda-time/1.6.2
mvn:org.apache.servicemix.bundles/org.apache.servicemix.bundles.spring-core/3.2.10.RELEASE_1
mvn:org.apache.servicemix.bundles/org.apache.servicemix.bundles.spring-aop/3.2.10.RELEASE_1
mvn:org.apache.servicemix.bundles/org.apache.servicemix.bundles.spring-beans/3.2.10.RELEASE_1
mvn:org.apache.servicemix.bundles/org.apache.servicemix.bundles.spring-context/3.2.10.RELEASE_1
mvn:org.apache.servicemix.bundles/org.apache.servicemix.bundles.spring-tx/3.2.10.RELEASE_1
mvn:org.apache.servicemix.bundles/org.apache.servicemix.bundles.spring-expression/3.2.10.RELEASE_1
mvn:org.mongodb/mongo-java-driver/2.12.1

```

## More Info

More information of how to perform queries, store or delete documents go to the [persistence-mongodb](link) module.

## Prepare

How do the database is initialised.

MongoDB offers a place to store files in a binary form using the GridFS class, the files are stored in the collection fs.files. The schema spesifies the metadata store along with a file.
