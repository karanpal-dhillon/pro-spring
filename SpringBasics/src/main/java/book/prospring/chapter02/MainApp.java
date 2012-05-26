package book.prospring.chapter02;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MessageRenderer mr = (MessageRenderer)context.getBean("messageRenderer");
		mr.render();

	}

}
