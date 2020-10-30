package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        int n;
        System.out.println("Unesite n: ");
        n = ulaz.nextInt();
        for(int i = 1; i <= n; i++){
            if(i % sumaCifara(i) == 0)
                System.out.println(i);
        }
    }

    public static int sumaCifara(int n){
        int sum = 0;
        while(n > 0){
            int nova = (n % 10);
            sum = sum + nova;
            n = n/10;
        }
        return sum;
    }
}
