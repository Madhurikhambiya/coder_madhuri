package BuilderPattern;

public class UserClass {
	//id , name , Email.
	
	private final String userName ;
	private  final String userid;
	private final String  useremail;
	private Object useremailid;
	
	// non you can't create a object of these class.
	
	private UserClass(UserBuilder obj) {
		this.userName = obj.userName;
		this.userid = obj.userid;
		this.useremailid = obj.useremailid;
		this.useremail = "";
		
		
	}

	
	public String getUserName() {
		return userName;
	}

	public String getUserid() {
		return userid;
	}

	public String getUseremail() {
		return useremail;
	}
	
	// static class to create a object of this class
	
	static class UserBuilder {
		private String userName;
		private String userid;
		private String useremailid;
		
		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}
		public UserBuilder setUserid(String userid) {
			this.userid = userid;
			return this;
		}
		public UserBuilder setUseremailid(String useremailid) {
			this.useremailid = useremailid;
			return this;
		}
		public  UserClass build() {
			UserClass user = new UserClass(this);
			return user;
			
		}
		
		
	     }
	}
	


