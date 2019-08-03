package RevisaoPOO;

public class LeftRigthVacuumCleanerRobot extends AbsVacuumCleanerRobot{
	
	public LeftRigthVacuumCleanerRobot(Environment environment) {
		super(environment);
	}
	
	public Position move() {
		int linha = currentPosition.getRow();
		int coluna = currentPosition.getCol();
		
		if(l>super.environment.length) {
			try{
				coluna++;
				linha = 0;
			}catch(java.lang.ArrayIndexOutOfBoundsException e) {
				System.out.println("hehe");
			}
			currentPosition.setRow(linha);
			currentPosition.setRow(coluna);
		}else {
			currentPosition.setRow(linha);
			currentPosition.setRow(coluna);
		}
		
		return currentPosition;
		
	}

	public void turnOn() {
		
	}

	public boolean isSwitchedOn() {
		return false;
	}

	@Override
	public void isDrity() {
		
		
	}

	@Override
	public void clean() {
		
		
	}
	
	
	
	
	
}
