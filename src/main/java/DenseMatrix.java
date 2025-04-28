public class DenseMatrix {
    private int chNRow, chNCol;
    private double[][] vals;

    public DenseMatrix(){
        chNRow = 1;
        chNCol = 1;
        vals = new double[chNRow][chNCol];
    }

    public DenseMatrix(double[][] mat){
        chNRow = mat.length;
        chNCol = mat[0].length;
        vals = new double[chNRow][chNCol];
    }

    public DenseMatrix(int n, int m) {
        vals = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                vals[i][j] = 0;
            }
        }
    }

    public int getRowDimension() {
        return chNRow;
    }

    public int getColDimension() {
        return chNCol;
    }

    public double get(int i, int j) {
        return vals[i][j];
    }

    public void set(int i, int j, double aij) {
        vals[i][j] = aij;
    }

    /*public String write(){
        int res=0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chNRow; i++) {
            for (int j = 0; j < chNCol; j++) {
                res=vals[i][j];
                sb.append(res);
            }
        }
    }*/
}
