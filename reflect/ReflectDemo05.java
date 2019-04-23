package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 调用有参方法
 * @author adminitartor
 *
 */
public class ReflectDemo05 {
	public static void main(String[] args)throws Exception {
		Class cls = Class.forName("reflect.Person");
		Constructor arr[] = cls.getDeclaredConstructors();
		for (Constructor c : arr) {
			System.out.println(c);
		}
		//Person = p = new Person("张三");
		Constructor c = cls.getDeclaredConstructor(String.class);
		Object o = c.newInstance("张三");
		System.out.println(o);
	}
}








