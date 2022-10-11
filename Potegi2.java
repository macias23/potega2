import java.util.Scanner;
import static java.lang.Math.*;
public class Potegi2
{


    public static void main(String[] args) {
        System.out.println("Podaj dowolną liczbę całkowitą. Program zwróci potęgi 2 mniejsze od niej.");
        Scanner scan=new Scanner(System.in);
        double podanaliczba = scan.nextInt();
        int wykladnikpotega2 = 0;
        double potega2= pow(2,wykladnikpotega2);
        System.out.println(podanaliczba+" >=");
        while(potega2<=podanaliczba){
            System.out.println(potega2);
            wykladnikpotega2++;
            potega2= pow(2, wykladnikpotega2);

        }
        if (potega2>=podanaliczba) {
            System.out.println("Twoja podana liczba jest mniejsza od 2^" + wykladnikpotega2);
            --wykladnikpotega2;
            System.out.println("i większa od 2^"+ wykladnikpotega2);}
    }}







