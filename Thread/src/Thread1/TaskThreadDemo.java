package Thread1;

public class TaskThreadDemo {

	public static void main(String[] args) {
		try {
			Thread.sleep(2000);    //»√µ±«∞≥Ã–ÚÀØ2√Î÷”;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Runnable printA = new PrintChar('a',100);
		Runnable PrintB = new PrintChar('b',100);
		Runnable print100 = new PrintNum(100);
		
		Thread thread1 = new Thread(printA);
		Thread thread2 = new Thread(PrintB);
		Thread thread3 = new Thread(print100);
		
		thread1.start();
	//	thread2.start();
		thread3.start();
	    
	} 

}

class PrintChar implements Runnable{
	private char charToPrint;
	private int times;
	
	public PrintChar(char c, int t){
		charToPrint=c;
		times=t;
	}
	
	@Override
	public void run() {
		for(int i=1;i<times; i++){
			System.out.println(charToPrint);
			
		}
		
	}
	
}
class PrintNum implements Runnable{
	private int lastNum;
	
	public PrintNum(int n){
		this.lastNum = n;
	}
	@Override
	public void run() {
		Thread thread4 = new Thread(new PrintChar('c',40));
		thread4.start();
		try {
			for(int i =1; i<lastNum; i++){
			System.out.println(" "+i);
			if(i==50)thread4.join();
		    }
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
}