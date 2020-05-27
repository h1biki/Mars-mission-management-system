public class Person {
    private String userName;
    private String userPassword;
    private String userPermission;
    private String contactInformation;

    public Person(String userName, String userPassword, String userPermission, String contactInformation) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userPermission = userPermission;
        this.contactInformation = contactInformation;
    }

    public Person() {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPermission() {
        return userPermission;
    }

    public void setUserPermission(String userPermission) {
        this.userPermission = userPermission;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }
}
