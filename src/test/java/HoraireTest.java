import static org.junit.Assert.assertEquals;

public class HoraireTest {
    @org.junit.jupiter.api.Test
    void Testcompareto() {
        assertEquals(-15,new Horaire(14,15).compareTo(new Horaire(14,30)));
    }
}
