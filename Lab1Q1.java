package day_1_Hcl_assgn;

public class Lab1Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0;
		int a=0;
		int b=1;
		for(int i=0;i<20;i++) {
			System.out.println(b);
			int c=a+b;
			a=b;
			b=c;
			
			s=s+b;
		}
  int avg=s/20;
  System.out.println("\n");
  System.out.println(avg);
	}

}
