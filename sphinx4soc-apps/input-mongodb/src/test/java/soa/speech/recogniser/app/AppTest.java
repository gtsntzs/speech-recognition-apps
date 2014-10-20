package soa.speech.recogniser.app;

import org.apache.camel.CamelContext;
import org.apache.camel.EndpointInject;
import org.apache.camel.component.mock.MockEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration("file:src/main/resources/META-INF/spring/inputMongodbContext.xml")
public class AppTest extends AbstractTestNGSpringContextTests {
 
    @Autowired
    protected CamelContext camelContext;
 
//    @EndpointInject(uri = "mock:foo")
//    protected MockEndpoint foo;
 
//    @Test
    public void testMocksAreValid() throws Exception {
        // lets add more expectations
//        foo.message(0).header("bar").isEqualTo("ABC");
 
//        MockEndpoint.assertIsSatisfied(camelContext);
    }
}