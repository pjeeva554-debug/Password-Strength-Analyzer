import java.util.Scanner;
public  class Main
{
    public static void main(String[] args)
    {
        System.out.println("Entered password");
        Scanner obj=new Scanner(System.in);
        String password = obj.nextLine();
        
        int pass = 0;
        // Length check
        if(password.length()>=8){
            pass++;
        }
        // uppercase check
        if(password.matches(".*[A-Z].*"))
        {
            pass++;
        }
        
        //lowercase check
        if(password.matches(".*[a-z].*"))
        {
            pass++;
        }
        
        //Number check
        if(password.matches(".*[0-9].*"))
        {
            pass++;
        }
        
        // Special symbol check
        if(password.matches(".*[!@#$%^&*()].*"))
        {
            pass++;
        }
        
        // password strength
        if(pass <=2)
        {
            System.out.println("weak password");
        }
        else if (pass<=4)
        {
            System.out.println("Medium password");
        }
        else
        {
            System.out.println("Strong password");
        }
        obj.close();
    }
}