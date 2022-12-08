package reliancee;

public class Test {
	public static void main(String[] args) {
		String a="Test@123 GE";
		String i= a.toUpperCase();
		int b=i.length();
		int vovel=0;
		int con=0;
		int no=0;
		int sc=0;
		for(int c=0;c<b;c++)
		if(a.charAt(c)!=' '){
			if(a.charAt(c)>='A' && a.charAt(c)<='Z') {
			if(a.charAt(c)=='A'|| a.charAt(c)=='E' || a.charAt(c)=='I' || a.charAt(c)=='O' || a.charAt(c)=='U' ) {
		vovel++;	
				}
				else{
				con++;
			}
	}
			
			if(a.charAt(c)>=0 || a.charAt(c)<=9) {
				no++;
				}
			else {
				sc++;
			}
			//System.out.println(a.charAt(c));
			System.out.println("con"+con);
			System.out.println("vovel"+vovel);
			
		System.out.println("no"+no);
		System.out.println("sc"+sc);
			}
		
		
	}
	
		
	
	
}
