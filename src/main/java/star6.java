import java.util.Scanner;

public class star6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        //int inc = (num*2)-1;
        int start = 1;
        int finish = num;

        for (int i = 1; i <= num ; i++ ){
            for(int j = 1; j <= num; j++){
                if(start < j && j < finish){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
            if(i <= num/2){
                start++;
                finish--;
            } else {
                start--;
                finish++;
            }
        }
    }
}