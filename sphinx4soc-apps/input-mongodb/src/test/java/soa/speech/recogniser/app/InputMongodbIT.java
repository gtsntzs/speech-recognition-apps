package soa.speech.recogniser.app;

import org.apache.camel.CamelContext;
import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.mock.MockEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import soa.speech.persistence.mongodb.files.StoreSpeechDatabase;

@ContextConfiguration("file:src/main/resources/META-INF/spring/inputMongodbContext.xml")
public class InputMongodbIT extends AbstractTestNGSpringContextTests {
 
    @Autowired
    protected CamelContext camelContext;

    @Autowired
    protected GridFsTemplate gridFsTemplate;

    @Autowired
    protected MongoTemplate mongoTemplate;
    
    @EndpointInject(uri = "mock:input.file.stream")
    protected MockEndpoint endEndpoint;
    
    @Produce(uri = "seda:read.next.file")
    protected ProducerTemplate testProducer;
 
    @Test
    public void testMocksAreValid() throws Exception {
        endEndpoint.expectedMessageCount(75);
        testProducer.sendBody("<name>test</name>");
        endEndpoint.assertIsSatisfied();

    }
    
    @AfterClass
    public void cleanUp() {
        mongoTemplate.getDb().dropDatabase();
        logger.info("Speech database droped");
    }
}