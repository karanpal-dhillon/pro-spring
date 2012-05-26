package book.prospring.chapter02;

public class StandardOutputMessageRenderer implements MessageRenderer {
	private MessageProvider mp;

	public void render() {
		System.out.println(mp.getMessage());

	}

	public void setMessageProvider(MessageProvider mp) {
		this.mp = mp;

	}

	public MessageProvider getMessageProvider() {
		// TODO Auto-generated method stub
		return mp;
	}

}
