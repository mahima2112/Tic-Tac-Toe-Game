/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javax.swing.JFrame;
/**
 *
 * @author hp
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame ticTacToe = new TicTacToeFrame();
        ticTacToe.setTitle("Tic Tac Toe Game");
        ticTacToe.setSize(600,600);
        ticTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ticTacToe.setLocationRelativeTo(null);
        ticTacToe.setVisible(true);
        
    }
    
}
