package Java;

public class numberofwordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Prerit Arora SELENIUM TESTING is NICE";
		int count=1;
		for(int i=0;i<str1.length();i++) {
			if((str1.charAt(i)==' ') && (str1.charAt(i + 1) !=' ') ) {
				count++;
				
			}
			
		}
		System.out.println(count);	

	}

}
