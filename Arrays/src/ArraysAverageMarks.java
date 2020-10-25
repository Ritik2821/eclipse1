import java.util.Scanner;
public class ArraysAverageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of students");
		int n=sc.nextInt();
		
		int marks[]=new int[n];
		System.out.println(" Enter Marks Now");
		for(int i=0;i<n;i++) {
			marks[i]=sc.nextInt();                              //AVERAGE ARRAY
		}
		int AverageMarks=0;
		for(int i=0;i<n;i++) {
			AverageMarks=AverageMarks+marks[i];
			
		}
		AverageMarks/=n;
		System.out.println("Average of an array is  "+AverageMarks);
		
	}

}
