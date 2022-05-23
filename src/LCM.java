import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        int lcm;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Value: ");
        int a=s.nextInt();
        System.out.println("Enter a Value: ");
        int b=s.nextInt();
        lcm=a>b?a:b;

        boolean flag=true;

        while(flag){
            if(a%lcm==0 && b%lcm==0){
                System.out.println("LCM of "+a+","+b+" is "+lcm);
                flag=false;
            }
            ++lcm;
        }

    }
}