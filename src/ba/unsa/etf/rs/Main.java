package ba.unsa.etf.rs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);

	    System.out.println("Unesite velicinu niza u opsegu od 1 do 100: ");

        int size=1;
	    do {
	        if(size!=1) System.out.println("Unesen broj izvan opsega, pokusajte ponovo: ");
            size=ulaz.nextInt();
        }
	    while(size<1 || size>100);

	    System.out.println("Unesite " + size + " clanova niza u opsegu od 1 do 100: ");

	    int arr[]=new int[size];
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

	    for(int a : arr) System.out.println(a);
    }
}
