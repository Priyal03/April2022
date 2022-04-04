
public class ParameterisedAndFunctional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calSumParameterised(5,0);
		
		System.out.println(sumFunctional(5));
	}

	private static int sumFunctional(int i) {
		// TODO Auto-generated method stub
		
		if(i==1)
			return i;
		
		
		return i+sumFunctional(i-1);
	}

	private static void calSumParameterised(int n, int sum) {
		// TODO Auto-generated method stub
		if(n<1) {
			System.out.println(sum);
			return;
		}
		calSumParameterised(n-1, sum+n);
	}

}
