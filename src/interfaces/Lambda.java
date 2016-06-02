package interfaces;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.swing.internal.plaf.basic.resources.basic;

@FunctionalInterface
interface Lambda {
	void test();
}

@FunctionalInterface
interface Lambda1 {
	void test(int i);
}

@FunctionalInterface
interface Lambda2 {
	void test(int i, int j);
}

@FunctionalInterface
interface Lambda3 {
	int test(int i);
}


class testLambda{

	public static void main(String[] args) {
		
		Lambda3 la3 = b -> b+10;
		System.err.println(la3.test(15));;
		
		//
		Lambda2 la2 = (x, y) ->{
			System.err.println("2个参数："+x);
			System.err.println("2个参数："+y);
		};
		la2.test(2, 6);
		
		//如果参数列表里面只有一个参数可以省略括号
		Lambda1 la1 = (x) -> System.err.println("一个参数，一行代码   "+x);
		la1.test(100);
		
		
		//使用匿名内部类使用
		Lambda lambda = new Lambda() {
			@Override
			public void test() {
				System.err.println("使用匿名内部类使用");
			}
		};
		lambda.test();
		
		
		//使用Lambda表达式实现
		// ->连接符
		//{} 方法体
		Lambda lambda2 = () -> {
			System.err.println("使用Lambda表达式实现");
		};
		lambda2.test();
		
		
		//如果方法休只有一句话
		Lambda lambda3 = () ->  System.err.println("使用最简化Lambda---表达式实现");
		lambda3.test();
		
		
	}
}