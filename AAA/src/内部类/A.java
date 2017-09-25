package 内部类;

public class A {
	private static int a=1;
      static class B{        //闈欐?佸唴閮ㄧ被
    	  int a=4;
    	   int foo(){
    		 
    		  return A.a;
    	  }
      }
      
      class C{  
    	  int a =2;
      }
      
      public static void main(String[] args) {
		B b = new B();
		System.out.println(b.a);
		
		A a = new A();
		A.C c =a.new C(); 
		
	}
}
