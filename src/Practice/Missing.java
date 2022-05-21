package Practice;

public class Missing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int a1[]= {10,2,3,4,6,7,8,9,1};
		// O(nlogn)  || O(n) space comp O(n)  
		
		int result[]=new int[11];  
		
		for(int i=1;i<=10;i++) {
			result[i]=-1; 
		}    
		
		for(int i=0;i<a1.length;i++) {
			result[a1[i]]=a1[i];
		}
		 
		
		
		
		System.out.println("Missing number are :");
		for(int i=1;i<=10;i++) { 
			
			if(a1[i]==-1) {
				System.out.println(i); 
			}
		}
		  
		
		}
		
		
//	String string=a1.toString();
//	String result;
//	int S=string.length();
//	
//		for (int i=0;i<S;i++)
//		{
//			if(i)
//			result=string.substring(charAt(i)-'1');	
//		}
//		
//		
//	}

}
