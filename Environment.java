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
public class Environment {
    private char[][] environment;
    private int width;

    public Environment(char[][] environment){
        this.environment = environment;
    }

    public Environment(int width, int length){
        this.width = width;
    }
}
