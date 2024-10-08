import java.util.concurrent.TimeUnit;

public class Heron {

	public static void main(String[] args) {
		
		try {
			
			//Finding the Square root using Heron's algorithm
			double result = SquareRoot(479678);
			System.out.println("Square root found! Answer: " + result);
			
			//Find the maximum number in an array
			double[] numArray = new double[] {2, 4, 5, 6, 6, 1, -2, 0, 7, 10, 10, 20, 100};
			double max = ComputeMax(numArray);
			System.out.println("The biggest number in the array is: " + max);

			
		} catch (Exception e) {
			System.out.println("Error square rooting");
		}
		
	}
	
	public static double ComputeMax (double[] array) {
		
		double currMax = -1.0/0.0;
		
		for (int i = 0; i < array.length; i++) {
			if( array[i] > currMax) {
				currMax = array[i];
			}
		}
			
		return currMax;
	
	}
	
	public static double SquareRoot(int num) {
		double a_ = 1.0;
		
		while (true) {
			double prev = a_;
			a_ = (a_ + (num/a_)) * 0.5;
			
			if (prev == a_) {
				break;
			}
			
			System.out.println(a_);

			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (Exception e) {
				System.out.println("Error square rooting");

			}
		}
		
		return a_;
	} 
	
}
