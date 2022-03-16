package edu.fci;

import javax.swing.*;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    int a;
    float f;
    String s;
    static final int ROUNDS = 3;
    int Fun(int a, int b){
        return a+b;
    }
    int Fun1(int a, int b){
        return a*b;
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner input  = new Scanner(System.in);
       /* int m = input.nextInt();
        PrintWriter output = new PrintWriter(System.out, true);
        output.println("Hello");

        System.out.println("Hello");*/

               /* int n1,n2, sum;
                String s1 = JOptionPane.showInputDialog(null,"Enter First Num:");
                String s2 = JOptionPane.showInputDialog(null,"Enter Second Num:");
                n1 = Integer.parseInt(s1);
                n2 = Integer.parseInt(s2);
                sum  = n1 + n2;
                JOptionPane.showMessageDialog(null,"Sum = "+sum);*/



        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");
        startGame(input, p1, p2);

        // System.out.println(p1.getName() + " Total Score is "+p1.getTotalScore());
        // System.out.println(p2.getName() + " Total Score is "+p2.getTotalScore());
        showResult(p1, p2);

    }

    private static void startGame(Scanner input, Player p1, Player p2) {
        for (int i = 1; i <= ROUNDS; i++) {
            //System.out.println("Round "+(i+1));
            JOptionPane.showMessageDialog(null, "Round "+i);
            System.out.println(p1.getName());
            p1.Play();
            System.out.println("Player 1 Score = "+ p1.getScore());
            System.out.println(p2.getName());
            input.nextLine();
            p2.Play();
            System.out.println("Player 2 Score = "+ p2.getScore());
            System.out.println("=======================================");
        }
    }

    private static void showResult(Player p1, Player p2) {
        String m1 = p1.getName() + " Total Score is "+ p1.getTotalScore();
        String m2 = p2.getName() + " Total Score is "+ p2.getTotalScore();

        String msg = String.format("%s\n%s",m1,m2);
        JOptionPane.showMessageDialog(null,msg);
        if(p1.getTotalScore()> p2.getTotalScore()){
            JOptionPane.showMessageDialog(null, "Winner is "+ p1.getName());
        } else if(p1.getTotalScore()< p2.getTotalScore()) {
            JOptionPane.showMessageDialog(null,"Winner is " + p2.getName());
        } else{
            System.out.println("Draw");
        }
    }
}
