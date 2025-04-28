import java.util.Scanner;

public class ClientDate {
    public static void main(String[] args) {

        Date JourJ = new Date(1,3,2021);
        System.out.println(JourJ.dateDuLendemain());
        System.out.println(JourJ.dateDeLaVeille());

    }
}
