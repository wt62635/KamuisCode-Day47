package reflect;

import java.lang.reflect.Method;

/**
 * 利用反射机制访问一类的私有方法
 * @author Administrator
 *
 */
public class ReflectDemo06 {
	public static void main(String[] args) throws Exception {
		//正常情况无法访问私有方法
		//Person p = new Person();
		//p.dosome();
		
		Class cls = Class.forName("reflect.Person");
		Object o = cls.newInstance();
		
		Method method = cls.getDeclaredMethod("dosome");
		//强制访问该私有方法（此处仅作为了解，实际中因违背封装性，所以慎用！）
		method.setAccessible(true);
		method.invoke(o);
	}
}
