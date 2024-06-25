import java.util.Scanner;
import java.util.Arrays;

public class JobSequence
{
	public static void main(String []args)
	{
		Arrays arr<int> = new Arrays(int);
		String job[][] = {{'A','1','100'},{'B','2','60'},{'C','3','80'},{'D','2','10'},{'E','1','20'}};
		for(int i=0;i<n;i++)
		{
			arr[i] = int(job[i][2]);
		}
		arr[] = Arrays.sort(arr);
		System.out.println("Profits order:");
		for(i=arr.length;i>0;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Job Sequence that can be done is :");
		int max=3;int profit=0;
		for(job[i][1]<=max)
		{
			if(i%2==0)
			{
				System.out.println(job[i][0]+" "+job[i][1]+" "+job[i][2]);
				profit = profit+int(job[i][2])	;
			}
		}
		System.out.println("Max profit : "+profit);
		 
	}
