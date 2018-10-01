public class MaxSubSet {

	public static void main(String[] args) {

		int[] eg1 = new int[]{1, -2, 12, -1, 2};
		int[] eg2 = new int[]{13, 9, -25, 5, 8, 8,-3, 5,3,-10};
		int[] eg3 = new int[]{12, -1, -2};

		findMaxSubSet(eg1);   // [12,-1,2] is max sub set
		findMaxSubSet(eg2);   // [5,8,8,-3,5,3] is max sub set
		findMaxSubSet(eg3);   // [12] is max sub set

	}

	static void findMaxSubSet(int[] arg){

		int start= 0;
		int end = 0;
		int maxSum = 0 ;

		for(int i = 0; i < arg.length; i++){
			int sum = 0;

			for(int k = i; k < arg.length; k++){

				sum += arg[k];
				if(sum > maxSum){
					maxSum = sum;
					start = i;
					end = k;
				}
			}

		}


		System.out.print("start index: " + start + " end index : " + end + " max sum of subset is: " + maxSum);

	}
}
