public class ClientHoraire {
    public static void main(String[] args) {

        Horaire HoraireRDV = new Horaire(10,45);
        System.out.println(HoraireRDV);
        System.out.println(HoraireRDV.toMinutes());
    }
}
