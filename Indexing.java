import java.util.Scanner;
class Indexing{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str=input.nextLine();
        int N=input.nextInt();
        System.out.println(str.charAt(N));
        input.close();
    }
}