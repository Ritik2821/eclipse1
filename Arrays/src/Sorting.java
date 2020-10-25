import java.util.Scanner;
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {1,4,2,10};
		int n=a.length;
		
//		for(int i=0;i<n-1;i++) {                 //BUBBLE SORT
//			for(int j=0;j<n-1;j++) {
//				if (a[j+1]<a[j])
//				{
//					int temp=a[j+1];
//					a[j+1]=a[j];
//					a[j]=temp;
//				}
//				
//			}
//		}
//		for(int item:a) {
//			System.out.print(item+"  ");
//		}
		
		
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i;j<n;j++) {
				if(a[j]<a[min])
				{
					min=j;                     //SELECTION SORT
				}
			}
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
			for(int e:a) {
			System.out.print(e+"   ");
		}
	}

}
