package vn.anhtuan.demoAPI.POJO;

public class AuthRequest {
    private String email;
    private String password;
    private String username; // thêm dòng này

    public AuthRequest() {}

    public AuthRequest(String email, String password, String username) {
        this.email = email;
        this.password = password;
        this.username = username;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getUsername() { return username; } // getter
    public void setUsername(String username) { this.username = username; } // setter
}
