public class ClientPlanningCollections {
    public static void main(String[] args) {
        try{
            PlanningCollections pc = new PlanningCollections();
            pc.ajout(new Reservation(new DateCalendrier(12,3,2025),new PlageHoraire(new Horaire(10,15),new Horaire(12,30)),"geugeu1"));
            pc.ajout(new Reservation(new DateCalendrier(13,3,2025),new PlageHoraire(new Horaire(2,45),new Horaire(4,15)),"geugeu2"));
            pc.ajout(new Reservation(new DateCalendrier(10,3,2025),new PlageHoraire(new Horaire(5,45),new Horaire(7,15)),"geugeu3"));
            pc.ajout(new Reservation(new DateCalendrier(1,12,2025),new PlageHoraire(new Horaire(5,45),new Horaire(12,15)),"geugeu4"));
            //pc.ajout(new Reservation(new DateCalendrier(1,3,2021),new PlageHoraire(new Horaire(8,45),new Horaire(10,15)),"geugeu3"));
            //pc.ajout(new Reservation(new DateCalendrier(1,3,2021),new PlageHoraire(new Horaire(11,45),new Horaire(12,15)),"geugeu3"));
            //pc.ajout(new Reservation(new DateCalendrier(1,3,2021),new PlageHoraire(new Horaire(13,45),new Horaire(14,15)),"geugeu3"));

            System.out.println(pc);
            //System.out.println(pc.getReservations("geu"));
            //System.out.println(pc.getReservations(new DateCalendrier(1,3,2021)));
        }

        catch(Exception e){
            System.out.println("Erreur:"+e.getMessage());
        }
    }
}
