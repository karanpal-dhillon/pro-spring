package book.prospring.chapter01;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class MessageSupportFactory {
	private Properties props;
	private MessageRender mr;
	private MessageProvider mp;
	private static MessageSupportFactory self = null;
	private MessageSupportFactory(){
		System.out.println("inside constructor");
		props = new Properties();
		try{
			props.load(new FileInputStream("/book/prospring/chapter01/msg.properties"));
			System.out.println("Properties loaded");
			String rendererClass = props.getProperty("render.class");
			String providerClass = props.getProperty("provider.class");
			mr = (MessageRender)Class.forName(rendererClass).newInstance();
			mp = (MessageProvider)Class.forName(providerClass).newInstance();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		catch(IllegalAccessException e){
			e.printStackTrace();
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static{
		self = new MessageSupportFactory();
	}
	
	public MessageProvider getMessageProvider(){
		return mp;
	}
	
	public MessageRender getMessageRender(){
		return mr;
	}
	
	public static MessageSupportFactory getInstance(){
		return self;
	}
	
	
}
