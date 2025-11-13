import java.util.Scanner;
public class comandes {
    public static void main(String[] args) {
         comandes p = new comandes();
         p.principal();
    }

Scanner escaner = new Scanner(System.in);
String escollirOpcio, tiquet, nomClient, nomProducte, preguntaAfegirProducte;
int quantitatProducte;
double preuUnitari;
String Tf;

 public void gestioComandes(){
     System.out.println("_______________________________");
     System.out.println("----- GESTIÓ DE COMANDES -----");
     System.out.println("_______________________________");
     System.out.println("");
     System.out.println("1. Crear nova comanda.");
     System.out.println("2. Actualitzar comanda anterior.");
     System.out.println("3. Visualitzar últim tiquet.");
     System.out.println("4. Sortir.");

     escollirOpcio = escaner.nextLine();
 }

public void demanarDadesComanda(){
     System.out.println("> Introdueix el producte: ");
           nomProducte = escaner.next();
          // tiquet = nomClient + nomProducte;
        System.out.println("> Preu unitari ($): ");
           preuUnitari = escaner.nextDouble();
        System.out.println("> Quantitat: "); 
           quantitatProducte = escaner.nextInt();   
           tiquet = nomProducte + "  " + preuUnitari +"  " + quantitatProducte  +  "  " + preuUnitari*quantitatProducte;
        System.out.println("> Vols afegir un altre producte? (s/n): ");
           preguntaAfegirProducte = escaner.next();
           Tf=Tf + "\n" + tiquet;
}

 public void novaComanda(){
     System.out.println("________________________");
     System.out.println("----- NOVA COMANDA -----");
     System.out.println("________________________");
     System.out.println("");
     System.out.println("> Introdueix el nom del client: ");
        nomClient = escaner.nextLine();
        Tf =nomClient;
      
     do{
       demanarDadesComanda();
     }while(!preguntaAfegirProducte.equals("n"));

     System.out.println(Tf);
 }

public void principal(){
    do{
        gestioComandes();

        switch (escollirOpcio) {
          case "1":
               novaComanda();;
               break;
        
          case: "2":
              demanarDadesComanda();
              break;

          case:
          default:
               break;
        }

}while(!escollirOpcio.equals("4"));

  
   }//Aqui acaba el principal
}
