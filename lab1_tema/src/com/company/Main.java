package com.company;
import java.util.Scanner;


public class Main {
    public static void factorial(int n){
        int nr = 1;
        while (n!=0)
        {
            nr = nr * n;
            n--;
        }
        System.out.println(nr);
    }

    public static void multiplii(int n){
        int suma = 0;
        for(int i=0; i <=n; i++)
            if (i%3==0 && i%5==0)
                suma = suma + i;
        System.out.println(suma);
    }

    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
        int n;
        //Exercitiul 1
        System.out.println("Introduceti n:");
        n = myInput.nextInt();
        System.out.println(n);
        System.out.println("Numerele pare sunt: ");
        for(int i=0; i<=n; i++)
            if (i % 2 ==0)
                System.out.println(i + " ");

        //Exercitiul 2
        int a, b;
        System.out.println("Introduceti a si b:");

        a = myInput.nextInt();
        b = myInput.nextInt();
        System.out.println("Numarul maxim este: ");
        System.out.println(Math.max(a, b));

        //Exercitiul 3
        System.out.println("Introduceti n:");
        n = myInput.nextInt();
        System.out.println(n + " factoriat este: ");
        factorial(n);

        //Exercitiul 4
        System.out.println("Introduceti n:");
        n = myInput.nextInt();
        System.out.println("Suma multiplilor este: ");
        multiplii((n));

        //Exercitiul 4
        int ctp =0, cti=0;
        int par[] = new int[101];
        int impar[] = new int[101];
        System.out.println("Introduceti n:");
        n = myInput.nextInt();
        System.out.println("Introduceti n numere:");
        for(int i=0; i<n; i++) {
            int x = myInput.nextInt();
            if (x % 2 == 0){
                par[ctp] = x;
                ctp++;
            }
            else {
                impar[cti] = x;
                cti++;
            }
        }

        System.out.println("Numerele pare:");
        for(int i=0; i<ctp; i++)
            System.out.println(par[i]);

        System.out.println("Numerele impare:");
        for(int i=0; i<cti; i++)
            System.out.println(impar[i]);



        int x, i = 0, suma = 0, nr = 0, medie = 0;
        int v[] = new int[101];
        System.out.println("Introduceti n:");
        System.out.println("Introduceti n nr:");

        n = myInput.nextInt();
        x = myInput.nextInt();

        while(i<n && x!=-1)
        {
            v[i] = x;
            suma = suma + v[i];
            i++;
            if(i!=n)
                x = myInput.nextInt();

        }

        medie = suma / i;
        System.out.println("Media este: " + medie);
    }
}
