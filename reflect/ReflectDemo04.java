package reflect;

import java.lang.reflect.Method;

/**
 * 调用有参方法
 * @author adminitartor
 *
 */
public class ReflectDemo04 {
	public static void main(String[] args)throws Exception {
		Class cls = Class.forName("reflect.Person");
		Object obj = cls.newInstance();
		
		//say(String,int)
		Method method = cls.getDeclaredMethod(
				"say",String.class,int.class);
		method.invoke(obj,"Kamui",25);
		
		
	}
}








