/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author ariel
 */
public class Elevator {
    public int Position = 0;
    public boolean Door = false;
    public int Distance;
    
    public int position(int floor) {
        return Position = floor;
    }  
    
    public boolean Open() {
        return Door = true;
    }
    
    public boolean Close() {
        return Door = false;
    }
    
    public int Distance (int Destination){
        return Distance = Math.abs(Destination - Position);
    }
    
    public boolean Moving () {
        
        return true;
    }
}
