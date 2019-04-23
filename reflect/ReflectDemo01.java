package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 反射是java的一个动态机制。他将实例化对象，调用方法，操作属性等工作
 * 从编码期间确定转为在程序运行期间确定。这大大的提高了代码的灵活性。
 * 反射有更多的资源开销和较慢的运行效率，因此
 * 只在关键的地方使用反射，而不应大量应用。
 * 
 * Class类
 * 类对象Class,他的每一个实例是用来表示JVM已经加载的一个类。每个被JVM加载的类都有且只有一个Class的实例与之对应。
 * 通过类对象我们可以得知其表示的类的一切信息：
 * 类名、有哪些方法、那些属性、那些构造器等。
 * 并且可以快速实例化其表示的类的实例。
 * 
 * 反射的第一步就是获取要操作的类的类对象，而获取一个类的类对象有以下几种方式：
 * 1.每个类都有一个静态属性：class，可以直接得到这个类的类对象。
 * 但是由于这是调用静态属性，属于编码方式获取，所以不灵活。
 * 例如：Class cls = String.class;
 * 
 * 2.通过Class的静态方法forName得到，例如：
 * Class cls = Class.forName("java.lang.String")
 * 
 * 3.类加载器ClassLoader
 * 
 * @author Administrator
 *
 */
public class ReflectDemo01 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		//获取String的类对象
//		Class cls = String.class;
		
//		Class cls = Person.class;
		
//		Class cls = Class.forName("java.lang.String");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要加载的类的名字：");
		String className = sc.nextLine();//reflect.Person
		Class cls = Class.forName(className);
		System.out.println((Person)cls.newInstance());
		//获取类名
		String name = cls.getName();
		System.out.println("类名：" + name);
		/*
		 * Method类
		 * Method的每一个实例用于表示一个类中定义的一个方法。
		 * 通过它可以得到这个方法的相关信息，并且也可以调用这个方法
		 * 的相关信息（访问修饰符，返回值类型，方法名等），
		 * 并且也可以调用这个方法。
		 */
//		Method methods[] = cls.getMethods();
		//获取本类自己定义的方法
		Method methods[] = cls.getDeclaredMethods();
		for(Method method :methods) {
			System.out.println(method.getName());
		}
	}
}
