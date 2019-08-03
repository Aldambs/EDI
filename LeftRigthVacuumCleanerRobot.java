package RevisaoPOO;

public class LeftRigthVacuumCleanerRobot extends AbsVacuumCleanerRobot{
	
	public LeftRigthVacuumCleanerRobot(Environment environment) {
		super(environment);
	}
	
	public Position move() {
		int l=currentPosition.getRow();
		int c=currentPosition.getCol();
		
		if(l>super.environment.length) {
			try{
				c++;
				l=0;
			}catch(java.lang.ArrayIndexOutOfBoundsException e) {
				System.out.println("hehe");
			}
			currentPosition.setRow(l);
			currentPosition.setRow(c);
		}else {
			currentPosition.setRow(l);
			currentPosition.setRow(c);
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
