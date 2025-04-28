import java.util.Arrays;

public class ClientReservation {
    public static void main(String[] args) {

        /*Date JourJ = new Date(1,3,2021);
        Date JourJ2 = new Date(1,2,2021);
        PlageHoraire Plage = new PlageHoraire(new Horaire(2,45),new Horaire(4,15));
        PlageHoraire Plage2 = new PlageHoraire(new Horaire(9,45),new Horaire(12,15));
        Reservation RDV = new Reservation(JourJ,Plage,"Musculation");
        Reservation RDV2 = new Reservation(JourJ2,Plage2,"Musculation");
        //System.out.println(RDV2.compareTo(RDV));
        Reservation [] tab = new Reservation[2];

        tab[0] = RDV;
        tab[1] = RDV2;
        */


        try{
            Reservation R = new Reservation(new DateCalendrier(1,3,2021),new PlageHoraire(new Horaire(2,45),new Horaire(4,15)),"geugeu");
        }

        catch (Exception Ex){
            System.out.println("Erreur:"+Ex.getMessage());
        }
    }
}
