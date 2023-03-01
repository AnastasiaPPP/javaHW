package sem1;

public class SimpleNums {
    public static void main(String[] args) {
        simNums();
    }
    public static void simNums() {
        for (int i = 2; i <= 1000; i++) {
            if (i == 2 || i  == 3 || i  == 5 || i  == 7) System.out.println(i);
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) continue;
            System.out.println(i);
        }
    }
}
