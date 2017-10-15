import java.io.Console;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by jan on 2017-10-14.
 */
public class DowolnaLiczbaCalkowita {
    public static void main(String[] args) {
        int result;

        HashMap<Integer, String> liczby = new HashMap<Integer, String>();
        liczby.put(0, "");
        liczby.put(1, "jeden");
        liczby.put(2, "dwa");
        liczby.put(3, "trzy");
        liczby.put(4, "cztery");
        liczby.put(5, "pięć");
        liczby.put(6, "sześć");
        liczby.put(7, "siedem");
        liczby.put(8, "osiem");
        liczby.put(9, "dziewięć");


        HashMap<Integer, String> liczbyDziesietne = new HashMap<Integer, String>();
        liczbyDziesietne.put(1, "dziesięć");
        liczbyDziesietne.put(2, "dwadzieścia");
        liczbyDziesietne.put(3, "trzydzieści");
        liczbyDziesietne.put(4, "czterdzieści");
        liczbyDziesietne.put(5, "pięćdziesiąt");
        liczbyDziesietne.put(6, "sześćdziesiąt");
        liczbyDziesietne.put(7, "siedemdziesiąt");
        liczbyDziesietne.put(8, "osiemdziesiąt");
        liczbyDziesietne.put(9, "dziewięćdziesiąt");

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę od 1-99");
        result = scanner.nextInt();

        int divideNumber = result/10;
        int moduloNumber = result%10;

        if (result>99){
            System.out.println("Podana liczba jest za duza");
        }
        if (result<10){
            System.out.println(liczby.get(result));
        }
        else if (result>10 && result<20){
            System.out.println(liczby.get(moduloNumber) + liczbyDziesietne.get(1));
        }
        else if (result%10==0)
            System.out.println(liczbyDziesietne.get(divideNumber));

        else if (result>20){
            System.out.println(liczbyDziesietne.get(divideNumber) + " " + liczby.get(moduloNumber));
        }

    }}
