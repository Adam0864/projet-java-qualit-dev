import java.util.Scanner;

public class Date {
    protected int chJour,chMois,chAnnee;

    public Date(int parJour, int parMois, int parAnnee) {
        chJour = parJour;
        chMois = parMois;
        chAnnee = parAnnee;
    }

    public Date(int parAnnee) {
        chJour = 1;
        chMois = 1;
        chAnnee = parAnnee;
    }

    public static boolean estBissextile(int parAnnee) {
        if ((parAnnee % 4 == 0 && parAnnee % 100 != 0) || parAnnee % 400 == 0 ) { return true; }
    else { return false; }
    }

    public static int nbJour(int parMois, int parAnnee) {
        if (estBissextile(parAnnee) == true && parMois == 2) {
            return 29;
        }
        if (parMois == 2) {
            return 28;
        }
        if (parMois == 1 || parMois == 3 || parMois == 5 || parMois == 7 || parMois == 8 || parMois == 10 || parMois == 12) {
            return 31;
        }
        if (parMois == 4 || parMois == 6 || parMois == 9 || parMois == 11) {
            return 30;
        }

        return 0;
    }

    public boolean estValide() {
        if (1 <= chJour && chJour <= nbJour(chMois, chAnnee)) { return true; }
        else { return false; }
    }

    public static Date lireDate() {
        System.out.println("entrez le jour");
        Scanner sc = new Scanner(System.in);
        int jour = sc.nextInt();

        System.out.println("entrez le mois");
        Scanner sc2 = new Scanner(System.in);
        int mois = sc2.nextInt();

        System.out.println("entrez l'année");
        Scanner sc3 = new Scanner(System.in);
        int annee = sc3.nextInt();

        return new Date(jour, mois, annee);
    }

    public int compareTo(Date parDate) {
        if (chAnnee > parDate.chAnnee) { return 1; }
        else if (chAnnee < parDate.chAnnee) { return -1; }
        else if (chMois > parDate.chMois) { return 1; }
        else if (chMois < parDate.chMois) { return -1; }
        else if (chJour > parDate.chJour) { return 1; }
        else if (chJour < parDate.chJour) { return -1; }
        return 0;
    }

    public Date dateDuLendemain() {
        int jour = chJour;
        int mois = chMois;
        int annee = chAnnee;
        jour ++;
        if (jour > nbJour(mois, annee)) {
            jour = 1;
            mois ++;
            if (mois > 12) {
                mois = 1;
                annee ++;
            }
        }
        return new Date(jour, mois, annee);
    }

    public Date dateDeLaVeille() {
        int jour = chJour;
        int mois = chMois;
        int annee = chAnnee;
        jour --;
        if (jour <= 0) {
            mois --;
            if (mois <= 0) {
                mois = 12;
                annee --;
            }
            jour = nbJour(mois,annee);
        }
        return new Date(jour, mois, annee);
    }

    public String toString(){
        return chJour + "/" + chMois + "/" + chAnnee;
    }
}
