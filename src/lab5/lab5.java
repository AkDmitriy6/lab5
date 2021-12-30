package lab5;

public class lab5 {
    public static void main(String[] args) {
        recursion1(1, 5);
        System.out.println(' ');
        recursion2( 6);

        System.out.println(recursion3());
    }
    public static String recursion2(int n) {
        int sum = 0;
        int j = 0;
// Базовый случай
        if (n == 1) {
            System.out.print("1");
        } else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                j = i;

            }
            System.out.print(recursion2(--n) + " " + j);
        }
        return "";
    }
    public static void recursion1(int i, int p) {
        if(i<=p){
            System.out.println(i);
            recursion1(++i, p);
        }
    }
    public static int recursion3() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            return 0;
        }
        else {
            return Math.max(n, recursion3());
        }
    }
}
