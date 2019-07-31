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
public class RobotException extends Exception {

    /**
     * Creates a new instance of <code>RobotException</code> without detail
     * message.
     */
    public RobotException() {
    }

    /**
     * Constructs an instance of <code>RobotException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public RobotException(String msg) {
        super(msg);
    }
}
