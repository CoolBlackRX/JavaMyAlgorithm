package MyTest;

public class Hello {
    private String UserName;
    private Integer PassWord;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public Integer getPassWord() {
        return PassWord;
    }

    public void setPassWord(Integer passWord) {
        PassWord = passWord;
    }

    @Override
    public String toString() {
        return "Hello [PassWord=" + PassWord + ", UserName=" + UserName + "]";
    }
    
    
    
}