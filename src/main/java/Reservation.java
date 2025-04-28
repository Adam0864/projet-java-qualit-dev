public class Reservation implements Comparable<Reservation> {
    private DateCalendrier chDateReservation;
    private PlageHoraire chPlageHoraire;
    private String chIntitule;

    public Reservation(DateCalendrier parDateReservation,PlageHoraire parPlageHoraire, String parIntitule){
        chDateReservation = parDateReservation;
        chPlageHoraire = parPlageHoraire;
        chIntitule = parIntitule;


    }

    public int compareTo(Reservation parReservation) {
        if (parReservation.chDateReservation.compareTo(this.chDateReservation) == 0) {
            return chPlageHoraire.compareTo(parReservation.chPlageHoraire);
        }
        return chDateReservation.compareTo(parReservation.chDateReservation);
    }

    public boolean estValide() {
        if (chDateReservation.estValide() && chPlageHoraire.estValide() && !chIntitule.equals(" ") && !chIntitule.isEmpty()) {
            return true;
        }
        else { return false; }
    }

    public DateCalendrier getChDateReservation() {
        return chDateReservation;
    }

    public String getChIntitule() {return chIntitule;}

    public PlageHoraire getChPlageHoraire() {
        return chPlageHoraire;
    }

    public String toString () {
        return chIntitule + "," + chDateReservation + "," + chPlageHoraire;
    }
}
