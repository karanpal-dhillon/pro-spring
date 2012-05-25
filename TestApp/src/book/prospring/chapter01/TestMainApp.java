package book.prospring.chapter01;

public class TestMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is a test app to learn spring framework using pro spring 3 book.");
		MessageRender mr = MessageSupportFactory.getInstance().getMessageRender();
		MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();
	}

}
