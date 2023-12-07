import java.util.Scanner;
class StringRepetition
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str=input.nextLine();
        int N=input.nextInt();
        str+=" ";
        System.out.println(str.repeat(N));
        input.close();
    }
}