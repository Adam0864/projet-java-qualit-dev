public class ExceptionPlage extends RuntimeException {
    private int chCodeErreur;

    public ExceptionPlage(int parCodeErreur) {
        chCodeErreur = parCodeErreur;
    }

    public int getCodeErreur() {
        return chCodeErreur;
    }



}
