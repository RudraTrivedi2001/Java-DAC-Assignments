package Assignment_1_All;

public class TwiceElement {
	public static void main(String[] args) {
		
		int aa[]= {1,2,3,4,5,2,3,4,5};
	int temp[]=new int[aa.length];
		for(int i=0;i<aa.length;i++) {
		 temp[i]=aa[i];
		}
		
		for(int i=0;i<temp.length;i++) {
			for(int j=i+1;j<temp.length;j++) {
			if(aa[i]==temp[j]) 
			{
				System.out.print(temp[j]+" ");
			}
			
		}
	}
	}
	}
