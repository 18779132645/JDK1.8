package interfaces;

public interface ForMula {

	double calculate(int a);
	
	default double sqrt(int a){
		return Math.sqrt(a);
	}
}


class test{
	
	public static void main(String[] args) {
		ForMula forMula = new ForMula() {
			@Override
			public double calculate(int a) {
				return sqrt(a*100);
			}
		};
		System.out.println(forMula.calculate(100));;
		System.out.println(forMula.sqrt(16));;
	}
}