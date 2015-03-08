/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smallbusiness;

import static smallbusiness.UserAccount.getInstance;
import java.util.Scanner;
/**
 *
 * @author egor
 */
public class SmallBusiness {
 public static UserAccount []arrUserAccountList=new UserAccount[10];
    public  static void load()
    {
        UserAccount obj1=getInstance("joe","111","jsmith@comp1.com");
        UserAccount obj2=getInstance("angel","222","arodriguez@comp1.com");
        UserAccount obj3=getInstance("sam","333","speterson@comp1.com");
        UserAccount obj4=getInstance("mary","444","mjohnson@comp1.com");
        UserAccount obj5=getInstance("nancy","555","nrivera@comp1.com");
        
        arrUserAccountList[0]=obj1;
        arrUserAccountList[1]=obj2;
        arrUserAccountList[2]=obj3;
        arrUserAccountList[3]=obj4;
        arrUserAccountList[4]=obj5;
    }
    public static boolean Authentication(String userrName,String password)
    {
       for(int i=0;i<10;i++)
       {
           if(arrUserAccountList[i]!=null)
           {
               if(userrName.equals(arrUserAccountList[i].getUserName())&& password.equals(arrUserAccountList[i].getPassword()))
                   return true;
           }
                    
       }
       return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String user;
        String pass;
        load();
        do{
            System.out.print("Welcome to authentication portal");
            System.out.println();
            System.out.print("\tPlease enter username\n");
            System.out.print("\t");
            user=scan.next();
            System.out.print("\tPlease enter password\n");
            System.out.print("\t");
            pass=scan.next();
            System.out.println();
            if(Authentication(user,pass))
                System.out.print("Access granted");
            else
                System.out.print("Access denied");
            System.out.println();
        }while(!user.equals("-1")&& !pass.equals("-1"));
      
    }
    
}
