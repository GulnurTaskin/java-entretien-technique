package JavaInteriewQuestions;

import java.util.Arrays;

public class Q1 {
    /*
     Vérifiez si les deux String données contiennent les mêmes lettres.
     Exemple:
      String a = "abc"
      String b = "cba"
      Les valeurs a et b sont constituées des mêmes lettres

     */


    /*
   Actions:
   - Je dois convertir les deux String en char.
   - il faut trier les éléments de char
   - En suit convertir des char triés en String
   - Finalement comparer les deux String nouveaux et renvoyer le résultat.

     */

    public static void main(String[]args){

        String str1 = "edip";
        String str2 = "pide";



        if (strTest(str1,str2)){
            System.out.println("les deux String contiennent les mêmes lettres");
        }else {
            System.out.println("les deux String ne contiennent pas les mêmes lettres");
        }

    }
        public static boolean strTest(String str1, String str2){

        char[]ch1 = str1.toLowerCase().toCharArray();
        char[]ch2 = str2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String sortedStr1 = new String(ch1);
        String sortedStr2 = new String(ch2);



            return sortedStr1.equals(sortedStr2);
        }
}
