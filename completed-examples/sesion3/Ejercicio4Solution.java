//BUCLES
public class Main {
    public static void main(String[] args) {

        // FOR: contar del 1 al 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("For -> " + i);
        }

        // WHILE: cuenta regresiva
        int n = 3;
        while (n > 0) {
            System.out.println("While -> " + n);
            n--;
        }

        // DO-WHILE: se ejecuta al menos una vez
        int x = 1;
        do {
            System.out.println("Do-While -> siempre se ejecuta al menos una vez");
        } while (x < 0);
    }
}
