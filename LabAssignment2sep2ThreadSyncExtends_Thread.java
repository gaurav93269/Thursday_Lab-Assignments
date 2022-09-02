
package lab;
//Write a program to find second minimum and second maximum number from the array which will demonstrate thread synchronization

public class Thread_sync extends Thread {

	public int getSecondmaximun(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-2];  
		}
	public int getSecondminimum(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] < a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-2];  
		}  
	public void run() {
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		System.out.println("Second Largest: "+getSecondmaximun(a,6));  
		System.out.println("Second Largest: "+getSecondmaximun(b,7)); 
		System.out.println("Second smallest: "+getSecondminimum(a,6));  
		System.out.println("Second smallest: "+getSecondminimum(b,7));



	}
		public static void main(String args[]) throws InterruptedException{  

		Thread_sync obj=new Thread_sync();
		obj.start();
		Thread_sync.sleep(1000);
		Thread_sync obj1=new Thread_sync();
        obj1.start();


		} 



