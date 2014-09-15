package soa.speech.recogniser.file;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception {

		org.apache.camel.spring.Main main = new org.apache.camel.spring.Main();

		String configLocation = "/META-INF/mfccFileApp.xml";
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);                                          
		main.setApplicationContext(applicationContext);

		main.start();
		Thread.sleep(60 * 1000);
		main.stop();
	}
}
