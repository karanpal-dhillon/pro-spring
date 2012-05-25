package book.prospring.chapter01;

public interface MessageRender {
	public void render();
	public void setMessageProvider(MessageProvider provider);
	public MessageProvider getMessageProvider();
	
}
