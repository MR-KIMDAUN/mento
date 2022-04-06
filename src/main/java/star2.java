public class star2 {
    public static void main(String[] args) {
        int dec = 5;
        for (int i= 1; i <= 3; i++) {
            for (int j = 1; j <= dec; j++) {
                if (i > j) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
            dec--;
        }
    }
}
