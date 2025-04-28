import static org.junit.Assert.assertEquals;

public class PlageHoraireTest {
    @org.junit.jupiter.api.Test
    void Testcompareto() {
        PlageHoraire P1 = new PlageHoraire(new Horaire(14,15),new Horaire(14,30));
        PlageHoraire P2 = new PlageHoraire(new Horaire(15,15),new Horaire(15,30));
        assertEquals(-1,new PlageHoraire(new Horaire(14,15),new Horaire(14,30)));
    }
}
