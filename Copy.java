package day_1_Hcl_assgn;

public class Copy {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
    int a[] = {1, 8, 3}; 
    Copy.CopyOf(a);
	        
	       
	    } 
	public static int[] CopyOf(int[] a) {
		int b[] = new int[a.length]; 

	    
	    b = a;     

	    System.out.println("\n\nContents of b[] "); 
	    for (int i=0; i<b.length; i++) {
	        System.out.print(b[i] + " "); 
	    
	    }
	return b;
	} 
}

