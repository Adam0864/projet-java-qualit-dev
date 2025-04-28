public class ExceptionRes extends RuntimeException {
    private int chCodeErreur;

    public ExceptionRes(int parCodeErreur) {
        chCodeErreur = parCodeErreur;
    }

    public int getCodeErreur() {
        return chCodeErreur;
    }




}
