import java.util.Scanner;
import java.util.Random;

public class Homework5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un sir de numere intregi: ");
        String numarIntrodus = scanner.next();
        System.out.println("Suma cifrelor este: " + sumaSirNumere(numarIntrodus));
        System.out.println("Numarul are " + numarElementeImpare(numarIntrodus) + " elemente impare");

        int[] sirNrIntregi = {12, 23, 45, 65, 24, 33, 21, 15};
        System.out.println("Introduceti un numar pentru comparatie: ");
        int numarPtComparatie = scanner.nextInt();
        System.out.print("numerele mai mari decat numarul introdus sunt: ");
        int[] numereMaiMari = numereMari(sirNrIntregi, numarPtComparatie);
        for (int numar : numereMaiMari){
            System.out.print(numar + " ");
        }

        System.out.println();
        System.out.println("Introduceti suma necesara a fi donata: ");
        int sumaNecesara = scanner.nextInt();
        donatii(sumaNecesara);

        System.out.println("Introduceti nr maxim de donatii: ");
        int maximDonatii = scanner.nextInt();
        nrMaximDonatii(sumaNecesara, maximDonatii);

        System.out.println();
        String fraza = "Scrieti o functie care primeste un numar intreg reprezentand targetul de donatii. Donatiile se vor face cu ajutorul obiectului Random. Primim donatii pana ajungem la suma dorita. Cand ajungem la suma dorita afisam un mesaj de succes.";
        propozitii(fraza);



    }
    public static int sumaSirNumere(String numarIntrodus){
        String[] numereComponente = numarIntrodus.split("");
        int sumaCifre = 0;
        for (int index = 0; index < numereComponente.length; index++){
            sumaCifre = sumaCifre + Integer.parseInt(numereComponente[index]);
        }
        return sumaCifre;
    }
    public static int numarElementeImpare(String numarIntrodus){
        String[] numereComponente = numarIntrodus.split("");
        int elemImpare = 0;
        for (int index = 0; index < numereComponente.length; index++){
            if ((Integer.parseInt(numereComponente[index]) % 2) != 0){
                elemImpare++;
            };
        }
        return elemImpare;
    }
    public static int[] numereMari(int[] sirNrIntregi, int numarPtComparatie){
        int nrNumereMari = 0;
        for (int index = 0; index < sirNrIntregi.length; index++){
            if (sirNrIntregi[index] > numarPtComparatie){
                nrNumereMari++;
            };
        }
        int[] arrayNumereMari = new int[nrNumereMari];
        int indexArray = 0;
        for (int index = 0; index < sirNrIntregi.length; index++){
            if (sirNrIntregi[index] > numarPtComparatie){
                arrayNumereMari[indexArray] = sirNrIntregi[index];
                indexArray++;
            }
        }
        return arrayNumereMari;
    }
    public static void donatii(int targetDonatii){
        int totalDonatii = 0;
        int nrDonatii = 0;
        int valoareDonatie = 0;
        Random random = new Random();

        while (totalDonatii < targetDonatii){
            valoareDonatie =  random.nextInt(targetDonatii);
            totalDonatii = totalDonatii + valoareDonatie;
            nrDonatii++;
            System.out.println("Donatia nr: " + nrDonatii + " este in valoare de: " + valoareDonatie);
        }
        System.out.println("Multumim, s-a atins suma dorita, suma stransa este in valoare de: " + totalDonatii);
    }
    public static void nrMaximDonatii(int targetDonatii, int nrDonatiiPermise){
        int totalDonatii = 0;
        int nrDonatii = 0;
        int valoareDonatie = 0;
        Random random = new Random();

        while ((totalDonatii < targetDonatii) && (nrDonatii < nrDonatiiPermise)){
            valoareDonatie =  random.nextInt(100);
            totalDonatii = totalDonatii + valoareDonatie;
            nrDonatii++;
            System.out.println("Donatia nr: " + nrDonatii + " este in valoare de: " + valoareDonatie);
        }
        if (totalDonatii >= targetDonatii) {
            System.out.println("Multumim, s-a atins suma dorita, suma stransa este in valoare de: " + totalDonatii);
        } else {
            System.out.println("S-a atins suma de: " + totalDonatii + " dintr-un numar de maxim " + nrDonatii + " donatii permise");
        }
    }
    public static void propozitii(String fraza){
        String[] propozitiiArray = fraza.split("[.]");
        for (String propozitie : propozitiiArray){
            System.out.println(propozitie.trim() + ".");
        }
    }
}
