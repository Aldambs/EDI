package RevisaoPOO;

import java.util.Arrays;

public class Environment {
	private char[][] environment;
	private int width;
	private int length;
	
	public Environment(char[][] environment) {
		this.environment = new char[3][3];
	}
	
	public Environment(int width, int length) {
		this.environment = new char[width][length];
		this.width = width;
		this.length = length;
		
	}
	public char getValue(Position position){
		return environment[position.getRow()][position.getCol()];
		
	}
	
	public int getLength() {
		return length;
	}public int getWidth() {
		return width;
	}
	
	public void setVelue (Position position, char value) {
		environment[position.getRow()][position.getCol()]=value;
	}
	
	
	public void printEnvironment() {
		System.out.println("::: Ambiente :::");
		for (int i = 0; i < environment.length; i++) {
			for (int j = 0; j < environment[i].length; j++) {
				System.out.print(environment[i][j]);
			}
			System.out.println();
		}
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(environment);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Environment other = (Environment) obj;
		if (!Arrays.deepEquals(environment, other.environment))
			return false;
		return true;
	}
	
	
	
	@Override
	public String toString() {
		return Arrays.deepToString(environment);
		
	}
	
	
}
