import java.util.Scanner;

class Oddeven{

    public static void oddeven(int x){
            if(x%2==0){
                System.out.println("The Number is Even");
            }
            else{
                System.out.println("The Number is Odd");
            }
        }
    
        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            oddeven(a);

            sc.close();
    }
}