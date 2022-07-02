package Java;

import java.util.HashMap;

public class OccuranceofcharinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String string="SMNFJGHGKHKHNFHFJG";
HashMap<Character,Integer> hmap=new HashMap<>();
for(int i=string.length()-1;i>=0;i--) {
	if(hmap.containsKey(string.charAt(i))) {
	int	count=hmap.get(string.charAt(i));
	hmap.put(string.charAt(i), ++count);
	}
	else {
		hmap.put(string.charAt(i), 1);
	}
		
	
	}
System.out.println(hmap);
	
}
	}


