package RevisaoPOO;

import java.util.Arrays;

public abstract class AbsBasicRobot implements IRobot { 
	
	protected Environment[] []environment;
	protected Position currentPosition;
	protected Position initialPosition;
	protected Position finalPosition;
	
//-------------------------------------------------------------------//
	public AbsBasicRobot(Environment environment) {
		this.environment = new Environment[3][3];
		initialPosition = new Position(0, 0);
		finalPosition = new Position(2, 2);
		currentPosition = new Position(0, 0);
		
	}
//-------------------------------------------------------------------//
	
	public void setStartPosition(Position position) {
		
		try{
			initialPosition = position;
		}catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inicial inválida.");
		}
		
	}
	


	public void setFinalPosition(Position position) {
		try{
			finalPosition = position;
		}catch(NullPointerException e) {
			System.out.println("Posição final inválida.");
		}
	}
	
	public Environment[][] getEnvironment() { 
		return environment;
	}
	
	public Position getInitialPosition() {
		return initialPosition;
	}
	public Position getFinalPosition() {
		return finalPosition;
	}
	public Position getCurrentPosition() {
		return currentPosition;
	}
	
	public void setCurrentPosition(Position currentPosition) {
		this.currentPosition = currentPosition;
	}
	
	
	public void printPosition() {
		System.out.println( "\nO robô está na posição "+currentPosition+"." );
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currentPosition == null) ? 0 : currentPosition.hashCode());
		result = prime * result + Arrays.deepHashCode(environment);
		result = prime * result + ((finalPosition == null) ? 0 : finalPosition.hashCode());
		result = prime * result + ((initialPosition == null) ? 0 : initialPosition.hashCode());
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
		AbsBasicRobot other = (AbsBasicRobot) obj;
		if (currentPosition == null) {
			if (other.currentPosition != null)
				return false;
		} else if (!currentPosition.equals(other.currentPosition))
			return false;
		if (!Arrays.deepEquals(environment, other.environment))
			return false;
		if (finalPosition == null) {
			if (other.finalPosition != null)
				return false;
		} else if (!finalPosition.equals(other.finalPosition))
			return false;
		if (initialPosition == null) {
			if (other.initialPosition != null)
				return false;
		} else if (!initialPosition.equals(other.initialPosition))
			return false;
		return true;
	}
	
	
	
	
	

}
