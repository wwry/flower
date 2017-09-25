package 内部类;

public class Test3 {           //鍖垮悕鍐呴儴绫�
	public static void main(String[] args) {
		//A a = new A();
		Thread t = new Thread(new Runnable(){

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("a");
				}

			}
			
		});
		t.start();
	}
/*
	static class A implements Runnable {

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("a");
			}

		}

	}*/
}
