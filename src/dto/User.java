
package dto;

public class User {
    private String userID;
    private String fullName;
    private String password;
    private boolean status;

    public User(String userID, String fullName, String password, boolean status) {
        this.userID = userID;
        this.fullName = fullName;
        this.password = password;
        this.status = status;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
