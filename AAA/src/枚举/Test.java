package 枚举;

public class Test {
	 private Integer id;
	 private String name;
	 private static Gender gender=Gender.F;
	 private  Gender gender2 =Gender.G;
	 public static void foo(){ 
		//枚举放在switch中：
		switch(gender){
		case F:
			System.out.println("FfFfFf");
			break;
		case M:
			System.out.println("MMMMMM");
			break;
		default:
			System.out.println("default");
		} 
		          
		//遍历枚举
		for(Gender g : Gender.values()){   
			System.out.println(g);
		}
		
	 }
	 
	public static void main(String[] args) {
		foo();
	}

}
