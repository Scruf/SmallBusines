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
      // Scanner scan = new Scanner (System.in);
        String user;
        String pass;
        load();
       int count=1;
       while(count<10)
       {
            switch(count)
            {
                case 1:

                    user="-1";
                    pass="-1";
                    System.out.println();     
                    while(!user.equals("-1")||!pass.equals("-1"))
                    {
                        System.out.print("Welcome to Authentication portal");
                        System.out.print("\nPlease enter your username");
                        System.out.print("\n\tUsername= "+user);
                        System.out.print("\nPlease enter your password");
                        System.out.print("\n\tPassword= "+pass);
                            if(Authentication(user,pass))
                             {
                                 System.out.print("\nAccess granted");
                                 user="-1";
                                 pass="-1";
                             }
                             else
                             {
                                 System.out.print("\nAccess denied");
                                 user="-1";
                                 pass="-1";
                             }
                    }
                    count++;
                    System.out.println();
                            break;
                    
                case 2:

                    System.out.println();
                    user="joe";
                    pass="111";
                    System.out.println();
                    while(!user.equals("-1")||!pass.equals("-1"))
                    {
                        System.out.print("Welcome to Authentication portal");
                        System.out.print("\nPlease enter your username");
                        System.out.print("\n\tUsername= "+user);
                        System.out.print("\nPlease enter your password");
                        System.out.print("\n\tPassword= "+pass);
                                if(Authentication(user,pass))
                                {
                                    System.out.print("\nAccess granted");
                                    user="-1";
                                    pass="-1";
                                }
                                else
                                {
                                    System.out.print("\nAccess denied");
                                    user="-1";
                                    pass="-1";
                                }
                         count++;
                         System.out.println();
                         System.out.println();
                    }
                    
                    System.out.println();
                             break;
                     case 3:

                    System.out.println();
                    user="nancy";
                    pass="555";
                    
                    System.out.println();
                    while(!user.equals("-1")||!pass.equals("-1"))
                    {
                            System.out.print("Welcome to Authentication portal");
                            System.out.print("\nPlease enter your username");
                            System.out.print("\n\tUsername= "+user);
                            System.out.print("\nPlease enter your password");
                            System.out.print("\n\tPassword= "+pass);
                                if(Authentication(user,pass))
                                {
                                    System.out.print("\nAccess granted");
                                    user="-1";
                                    pass="-1";
                                }
                                else
                                {
                                    System.out.print("\nAccess denied");
                                    user="-1";
                                    pass="-1";
                                }
                            System.out.println();
                    }
                    count++;
                    System.out.println();
                             break;
                    case 4:
                    System.out.println();
                            user="frank";
                            pass="777";
                            while(!user.equals("-1")||!pass.equals("-1"))
                            {
                                System.out.print("Welcome to Authentication portal");
                                System.out.print("\nPlease enter your username");
                                System.out.print("\n\tUsername= "+user);
                                System.out.print("\nPlease enter your password");
                                System.out.print("\n\tPassword= "+pass);
                                if(Authentication(user,pass))
                                {
                                    System.out.print("\nAccess granted");
                                    user="-1";
                                    pass="-1";
                                }
                                else
                                {
                                    System.out.print("\nAccess denied");
                                    user="-1";
                                    pass="-1";
                                }
                                
                                 System.out.println();
                                 System.out.println();
                            }
                             count++;
                            
                    System.out.println();
                    break;
                         case 5:
                            user="joe";
                            pass="555";
                           
                    System.out.println();
                            while(!user.equals("-1")||!pass.equals("-1"))
                            {
                                System.out.print("Welcome to Authentication portal");
                                System.out.print("\nPlease enter your username");
                                System.out.print("\n\tUsername= "+user);
                                System.out.print("\nPlease enter your password");
                                System.out.print("\n\tPassword= "+pass);
                                if(Authentication(user,pass))
                                {
                                    System.out.print("\nAccess granted");
                                    user="-1";
                                    pass="-1";
                                }
                                else
                                {
                                    System.out.print("\nAccess denied");
                                    user="-1";
                                    pass="-1";
                                }
                              
                                 System.out.println();
                                 System.out.println();
                            }
                               count++;
                             
                    System.out.println();
                    break;
                    case 6:
                            user="frank";
                            pass="555";
                            
                    System.out.println();
                            while(!user.equals("-1")||!pass.equals("-1"))
                            {
                                System.out.print("Welcome to Authentication portal");
                                System.out.print("\nPlease enter your username");
                                System.out.print("\n\tUsername= "+user);
                                System.out.print("\nPlease enter your password");
                                System.out.print("\n\tPassword= "+pass);
                                if(Authentication(user,pass))
                                {
                                    System.out.print("\nAccess granted");
                                    user="-1";
                                    pass="-1";
                                }
                                else
                                {
                                    System.out.print("\nAccess denied");
                                    user="-1";
                                    pass="-1";
                                }
                               
                                 System.out.println();
                                 System.out.println();
                            }
                       count++;
                           
                    System.out.println();
                                    break;
                     case 7:
                         
                            user="joe";
                            pass="-1";
                            System.out.println();
                            
                            while(!user.equals("-1")||!pass.equals("-1"))
                            {
                               
                                System.out.print("Welcome to Authentication portal");
                                System.out.print("\nPlease enter your username");
                                System.out.print("\n\tUsername= "+user);
                                System.out.print("\nPlease enter your password");
                                System.out.print("\n\tPassword= "+pass);
                                        if(Authentication(user,pass))
                                        {
                                            System.out.print("\nAccess granted");
                                            user="-1";
                                            pass="-1";
                                        }
                                        else
                                        {
                                            System.out.print("\nAccess denied");
                                            user="-1";
                                            pass="-1";
                                        }
                              
                                 System.out.println();
                                 System.out.println();
                            }
                               count++;
                           
                    System.out.println();
                                             break;
                    case 8:
                            user="-1";
                            pass="-11";
                              
                    System.out.println();
                            while(!user.equals("-1")||!pass.equals("-1"))
                            {
                                System.out.print("Welcome to Authentication portal");
                                System.out.print("\nPlease enter your username");
                                System.out.print("\n\tUsername= "+user);
                                System.out.print("\nPlease enter your password");
                                System.out.print("\n\tPassword= "+pass);
                                if(Authentication(user,pass))
                                {
                                    System.out.print("\nAccess granted");
                                    user="-1";
                                    pass="-1";
                                }
                                else
                                {
                                    System.out.print("\nAccess denied");
                                    user="-1";
                                    pass="-1";
                                }
                             
                                 System.out.println();
                                 System.out.println();
                            }
                                count++;
                            
                    System.out.println();
                    break;
                 case 9:
                            user="-1";
                            pass="-1";
                             
                    System.out.println();
                            while(!user.equals("-1")&&!pass.equals("-1"))
                            {
                                System.out.print("Welcome to Authentication portal");
                                System.out.print("\nPlease enter your username");
                                System.out.print("\n\tUsername= "+user);
                                System.out.print("\nPlease enter your password");
                                System.out.print("\n\tPassword= "+pass);
                                if(Authentication(user,pass))
                                {
                                    System.out.print("\nAccess granted");
                                    user="-1";
                                    pass="-1";
                                }
                                else
                                {
                                    System.out.print("\nAccess denied");
                                    user="-1";
                                    pass="-1";
                                }
                                
                                 System.out.println();
                                 System.out.println();
                            }
                             count++;
                             
                    System.out.println();
                    break;
                     default:
                        break;
                }
            }
        }
            
    }

    


        
                
     

