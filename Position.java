package provaPOO2_2018;

/**
 *
 * @author Alda Matos
 */
public class Position {

    private int row;
    private int col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }
    
    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }
    
    @Override
    public boolean equals(Object obj) {
       if (this == obj)
			return true;
		if ((obj == null) ||getClass() != obj.getClass() )
			return false;
		Position other = (Position) obj;
		if ((col != other.col)&&(row != other.row))
			return false;
		return true;
    }
    
    @Override
    public int hashCode() {
        final prime = 30;
        int solucao = 1;
        solucao = prime * solucao + this.row;
        solucao = prime * solucao + this.col;
        return solucao;
    }

    @Override
    public String toString() {
        return "[" + row + "," + col + "]";
    }

    
}
