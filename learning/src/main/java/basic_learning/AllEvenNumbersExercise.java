package basic_learning;

public class AllEvenNumbersExercise {
	
	public static void main(String args[]){
		int i;
		for (i=0; i<=100; i++){  		
			if (i%2 == 0)//i mod 2 (if there is no remainder)
				System.out.println("value of i is :" +i);
		}
		
		int j;
		for (j=0; j<=100; j++){  		
			if (j%4 == 0)//i mod 2 (if there is no remainder)
				System.out.println("value of i is :" +j);
		}
		
	}
}
