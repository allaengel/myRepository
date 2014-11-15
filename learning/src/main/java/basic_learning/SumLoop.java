package basic_learning;

public class SumLoop {
	// Sum (Loop): Write a program called Sum to produce the sum of 1, 2, 3, ..., to an upperbound limit of 2000;
	
	public static void main (String[] args){
		
		int sum=0;
		int count=1;
		
		do{
			sum=sum+count;
			System.out.println("The value of sum is : "+sum+" Count is : "+ count);
			
			count++;
		}while(sum<2000);
			
		
	}

}
