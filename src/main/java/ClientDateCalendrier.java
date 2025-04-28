import java.util.Arrays;

public class ClientDateCalendrier {
    public static void main(String[] args) {
        DateCalendrier date = new DateCalendrier(2000,1,5);
        DateCalendrier date2 = new DateCalendrier();
        DateCalendrier date3 = new DateCalendrier(2000,1,8);
        DateCalendrier date4 = new DateCalendrier(2008,6,3);
        System.out.println(date4.toString());
        DateCalendrier [] tab = new DateCalendrier[4];
        tab[0] = date;
        tab[1] = date2;
        tab[2] = date3;
        tab[3] = date4;

        System.out.println(Arrays.toString(tab));
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));
    }
}
