/*Task 2*/
package jktv21task2yuliiabondarenko;

import java.util.Scanner;
/*@author pupil*/
public class JKTV21Task2YuliiaBondarenko {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Напиши 3-х значное число: ");
    int chislo = scanner.nextInt();
    int sot = chislo/100;
    int desytki = (chislo-100*sot)/10;
    int jed = chislo-100*sot-10*desytki;
    int summa = sot + desytki + jed;
    System.out.println("В твоем числе "+sot+" сотен, "+desytki+" десятков, "+jed+" единиц.");
    System.out.println("Summa = "+summa);
    }
    
}
