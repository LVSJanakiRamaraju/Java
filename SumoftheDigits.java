import java.util.Scanner;
class SumoftheDigits{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum=0;
        String str=input.nextLine();
        int i=0;
        while(i<3){
            char B=str.charAt(i);
            String S=Character.toString(B);
            int A = Integer.parseInt(S);
            sum+=A;
            i+=1;
        }
        System.out.println(sum);
        input.close();
    }
}