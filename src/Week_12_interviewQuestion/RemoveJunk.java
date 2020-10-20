package Week_12_interviewQuestion;

public class RemoveJunk {

	public static void main(String[] args) {
	
		//Extract latin characters , space and numbers out of this string	

		String string= "Interview @&^%*((Week12345";
		
		string=string.replaceAll("[^a-zA-Z ]", "");
		
		System.out.println(string);
		
		String string2="Seleni12345um";
		
		string2=string2.replaceAll("[^a-zA-Z ]", "");
		
		System.out.println(string2);



	}

}
