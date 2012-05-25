package book.prospring.chapter01;

public class StandardOutMessageRender implements MessageRender {

	private MessageProvider provider;
	@Override
	public void render() {
		if(provider == null){
			throw new RuntimeException("No Message Provider");
		}
		System.out.println(provider.getMessage());

	}

	@Override
	public void setMessageProvider(MessageProvider provider) {
		this.provider = provider;

	}

	@Override
	public MessageProvider getMessageProvider() {
		// TODO Auto-generated method stub
		return provider;
	}

}
