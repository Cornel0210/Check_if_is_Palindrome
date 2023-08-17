public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(567898765));
        System.out.println(isPalindrome(1219989121));
    }

    public static boolean isPalindrome(int x) {
        if (x <0) {
            return false;
        }
        int pal = 0;
        int cop = x;
        while (cop/10 !=0){
            pal = pal * 10 + cop % 10;
            cop /= 10;
        }
        pal = pal * 10 + cop;
        while (x/10 != 0){
            if (x%10 != pal %10){
                return false;
            } else {
                x /= 10;
                pal /= 10;
            }
        }
        return pal == x;
    }
}
