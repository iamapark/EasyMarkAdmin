package dto;

public class Login {
	private String adminId = null;
	private String password = null;
	
	public Login() {
		super();
	}

	public Login(String adminId, String password) {
		super();
		this.adminId = adminId;
		this.password = password;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
