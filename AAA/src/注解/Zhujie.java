package 注解;

import org.junit.Test;

public class Zhujie { // 单元测试

	@Test
	public void test() throws NoSuchMethodException, SecurityException {
		Class<?> c = MyAnno.class; // 反射

		Id id = (Id) c.getAnnotation(Id.class); // 获得MyAnno类中的所有注解
		System.out.println(id);
		if (id.age() >= 18) {

		} else {

		}

		Id idOnMathod = c.getMethod("foo").getAnnotation(Id.class);
		System.out.println(idOnMathod);

	}

}
