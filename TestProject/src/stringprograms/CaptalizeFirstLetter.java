package stringprograms;

public class CaptalizeFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="principal madam and mom are good friendsforever";
		
		String[]s1=s.split(" ");
		String s2="";
		
		for (int i = 0; i < s1.length; i++) {
			s2=s1[i].substring(0,1).toUpperCase()+s1[i].substring(1);
			System.out.println(s2);
		}
	}

}
