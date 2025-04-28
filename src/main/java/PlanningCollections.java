import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class PlanningCollections {
    private ArrayList<Reservation> chListe;
    private TreeSet<Reservation> chSet;
    private TreeMap <Integer,TreeSet<Reservation>> chMap;

    public PlanningCollections() {
        chListe = new ArrayList<>();
        chSet = new TreeSet<>();
        chMap = new TreeMap<>();
    }

    public void ajout(Reservation parRes){
        chListe.add(parRes);
        chSet.add(parRes);
        TreeSet<Reservation> treeRetour = new TreeSet<>();
        Iterator<Reservation> iterateur = chSet.iterator();
        while(iterateur.hasNext()){
            Reservation current = iterateur.next();
            if (current.getChDateReservation().getChNbSemaine()==parRes.getChDateReservation().getChNbSemaine()){
                treeRetour.add(current);
            }
        }
        chMap.put(parRes.getChDateReservation().getChNbSemaine(), treeRetour);
    }

    public String toString(){
        String str = "ArrayList\n"+chListe+"\nTreeSet\n"+chSet;
        return "Taille Liste: "+chListe.size()+"\nTailleSet: "+chSet.size()+"\n"+str+"\nTreeMap: "+chMap;
    }

    public TreeSet<Reservation> getReservations(DateCalendrier parDate) {
        TreeSet<Reservation> treeRetour = new TreeSet<>();
        Iterator<Reservation> iterateur = chSet.iterator();
        while(iterateur.hasNext()){
            Reservation current = iterateur.next();
            if (current.getChDateReservation().compareTo(parDate)==0){
                treeRetour.add(current);
            }
        }
        return treeRetour;
    }

    public TreeSet<Reservation> getReservations(String parString) {
        TreeSet<Reservation> treeRetour = new TreeSet<>();
        Iterator<Reservation> iterateur = chSet.iterator();
        while(iterateur.hasNext()){
            Reservation current = iterateur.next();
            if (current.getChIntitule().contains(parString)){
                treeRetour.add(current);
            }
        }
        return treeRetour;
    }
}
