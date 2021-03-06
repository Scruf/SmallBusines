package smallbusiness;
import java.util.UUID;
public class UserAccount {
    private UUID userAccountId;
    private String username;
    private String password;
    private String email;
  private  UserAccount()
    {
        this.userAccountId=UUID.randomUUID();
        this.username=" ";
        this.password=" ";
        this.email=" ";
    }
 private   UserAccount(String usr,String pass,String em)
    {
        this.userAccountId=UUID.randomUUID();
        setUsername(usr);
        setPassword(pass);
        setEmail(em);
    }
    public String getUserAccountId()
    {
        return userAccountId.toString();
    }
    public String getUserName ()
    {
        return username;
        
    }
    public String getPassword()
    {
        return password;
    }
    public String getEmail()
    {
        return email;
    }
    
    public void setUsername(String usr)
    {
        this.username=usr;
    }
    public void setPassword(String m_Password)
    {
        this.password=m_Password;
    }
    public void setEmail(String m_Email)
    {
        this.email=m_Email;
    }
    public static UserAccount getInstance()
    {
       
       UserAccount usr =  new UserAccount();
       return usr;
    }
    public static UserAccount getInstance(String U,String P,String E)
    {
        UserAccount usr = new UserAccount(U,P,E);
        return usr;
    }
    public boolean authenticate(String U,String P)
    {
        return ((U.equals(getUserName()))&&(P.equals(getPassword()))) ? true : false;
    }
}
