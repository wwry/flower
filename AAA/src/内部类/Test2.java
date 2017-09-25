package 内部类;

interface PrefixLogger{
	public void log(String message);
}

public class Test2 {  
	public PrefixLogger getLogger(final String perfix) {  
		class LoggerImpl implements PrefixLogger{

			@Override
			public void log(String message) {
				System.out.println(perfix +":"+message);
			}
			
		}
		return new LoggerImpl();

	}
	public static void main(String[] args) {
		Test2 test = new Test2();
		PrefixLogger logger = test.getLogger("DEBUG");
		logger.log("Local class example");
	}
}
