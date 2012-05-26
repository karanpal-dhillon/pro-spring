package book.prospring.chapter02;

public interface MessageRenderer {
	public void render();
	public void setMessageProvider(MessageProvider mp);
	public MessageProvider getMessageProvider();
}
