/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaPOO2_2018;

/**
 *
 * @author Alda Matos
 */
public interface IRobot {
    public void setStartPosition(Position position) throws RobotException;
    public void setFinalPosition(Position positin)throws RobotException;
    public void printPosition();
    public Position getCurrentPosition();
    public Position mover();

}
