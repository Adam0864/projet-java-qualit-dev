public class Planning {
    private Reservation[] chTable;
    private final int chTaille;
    private int chNbrEff = 0;

    public Planning(int parTaille) {
        chTable = new Reservation[parTaille];
        chTaille = parTaille;
    }

    public void ajout(Reservation parReservation) throws ExceptionPlanning{
        if (chNbrEff >= chTaille)
            throw new ExceptionPlanning(1);
        if (!parReservation.estValide())
            throw new ExceptionPlanning(0);
        for (int i = 0; i < chNbrEff; i++) {
            if (chTable[i].compareTo(parReservation) == 0) {
                throw new ExceptionPlanning(2);
            }
        }
        chTable[chNbrEff++] = parReservation;
    }

    public Reservation[] getTable() {
        return chTable;
    }

    public Reservation getReservation(Date parDate) {
        for (int i = 0; i < chNbrEff; i++) {
            if (chTable[i].getChDateReservation().compareTo(parDate) == 0) {
                return chTable[i];
            }
        }
        return null;
    }

    public Reservation[] getReservations(Date parDate) {
        Reservation[] res_date = new Reservation[chNbrEff];
        int y = 0;
        for (int i = 0; i < chNbrEff; i++) {
            if (chTable[i].getChDateReservation().compareTo(parDate) == 0) {
                res_date[y] = chTable[i];
                System.out.println(res_date[y]);
                y++;
            }
        }
        return res_date;
    }

    public int plusAncienneReservation(int parDebut, int parFin) {
        int plusancienne = -1;
        for (int i = parDebut; i <= parFin; i++) {
            if (plusancienne == -1 || chTable[i].getChDateReservation().compareTo(chTable[plusancienne].getChDateReservation()) < 0) {
                plusancienne = i;
            }
        }
        return plusancienne;
    }

    public void Tri() {
        for (int i = 0; i < chNbrEff; i++) {
            int plusancienne = this.plusAncienneReservation(i,chNbrEff-1);
            Reservation Save = chTable[i];

            chTable[i] = chTable[plusancienne];
            chTable[plusancienne] = Save;
        }
    }


    public String toString () {
        String affichage = "";
        for (int i = 0; i < chNbrEff; i++) {
            affichage = affichage + chTable[i].toString() + "\n";
        }
        return affichage;
    }
}

