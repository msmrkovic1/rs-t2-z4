package ba.unsa.etf.rs;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);

	    System.out.println("Unesite velicinu niza u opsegu od 1 do 100: ");

	    //provjera unosa velicine niza
        int size=1;
	    do {
	        if(size!=1) System.out.println("Unesen broj izvan opsega, pokusajte ponovo: ");
            size=ulaz.nextInt();
        }
	    while(size<1 || size>100);

	    System.out.println("Unesite " + size + " clanova niza u opsegu od 1 do 100: ");

	    //provjera unosa clanova niza
	    int[] arr=new int[size];
	    int iter=0;
	    do {
            int item=ulaz.nextInt();
	        if (item<1 || item>=100){
	            System.out.println("Unesen je broj izvan opsega, pokusajte ponovo: ");
	            continue;
            }
	        arr[iter]=item;
	        iter++;
        } while (iter<size);

	    //soritraj niz po velicini i nadji najveci
        Arrays.sort(arr);
        int max = arr[size-1];
        //nadji broj clanova vecih od korjena max
	    int num = veciOdKorjena(arr,max);

        System.out.println("Broj clanova niza vecih od korijena iz " + max + ": " + num);
    }

    private static int veciOdKorjena(int[] arr, int x) {
        int num=0;
        for(int i : arr) {
            if(i>=Math.sqrt(x)) num++;
        }
        return num;
    }
}
