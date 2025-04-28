import java.util.Arrays;

public class ClientPlageHoraire {
    public static void main(String[] args) {

        Horaire HoraireDeb = new Horaire(14,45);
        Horaire HoraireFin = new Horaire(16,15);
        PlageHoraire Plage = new PlageHoraire(HoraireDeb,HoraireFin);
        PlageHoraire Plage2 = new PlageHoraire(new Horaire(8,30),new Horaire(12,0));
        System.out.println(Plage);
        System.out.println(Plage.estValide());
        System.out.println(Plage2.compareTo(Plage));
        PlageHoraire [] tab = new PlageHoraire[2];

        tab[0] = Plage;
        tab[1] = Plage2;

        System.out.println(Arrays.toString(tab));
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));
    }
}
