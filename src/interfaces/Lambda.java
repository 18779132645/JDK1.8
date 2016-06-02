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
			System.err.println("2��������"+x);
			System.err.println("2��������"+y);
		};
		la2.test(2, 6);
		
		//��������б�����ֻ��һ����������ʡ������
		Lambda1 la1 = (x) -> System.err.println("һ��������һ�д���   "+x);
		la1.test(100);
		
		
		//ʹ�������ڲ���ʹ��
		Lambda lambda = new Lambda() {
			@Override
			public void test() {
				System.err.println("ʹ�������ڲ���ʹ��");
			}
		};
		lambda.test();
		
		
		//ʹ��Lambda���ʽʵ��
		// ->���ӷ�
		//{} ������
		Lambda lambda2 = () -> {
			System.err.println("ʹ��Lambda���ʽʵ��");
		};
		lambda2.test();
		
		
		//���������ֻ��һ�仰
		Lambda lambda3 = () ->  System.err.println("ʹ�����Lambda---���ʽʵ��");
		lambda3.test();
		
		
	}
}