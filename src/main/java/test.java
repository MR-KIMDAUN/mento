public class test {
    public static void main(String[] args) {
        int inc = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= inc; j++) {
                System.out.print("*");
            }
            System.out.println();
            inc++;
        }
    }
}
