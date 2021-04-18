/*
 */
package project1;

import java.util.*;

/**
 * @author Ariel G
 */
public class Project1 {

    public static void main(String[] args) {
        
        //int[] CallFloor = new int [4];
        //int FinalFloor;
        int numpass = 3;
        int TMin = 0;
        int TMax = 60;
        int MaxFloor = 10;
        int MinFloor = -1;
        //int [] CallFloor = new int [numpass];
        //int [] FinalFloor = new int [numpass];
        //int [] T0 = new int [numpass];
        
        //CallFloor = Random (numpass, MaxFloor, MinFloor);
        //FinalFloor = Random (numpass, MaxFloor, MinFloor);
        //T0 = Random (numpass, TMax, TMin);
        /*
        for (int i = 0; i<Origin.length; i++){
            System.out.println(Origin[i]);
        }
        */
        Elevator ElevatorA = new Elevator();
        Elevator ElevatorB = new Elevator();
       
        int [] CallFloor = {5, 0, 1};
        int [] FinalFloor = {10, 5, -1};
        int [] T0 = {3, 6, 2};
        int [] dT = new int [2];
        Arrays.sort(T0);
        
        int i = 0;
        
        for (int j = 0; j < TMax; j++){
            
            System.out.println("Time: " + j + " seg");
            System.out.println(ElevatorA.Position);
            System.out.println(ElevatorB.Position);
            
            if (j == T0[i]){
                System.out.println("Call from Floor " + CallFloor[i]);
                if (ElevatorA.Distance(CallFloor[i]) <= ElevatorB.Distance(CallFloor[i])){
                    
                    ElevatorA.Position = CallFloor[i];
                    System.out.println("A: Move to: " + ElevatorA.Position);
                    ElevatorA.Open();
                    System.out.println("Doors open");
                    ElevatorA.Close();
                    System.out.println("Doors close");
                    
                    if (FinalFloor[i] == 10){
                        ElevatorA.Position = FinalFloor[i] - 1;
                        System.out.println("A: Move to: " + ElevatorA.Position);
                        dT[i] = ElevatorA.Distance + Math.abs(FinalFloor[i] - 1 - CallFloor[i]) + j - T0[i];
                        System.out.println("Time: " + dT[i] + " Sec");
                        ElevatorA.Open();
                        System.out.println("Doors open");
                        ElevatorA.Close();
                        System.out.println("Doors close");
                    }
                    else {
                        ElevatorA.Position = FinalFloor[i];
                        System.out.println("A: Move to: " + ElevatorA.Position);
                        dT[i] = ElevatorA.Distance + Math.abs(FinalFloor[i] - CallFloor[i]) + j - T0[i];
                        System.out.println("Time: " + dT[i] + " Sec");
                        ElevatorA.Open();
                        System.out.println("Doors open");
                        ElevatorA.Close();
                        System.out.println("Doors close");
                    }

                }
                else {
                    ElevatorB.Position = CallFloor[i];
                    System.out.println("B: Move to: " + ElevatorB.Position);
                    ElevatorB.Open();
                    System.out.println("Doors open");
                    ElevatorB.Close();
                    System.out.println("Doors close");
                    if (FinalFloor[i] == -1){
                        ElevatorB.Position = FinalFloor[i] + 1;
                        System.out.println("B: Move to: " + ElevatorB.Position);
                        dT[i] = ElevatorB.Distance + Math.abs(FinalFloor[i] + 1 - CallFloor[i])+ j - T0[i];
                        System.out.println("Time: " + dT[i] + " Sec");
                        ElevatorB.Open();
                        System.out.println("Doors open");
                        ElevatorB.Close();
                        System.out.println("Doors close");                        
                    }
                    else {
                       ElevatorB.Position = FinalFloor[i];
                       System.out.println("B: Move to: " + ElevatorB.Position);
                       dT[i] = ElevatorB.Distance + Math.abs(FinalFloor[i] - CallFloor[i])+ j - T0[i];
                       System.out.println("Time: " + dT[i] + " Sec");
                       ElevatorB.Open();
                       System.out.println("Doors open");
                       ElevatorB.Close();
                       System.out.println("Doors close");                       
                    }

                }
            }
            
            
            
            
            /*
            if (j == T0[i]){
                System.out.println("Call from Floor " + CallFloor[i]);
                                
                if (ElevatorA.Distance(CallFloor[i]) <= ElevatorB.Distance(CallFloor[i])){
                    
                    ElevatorA.Position = CallFloor[i];
                    System.out.println("A: Move to: " + ElevatorA.Position);
                    ElevatorA.Open();
                    System.out.println("Doors open");
                    ElevatorA.Close();
                    System.out.println("Doors close");
                    
                    if (FinalFloor[i] == 10){
                        ElevatorA.Position = FinalFloor[i] - 1;
                        System.out.println("A: Move to: " + ElevatorA.Position);
                        dT[i] = ElevatorA.Distance + Math.abs(FinalFloor[i] - 1 - CallFloor[i]) + j - T0[i];
                        System.out.println("Time: " + dT[i] + " Sec");
                        ElevatorA.Open();
                        System.out.println("Doors open");
                        ElevatorA.Close();
                        System.out.println("Doors close");
                    }
                    else {
                        ElevatorA.Position = FinalFloor[i];
                        System.out.println("A: Move to: " + ElevatorA.Position);
                        dT[i] = ElevatorA.Distance + Math.abs(FinalFloor[i] - CallFloor[i]) + j - T0[i];
                        System.out.println("Time: " + dT[i] + " Sec");
                        ElevatorA.Open();
                        System.out.println("Doors open");
                        ElevatorA.Close();
                        System.out.println("Doors close");
                    }

                }
                else {
                    ElevatorB.Position = CallFloor[i];
                    System.out.println("B: Move to: " + ElevatorB.Position);
                    ElevatorB.Open();
                    System.out.println("Doors open");
                    ElevatorB.Close();
                    System.out.println("Doors close");
                    if (FinalFloor[i] == -1){
                        ElevatorB.Position = FinalFloor[i] + 1;
                        System.out.println("B: Move to: " + ElevatorB.Position);
                        dT[i] = ElevatorB.Distance + Math.abs(FinalFloor[i] + 1 - CallFloor[i])+ j - T0[i];
                        System.out.println("Time: " + dT[i] + " Sec");
                        ElevatorB.Open();
                        System.out.println("Doors open");
                        ElevatorB.Close();
                        System.out.println("Doors close");                        
                    }
                    else {
                       ElevatorB.Position = FinalFloor[i];
                       System.out.println("B: Move to: " + ElevatorB.Position);
                       dT[i] = ElevatorB.Distance + Math.abs(FinalFloor[i] - CallFloor[i])+ j - T0[i];
                       System.out.println("Time: " + dT[i] + " Sec");
                       ElevatorB.Open();
                       System.out.println("Doors open");
                       ElevatorB.Close();
                       System.out.println("Doors close");                       
                    }

                }
            i++;
            }
            */
        }
        
        
    }
    public static int [] Random (int numpass, int max, int min){
        int [] Random = new int [numpass];

        for (int i = 0; i<Random.length; i++){
            Random [i]= (int) ((max+2)*Math.random()+min-1);
        } 
        return Random;
    }
}
