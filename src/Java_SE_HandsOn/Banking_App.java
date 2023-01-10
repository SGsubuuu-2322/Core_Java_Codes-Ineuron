package Java_SE_HandsOn;
import java.util.*;

public class Banking_App {

	public static void main(String[] args) {
		int acc_bal = 20000, wd_bal, service_no;
        String stored_pwd = "SGshreyans@2322", given_pwd;
        Scanner ip = new Scanner(System.in);
        System.out.println("Hello Sir/Madam! Welcome to our Banking App !...\n Here, we provide Quality services like :- \n1 for Balance Checking \n2 for Money Withdrawing \n3 for PassCode Change \n4 for Exiting...");
        System.out.println("So, enter the service number of your choice :- ");
        service_no = ip.nextInt();
        while(service_no == 1 || service_no == 2 || service_no == 3){

            outer_2:
            while(service_no == 1 || service_no == 2 || service_no == 3){

                outer_1: 
                while(service_no == 1){
                    
                    System.out.println("Enter your PassCode for Balance-Checking :- ");
                    given_pwd = ip.next();
                    try{
                        if(stored_pwd.equals(given_pwd)){
                          System.out.println("Your Account_Balance :- " + acc_bal);
                          service_no = 0;
                          break outer_2;
                        }
                        else
                            throw new NoSuchElementException("Invalid Passcode...");
                    }
                    catch(NoSuchElementException nse){
                        char ch;
                        System.out.println("Error Message : " + nse.getMessage());
                        System.out.println("So, if do you want to use this service again with correct password then type \'Y\' \n and if not  and want to go to previous menu type \'N\' :-");
                        ch = ip.next().charAt(0);
                        while(true){
                           try{
                               if(ch == 'Y' || ch == 'y'){
                                  service_no = 1;
                                  break outer_1;
                                }
                                else if(ch == 'N' || ch == 'n'){
                                    service_no = 0;
                                    break outer_2;
                                }
                                else
                                  throw new NoSuchElementException("Invalid_Character...");
                            }
                            catch(NoSuchElementException nse1){
                                System.out.println("Error Message : " + nse1.getMessage());
                                System.out.println("So, if do you want to use this service again with correct password then type \'Y\' \n and if not  and want to go to previous menu type \'N\' :-");
                                ch = ip.next().charAt(0);
                            }
                        }
                    }

                }


                outer_1:
                while(service_no == 2){
                    
                    System.out.println("Enter your PassCode for Balance-Withdrawing :- ");
                    given_pwd = ip.next();
                    try{
                        if(stored_pwd.equals(given_pwd)){
                            System.out.println("Enter the amount you want to withdraw : ");
                            wd_bal = ip.nextInt();
                            while(true){
                               try{
                                   if(wd_bal < acc_bal || wd_bal == acc_bal){
                                       acc_bal = acc_bal - wd_bal;
                                       System.out.println("Carefully! take all your money from below dispenser... \nYour transaction happened successfully");
                                       service_no = 0;
                                       break outer_2;
                                    }
                                    else{
                                        throw new ArithmeticException("Insufficient Fund...");
                                    }
                                }catch(ArithmeticException ae){
                                    char ch;
                                    System.out.println("Error Message : " + ae.getMessage());
                                    System.out.println("So, if do you want to withdraw again with correct amount then type \'Y\' \nif not and want to go to the previous menu then type \'N\' :- ");
                                    ch = ip.next().charAt(0);
                                    while(true){
                                        try{
                                            if(ch == 'y' || ch == 'Y'){
                                                service_no = 2;
                                                break outer_1;
                                            }
                                            else if(ch == 'N' || ch == 'n'){
                                                service_no = 0;
                                                break outer_2;
                                            }
                                            else{
                                                throw new NoSuchElementException("Invalid Character...");
                                            }
                                        }catch(NoSuchElementException nse2){
                                            System.out.println("Error Message : " + nse2.getMessage());
                                            System.out.println("So, if do you want to withdraw again with correct amount then type \'Y\' \nif not and want to go to the previous menu then type \'N\' :- ");
                                            ch = ip.next().charAt(0);
                                        }
                                    }
                                }
                            }
                        }
                        else{
                            throw new NoSuchElementException("Invalid_PassCode...");
                        }
                    }
                    catch(NoSuchElementException nse3){
                        char ch;
                        System.out.println("Error Message : " + nse3.getMessage());
                        System.out.println("So, if do you want to use this service again with correct password then type \'Y\' \n and if not  and want to go to previous menu type \'N\' :-");
                        ch = ip.next().charAt(0);
                        while(true){
                           try{
                               if(ch == 'Y' || ch == 'y'){
                                  service_no = 2;
                                  break outer_1;
                                }
                                else if(ch == 'N' || ch == 'n'){
                                    service_no = 0;
                                    break outer_2;
                                }
                                else
                                  throw new NoSuchElementException("Invalid_Character...");
                            }
                            catch(NoSuchElementException nse4){
                                System.out.println("Error Message : " + nse4.getMessage());
                                System.out.println("So, if do you want to use this service again with correct password then type \'Y\' \n and if not  and want to go to previous menu type \'N\' :-");
                                ch = ip.next().charAt(0);
                            }
                        }
                    }
                }


                outer_1:
                while(service_no == 3){
                    String temp_1, temp_2;
                    System.out.println("Enter your old PassCode for changing it :- ");
                    given_pwd = ip.next();
                    while(true){
                        try{
                            if(given_pwd.equals(stored_pwd)){
                                System.out.println("Enter your new PassCode :- ");
                                temp_1 = ip.next();
                                System.out.println("Enter it again :- ");
                                temp_2 = ip.next();
                                while(true){
                                    try{
                                        if(temp_2.equals(temp_1)){
                                            char ch;
                                            stored_pwd = temp_2;
                                            System.out.println("Your PassCode has been updated!!!\nSo, now if do you want to have a look onto your passcode please enter \'L\' \nAnd, for using this service again Please enter \'Y\' \nOr enter \'N\' if you want to go to the previous menu :- ");
                                            ch = ip.next().charAt(0);
                                            while(true){
                                                try{
                                                    if(ch == 'Y' || ch == 'y'){
                                                        service_no = 3;
                                                        break outer_1;
                                                    }
                                                    else if(ch == 'N' || ch == 'n'){
                                                        service_no = 0;
                                                        break outer_2;
                                                    }
                                                    else if(ch == 'L' || ch == 'l'){
                                                        System.out.println("Your New PassCode is : " + stored_pwd);
                                                        System.out.println("So, now if do you want to have a look onto your passcode again please enter \'L\' \nAnd, for using this service again Please enter \'Y\' \nOr enter \'N\' if you want to go to the previous menu :- ");
                                                        ch = ip.next().charAt(0);
                                                    }
                                                    else{
                                                        throw new NoSuchElementException("Invalid Character...");
                                                    }
                                                }catch(NoSuchElementException nse5){
                                                    System.out.println("Error Message : " + nse5.getMessage());
                                                    System.out.println("Your PassCode has been updated!!!\nSo, now if do you want to use this service again Please enter \'Y\' \nOr enter \'N\' if you want to go to the previous menu :- ");
                                                    ch = ip.next().charAt(0);
                                                }
                                            }
                                        }else{
                                            throw new NoSuchElementException("Mismatched among your entered PassCodes...");
                                        }
                                    }catch(NoSuchElementException nse6){
                                        char ch;
                                        System.out.println("Error Message : " + nse6.getMessage());
                                        System.out.println("So, now if do you want to use this service again with carefully \nthen, Enter \'Y\' \nOrelse, Enter \'N\' for going to the previous menu :- ");
                                        ch = ip.next().charAt(0);
                                        while(true){
                                            try{
                                                if(ch == 'Y' || ch == 'y')
                                                {
                                                    service_no = 3;
                                                    break outer_1;
                                                }
                                                else if(ch == 'N' || ch == 'n'){
                                                    service_no = 0;
                                                    break outer_2;
                                                }
                                                else{
                                                    throw new NoSuchElementException("Invalid Character...");
                                                }
                                            }catch(NoSuchElementException nse7){
                                                System.out.println("Error Message : " + nse7.getMessage());
                                                System.out.println("So, now if do you want to use this service again with care \nthen, Enter \'Y\' \nOrelse, Enter \'N\' for going to the previous menu :-");
                                                ch = ip.next().charAt(0);
                                            }
                                        }
                                    }
                                }
                            }
                            else{
                                throw new NoSuchElementException("Invalid PassCode...");
                            }
                        }catch(NoSuchElementException nse8){
                            char ch;
                            System.out.println("Error Message : " + nse8.getMessage());
                            System.out.println("So, now if do you want to use this service again with care \nthen, Enter \'Y\' \nOrelse, Enter \'N\' for going to the previous menu :-");
                            ch = ip.next().charAt(0);
                            while(true){
                                try{
                                    if(ch == 'Y' || ch == 'y')
                                    {
                                        service_no = 3;
                                        break outer_1;
                                    }
                                    else if(ch == 'N' || ch == 'n'){
                                        service_no = 0;
                                        break outer_2;
                                    }
                                    else{
                                        throw new NoSuchElementException("Invalid Character...");
                                    }
                                }catch(NoSuchElementException nse9){
                                    System.out.println("Error Message : " + nse9.getMessage());
                                    System.out.println("So, now if do you want to use this service again with care \nthen, Enter \'Y\' \nOrelse, Enter \'N\' for going to the previous menu :-");
                                    ch = ip.next().charAt(0);
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("We provide Quality services like :- \n1 for Balance Checking \n2 for Money Withdrawing \n3 for Passcode changing \n4 for Exiting...");
            System.out.println("So, enter the service number of your choice :- ");
            service_no = ip.nextInt();
        }
        System.out.println("Thanks for using me! \nHope you've a wonderful day :) \nVisit us again...");
	}
}
