public class star5 {
    public static void main(String[] args) {
        int dec = 1;
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= dec; j++){
                System.out.print("*");
            }
            System.out.println();
            dec++;
        }
    }
}
