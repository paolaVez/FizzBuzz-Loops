import java.util.Random;

public class Rndm {
    public static void main(String[] args) {
        int num = 0;
        int oddCount = 0;
        int evenCount= 0;

        do{
            //random = (int)(Math.random()*10+1)
            Random rand = new Random();
            int i = rand.nextInt(100);
            System.out.println(i);
                if(i % 2 == 0){
                    evenCount++;
                } else {
                    oddCount++;
                }

        } while(++num < 100);

        System.out.println("Odds are: " + oddCount + "\nand evens are: " + evenCount + "\n");

        System.out.println(evenCount > oddCount ? "Even wins" : "Odd wins");
    }
}