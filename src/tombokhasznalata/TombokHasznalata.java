/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombokhasznalata;

public class TombokHasznalata {

   
    public static void main(String[] args) {
        // indexek:
        // pyLista = ["egy", "kettő", "három"]
        
        String[] tomb = {"egy", "kettő", "három"};
        /* memória címet irja ki, nem a tartalmat: */
        System.out.println("tomb = " + tomb);
        
        /* a tömb mérete nem változtatható: */
        // tomb = {"nulla", "egy"}
        
        System.out.println("A tömb elemei:");
        for (int i=0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s\n", i, tomb[i]);
        }
        tomb = new String[4];
        System.out.println("az üres tömb:");
        for (int i=0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s\n", i, tomb[i]);
        }
        tomb[2] = "zwei";
        System.out.println("egy adattal feltöltött:");
        for (int i=0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s\n", i, tomb[i]);
        }
        System.out.println("vegyesen feltöltött tömb: ");
        tomb[0] = "null";
        tomb[1] = "one";
        tomb[3] = "three";
        for (int i=0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s\n", i, tomb[i]);
        }
        System.out.println("teljes angol feltöltött tömb: ");
        tomb[0] = "null";
        tomb[1] = "one";
        tomb[2] = "two";
        tomb[3] = "three";
        for (int i=0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s\n", i, tomb[i]);
        }
        
        System.out.println("\"null\" vagy null?");
        if("null" == null){
            System.out.println("egyezik");
        }else{
            System.out.println("nem egyezik");
        }
        
    }
    
}
