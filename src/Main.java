public class Main {
    public static void main(String args[]) {
        String f = "Fizz", b = "Buzz";
        for (int i = 1; i < 100; i++) {
            if (isDividable(i, 3)) System.out.println(f);
            else if (isDividable(i, 5)) System.out.println(b);
            else if (isDividable(i, 3) && isDividable(i, 5)) System.out.println(f + b);
            else System.out.println(i);
        }
    }


    private static boolean isDividable(int dom, int nom) {
        if (dom % nom == 0)
            return true;
        else return false;
    }
}
