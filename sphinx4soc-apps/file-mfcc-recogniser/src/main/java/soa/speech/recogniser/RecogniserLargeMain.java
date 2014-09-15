package soa.speech.recogniser;

import org.apache.camel.spring.Main;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RecogniserLargeMain {

	public static void main(String[] args) throws Exception {

		Main main = new Main();

		String configLocation = "/META-INF/fileSpeechRecognitionApp.xml";
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
		main.setApplicationContext(applicationContext);

		main.start();
		Thread.sleep(90 * 1000);
		main.stop();
	}
}
