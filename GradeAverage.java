package day_1_Hcl_assgn;
import java.util.Scanner;

public class GradeAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0;
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter num of students:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("enter the grade of student"+i+":");
			int x=sc.nextInt();
			if(x>100) {
				System.out.println("grade cannot be greater than 100");
				i--;
				x=0;
			}
			s+=x;
			
		}
		int avg=s/n;
		System.out.println("\navg is:"+avg);

	}

}
