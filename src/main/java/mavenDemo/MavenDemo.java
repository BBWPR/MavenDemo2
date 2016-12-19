/* Project: MavenDemo
 * Modul: 426
 * Autor: P. Rutschmann
 */
package mavenDemo;

public class MavenDemo
{
   public static void main(String[] args)
   {
      Boolean ende = false;
      String eingabeZeile = "";
      int resultat = 0;
      int zahl1 = 0;

      Calculator calculator = new Calculator();
      java.util.Scanner scanner = new java.util.Scanner(System.in);

      System.out.println("Dieses Programm verrechnet Zahlen:");
      System.out.println("Ende mit 'Ende'");
      while (ende != true)
      {
         System.out.println("Geben Sie eine Zahl ein:");
         eingabeZeile = scanner.nextLine();

         if (eingabeZeile.equals("Ende") || eingabeZeile.equals("ende"))
         {
            System.out.printf("End Resultat: %d\n", resultat);
            ende = true;
         }
         else
         {
            zahl1 = Integer.parseInt(eingabeZeile);
            System.out.println("Operation: +, - ");
            eingabeZeile = scanner.nextLine();

            if (eingabeZeile.equals("+"))
            {
               resultat = calculator.summe(resultat, zahl1);
            }
            else if (eingabeZeile.equals("+"))
            {
               resultat = calculator.differenz(resultat, zahl1);
          
            }
            else
            {
               //do nothing
            }
            System.out.printf("Resultat: %d\n", resultat);
         }
      }
      scanner.close();
      System.out.printf("Sie haben das Programm beendet");
   }

}
