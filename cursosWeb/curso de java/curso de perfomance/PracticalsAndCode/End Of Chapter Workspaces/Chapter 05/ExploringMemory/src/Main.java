
public class Main {

	
	public static void calculate(int localValue) {
		localValue = localValue * 100;
		System.out.println(localValue);
	}
	
	public static void main(String[] args) {
		int localValue = 5;
		calculate(localValue);
		System.out.println(localValue);

	}

}
