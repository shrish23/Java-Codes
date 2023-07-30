package PACK2;

import PACK1.Prime;

import java.util.Scanner;

public class Prime_Demo {
    public static void main(String[] args) {
        Prime p = new Prime();
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        System.out.println(p.checkPrime(Integer.parseInt(num)));
    }
}
