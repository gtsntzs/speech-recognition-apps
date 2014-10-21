package soa.speech.recogniser.app;

import org.apache.camel.CamelContext;
import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.mock.MockEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration("file:src/main/resources/META-INF/spring/inputMongodbContext.xml")
public class InputMongodbTest extends AbstractTestNGSpringContextTests {
 
    @Autowired
    protected CamelContext camelContext;
 
    @EndpointInject(uri = "mock:input.file.stream")
    protected MockEndpoint endEndpoint;
    
    @Produce(uri = "seda:read.next.file")
    protected ProducerTemplate testProducer;
 
    @Test
    public void testMocksAreValid() throws Exception {
        endEndpoint.expectedMessageCount(75);
        testProducer.sendBody("<name>test</name>");
        endEndpoint.assertIsSatisfied();

//        endEndpoint.expectedMessageCount(160);  
//        testProducer.sendBody("<name>test</name>");
//        endEndpoint.assertIsSatisfied();

    }
}