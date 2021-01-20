import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Day1 {
    int[] fuelList = new int[100];
    File f = new File("src/input");
    Scanner sc;

    {
        try {
            sc = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }



    public void divide() {

    }

    public void round() {

    }

    public void subtract() {

    }

    public static void main(String[] args) {
        Day1 d = new Day1();
        for (int i = 0; i < 100; i++) {
            int mass = d.sc.nextInt();
            d.fuelList[i] = mass;

        }

        int fuelSum = Arrays.stream(d.fuelList)
                .map(n -> n / 3)
                .map(n -> n - 2)
                .reduce(0, (sum, n) -> sum + n);
        System.out.println(fuelSum);
    }
}
