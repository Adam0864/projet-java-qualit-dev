import java.io.File;
import java.util.Scanner;

public class ClientPlanning {
    public static void main(String[] args) {
        /*
        Date JourJ = new Date(25,3,2021);
        Date JourJ2 = new Date(30,3,2021);
        Date JourJ3 = new Date(23,3,2021);
        Date JourJ4 = new Date(8,3,2021);
        Date JourJ5 = new Date(2,3,2021);
        PlageHoraire Plage = new PlageHoraire(new Horaire(10,45),new Horaire(12,15));
        PlageHoraire Plage2 = new PlageHoraire(new Horaire(9,45),new Horaire(12,15));
        Reservation RDV = new Reservation(JourJ,Plage,"Musculation");
        Reservation RDV2 = new Reservation(JourJ2,Plage2,"Cuisine");
        Reservation RDV3 = new Reservation(JourJ3,Plage2,"Jumuha");
        Reservation RDV4 = new Reservation(JourJ4,Plage2,"Salat Al-Aid");
        Reservation RDV5 = new Reservation(JourJ5,Plage2,"Egorgement mouton");
        Planning PlanningdeRDV = new Planning(5);
        System.out.println(PlanningdeRDV.plusAncienneReservation(0,4));
        PlanningdeRDV.Tri();
        System.out.println(PlanningdeRDV);
        */

        try{
            Planning p = new Planning(4);
            Scanner scanner = new Scanner(new File("data" +File.separator+"planning.txt")).useDelimiter(",");
            while(scanner.hasNext()){
                String intitule = scanner.next();
                int jour = scanner.nextInt();
                int mois = scanner.nextInt();
                int annee = scanner.nextInt();
                int hdeb = scanner.nextInt();
                int mdeb = scanner.nextInt();
                int hfin = scanner.nextInt();
                int mfin = scanner.nextInt();
                p.ajout(new Reservation(new DateCalendrier(jour,mois,annee),new PlageHoraire(new Horaire(hdeb,mdeb),new Horaire(hfin,mfin)),intitule));
                p.ajout(new Reservation(new DateCalendrier(1,2,2025),new PlageHoraire(new Horaire(10,30),new Horaire(12,45)),"Session Smash Bros"));
                p.ajout(new Reservation(new DateCalendrier(1,2,2025),new PlageHoraire(new Horaire(10,30),new Horaire(12,45)),"Session Smash Bros"));
            }
            System.out.println(p);

        }
        catch (ExceptionPlanning Ex){
            System.out.println("Erreur:"+Ex.getCodeErreur()+" Type d'erreur:"+ConstantesErreurs.ERREURS_PLANNING[Ex.getCodeErreur()]);
        }
        catch (Exception Ex){
            System.out.println("Erreur:"+Ex.getMessage());
        }

    }
}