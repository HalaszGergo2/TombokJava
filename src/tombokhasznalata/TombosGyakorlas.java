
package tombokhasznalata;

public class TombosGyakorlas {
    public static void main(String[] args){
        /*
        String[] nevek = {"Bence", "Gergő", "Balázs"};
        Integer[] korok = {19, 21, 22};
        System.out.println("A tömb elemei:");
        for (int i=0; i < nevek.length; i++){
            System.out.printf("[%d. index] = %s\n", i, nevek[i]);
        }
        for (int i=0; i < korok.length; i++){
            System.out.printf("[%d. index] = %s\n", i, korok[i]);
        }
        */
        // nem tudjuk a az adatokat
        final int TOMB_MERET = 3;
        String[] nevek;
        int[] korok;
        
        //nevek = new String;
        nevek = new String[TOMB_MERET];
                nevek[0] = "Ede";
                nevek[1] = "Gergő";
                nevek[2] = "Pál";
        korok = new int[TOMB_MERET];
                korok[0] = 101;
                korok[1] = 9;
                korok[2] = 21;
                
        System.out.println("Versenytők kora: ");
        int osszKor = 0;
        for(int i = 0; i < TOMB_MERET; i++){
            String nev = nevek[i];
            int kor = korok[i];
            System.out.printf("%5s kora: %3d év\n", nev, kor);
            osszKor += kor;
        }
        double atlag = (double)osszKor / TOMB_MERET;
        System.out.printf("A versenyzők átlag kora: %.2f év\n", atlag);
        
    }
}
