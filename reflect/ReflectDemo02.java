package reflect;

import java.util.Scanner;

/**
 * 利用反射实例化对象
 * 
 * @author Administrator
 *
 */
public class ReflectDemo02 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person p = new Person();
		System.out.println(p);
		/*
		 * 实例化Person类实例
		 */
		Scanner sc = new Scanner(System.in);
		Class cls = Class.forName("reflect.Person");
		String className = sc.next();
		/*
		 * Class提供的实例化方法要求其表示的类必须具有无参构造器，否则实例化时会抛出异常
		 */
		Object obj = cls.newInstance();
		
		System.out.println(obj);
		
	}
}
