public class BaiTap {
    public static void main(String[] args) {
        System.out.println("Cac So Nguyen To Nho Hon 100 La: ");
        for (int i = 0;i<=100;i++){
            if (isPrimeNumber(i)){
                System.out.print(i + "");
            }
        }
    }
    public static boolean isPrimeNumber(int N) {
        if (N<2){
            return false;
        }
        int squareRoot = (int) Math.sqrt(N);
        for (int i = 2; i < squareRoot;i++){
            if (N % i ==0) {
                return false;
            }
        }
        return true;
    }

}
