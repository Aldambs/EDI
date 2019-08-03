package RevisaoPOO;

import java.util.Currency;

public abstract class AbsVacuumCleanerRobot extends AbsBasicRobot implements IVacuumCleaner{
	
	private boolean switchedOn;
	
	public AbsVacuumCleanerRobot(Environment environment) {
		super(environment);
	}
	
	public void turnOn() {
		switchedOn = true;
	}
	
	public void turnOff() {
		switchedOn = false;
	}
	
	public boolean isDirty() {
		if(currentPosition.equals(' ')) {
		     return false;
		}
		else {
		     return true;
		} 
		
	}
	
	public void clear() {
		environment.setPosition[correntPositin, ' '];
				
	}
	
	
}
