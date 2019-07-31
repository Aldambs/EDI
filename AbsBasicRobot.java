package provaPOO2_2018;

public abstract class AbsBasicRobot implements IRobot{
    protected Environment environment;
    protected Position currentPosition;
    protected Position initialPosition;
    protected Position finalPositon;

    public AbsBasicRobot(Environment environment) {
        this.environment = environment;
    }
    
    public void setStartPosition(Position position) throws RobotException{
       
    }
    public void setFinalPositon(Position finalPositon) throws RobotException{
        this.finalPositon = finalPositon;
    }
    
    public Environment getEnvironment() {
        return environment;
    }
    
    public Position getCurrentPosition() {
        return currentPosition;
    }

    public Position getInitialPosition() {
        return initialPosition;
    }
    
    public Position getFinalPositon() {
        return finalPositon;
    }
    public void prontPosition(){
        
    }
}
