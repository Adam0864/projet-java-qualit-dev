import java.util.Calendar;
import java.util.Arrays;

public class DateCalendrier extends Date implements ConstantesCalendrier,Comparable <Date>{
    private int chJourSemaine;
    private int chNbSemaine;
    private DateCalendrier[] chTable;

    public DateCalendrier() {
        super(0);
        Calendar today = Calendar.getInstance();

        chAnnee = today.get(Calendar.YEAR);

        // Calendar.MONTH retourne 0 pour janvier 1 pour février...
        chMois = today.get(Calendar.MONTH) +1;

        chJour = today.get(Calendar.DAY_OF_MONTH);

        chNbSemaine = today.get(Calendar.WEEK_OF_YEAR);

        //Calendar.DAY_OF_WEEK retourne 1 pour dimanche, 2 pour lundi...
        int dayOfWeek = today.get(Calendar.DAY_OF_WEEK);

        if (dayOfWeek == Calendar.SUNDAY) {
            chJourSemaine = 7;
        }
        else chJourSemaine = dayOfWeek - 1;
    }

    public DateCalendrier(int parJour,int parMois,int parAnnee) {
        super(parJour,parMois,parAnnee);
        Calendar today = Calendar.getInstance();
        today.set(parAnnee,parMois-1,parJour);

        chNbSemaine = today.get(Calendar.WEEK_OF_YEAR);

        //Calendar.DAY_OF_WEEK retourne 1 pour dimanche, 2 pour lundi...
        int dayOfWeek = today.get(Calendar.DAY_OF_WEEK);

        if (dayOfWeek == Calendar.SUNDAY) {
            chJourSemaine = 7;
        }
        else chJourSemaine = dayOfWeek - 1;
    }

    public int getChNbSemaine() {
        return chNbSemaine;
    }

    public DateCalendrier dateDuLendemain() {
        Date date_lendemain = super.dateDuLendemain();
        return new DateCalendrier(date_lendemain.chAnnee, date_lendemain.chMois, date_lendemain.chJour);
    }

    public DateCalendrier datedelaVeille() {
        Date date_delaVeille = super.dateDeLaVeille();
        return new DateCalendrier(date_delaVeille.chAnnee, date_delaVeille.chMois, date_delaVeille.chJour);
    }



    public String toString(){
        return JOURS_SEMAINE[chJourSemaine-1]+ " "+chJour+" "+MOIS[chMois-1]+" "+chAnnee;
    }
}
