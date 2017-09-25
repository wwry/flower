package Thread1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskThreadDemo2 {     //Ïß³Ì³Ø

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		executor.execute(new PrintChars('a',100));
		executor.execute(new PrintChars('b',100));
		executor.execute(new PrintNums(100));
		
		executor.shutdown();
	    
	} 

}

class PrintChars implements Runnable{
	private char charToPrint;
	private int times;
	
	public PrintChars(char c, int t){
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
class PrintNums implements Runnable{
	private int lastNum;
	
	public PrintNums(int n){
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
