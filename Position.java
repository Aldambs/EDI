
public class Position {

    private int [][][] row  = new int[][][];
    private int [][][] col = new int[][][];

    public int[][][] getCol() {
        return col;
    }

    public int[][][] getRow() {
        return row;
    }

    public void setCol(int[][][] col) {
        this.col = col;
    }

    public void setRow(int[][][] row) {
        this.row = row;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
