package Week_8_Recap;

public class SiliconeAccount {
	private String email;
	private String userName;
	private String passWord;
	
	//First way, create constructor
//	public SiliconeAccount(String email, String userName, String passWord) {
//		super();
//		this.email=email;
//		this.userName=userName;
//		this.passWord=passWord;
//
//	}
	
	//second way, create method
	public void setAccountInfo(String email, String userName, String passWord) {
		this.email=email;
		this.userName=userName;
		this.passWord=passWord;
		System.out.println("Email: " + email);
		System.out.println("UserName: " + userName );
		System.out.println("Password: " +passWord);
		
	}
	public void setEmail(String email) {
		this.email=email;
		}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public void setPassWord(String passWord) {
		
		if(passWord.length()<6) {
			System.out.println("Password must be at least 6 character");
		}else {
		this.passWord=passWord;
		}
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return passWord;
	}

	public static void main(String[] args) {
		


	}

}
