package cg;
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = 4; // the total number of nodes in the level, including the gateways
        int L = 4; // the number of links
        int E = 1; // the number of exit gateways
        System.err.println("Noeuds: "+N);
        System.err.println("Liens: "+L);
        System.err.println("Passerelle(s) :"+E);
        String [] liens= new String[L];
        for (int i = 0; i < L; i++) {
            int N1 = in.nextInt(); // N1 and N2 defines a link between these nodes
            int N2 = in.nextInt();
            liens[i]=""+N1+" "+N2;
           System.err.println("Lien :"+liens[i]);
        }
        String [] positionP=new String[E];
        for (int i = 0; i < E; i++) {
            int EI = in.nextInt(); // the index of a gateway node
            positionP[i]=""+EI;
            System.err.println("Passerelle "+i+": "+positionP[i]);
        }
        
        
        
        
        liens[0]="1 3";
        liens[1]="2 3";
        liens[2]="0 1";
        liens[3]="0 2";
        
        
        
        // game loop
        while (true) {
            int SI = in.nextInt(); // The index of the node on which the Skynet agent is positioned this turn
            String positionV=""+SI;
            boolean ok=true;
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            /*for (String pos:positionP){
                if (pos.contains*/
            /*for(String lien:liens){
                if ((lien.contains(positionP))&& (lien.contains(positionV))){
                    System.out.println(lien);
                }
            }*/
            System.err.println("Position Virus: "+positionV);
            for (int i=0;i<L;i++){
                if ((liens[i].contains(positionP[0]))&& (liens[i].contains(positionV))){
                    System.out.println(liens[i]);
                    ok=false;
                }
            }
            if (ok){
                for (int i=0;i<L;i++){
                    if (liens[i].contains(positionV)){
                        System.out.println(liens[i]);
                    }
                }
            }
            //System.err.println("Passerelle "+i+": "+positionP[i]);
           // System.out.println("2 1"); // Example: 0 1 are the indices of the nodes you wish to sever the link between
        }
    }
}