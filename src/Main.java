public class Main {
    public static void main(String[] args) throws InterruptedException {

        //while LOOP
        //++counter
        int counter = 10;
        while (++counter < 20) {
            System.out.println(counter);
        }
        System.out.println("da 11 a 19");
        //counter++
        int conta = 10;
        while (conta++ < 20) {
            System.out.println(conta);

            if (conta == 15) break;
        }
        System.out.println("do..while");
        // Do...While >> rispetto al while si esegue sempre almeno una volta ció che sta dentro il do{}
        // e poi parte con prima iterazione
        //do-while loop works just like the while
        // loop except for the fact that the first condition evaluation happens after the first iteration of the loop
        int numb = 10;
        do {
            System.out.println(numb);
            Thread.sleep(1000);
            numb--;
        } while (numb >= 0);
        System.out.println(numb);

        int nmb = 20;
        while (nmb < 10) {
            System.out.println("Finito");
        }
    }
}