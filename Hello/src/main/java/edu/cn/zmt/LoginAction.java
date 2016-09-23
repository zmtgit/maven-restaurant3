package edu.cn.zmt;

public class LoginAction {
     private String username;
     private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute(){
		String str=null;
		if("admin".equals(username)&&"123456".equals(password))
			str="success";
		else
			str="error";
		return str;
	}
	public String Login(){
		String str=null;
		return str;
	}
     
}
