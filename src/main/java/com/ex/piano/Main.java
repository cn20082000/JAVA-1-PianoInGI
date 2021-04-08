 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ex.piano;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cn200
 */
public class Main {
    private static int tempo;
    private static Robot robot;
    private static Random generator;
    
    public static void main(String args[]) {
        tempo = 600;
        generator = new Random(System.currentTimeMillis());
        try {
            robot = new Robot();
            
            System.out.println("Start counting...");
            sleep(5000);
            
            sleep(tempo);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_J}, tempo / 2);
            play(new int[]{KeyEvent.VK_H}, tempo / 2);
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_H}, tempo / 2);
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_H}, tempo / 2);
            play(new int[]{KeyEvent.VK_J}, tempo / 2);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_S}, tempo / 2);
            play(new int[]{KeyEvent.VK_S}, tempo / 2);
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_S, KeyEvent.VK_H}, tempo / 2);
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_H}, tempo / 2);
            play(new int[]{KeyEvent.VK_J}, tempo / 2);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_G, KeyEvent.VK_J}, tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_J}, tempo / 2);
            play(new int[]{KeyEvent.VK_Q}, tempo / 2);
            play(new int[]{KeyEvent.VK_J}, tempo / 2);
            play(new int[]{KeyEvent.VK_S, KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_D}, tempo / 2);
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_J}, tempo / 2);
            play(new int[]{KeyEvent.VK_J}, tempo * 2);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_S}, tempo / 2);
            play(new int[]{KeyEvent.VK_S}, tempo / 2);
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_A, KeyEvent.VK_D, KeyEvent.VK_H}, tempo / 2);
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_H}, tempo / 2);
            play(new int[]{KeyEvent.VK_A, KeyEvent.VK_D, KeyEvent.VK_J}, tempo / 2);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_S, KeyEvent.VK_H}, tempo / 2);
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_S, KeyEvent.VK_H}, tempo / 2);
            play(new int[]{KeyEvent.VK_F, KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_J}, tempo / 2);
            play(new int[]{KeyEvent.VK_F, KeyEvent.VK_H}, tempo / 2);
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_J}, tempo / 2);
            play(new int[]{KeyEvent.VK_J}, tempo / 2);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_J}, tempo / 2);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_G, KeyEvent.VK_Q}, tempo);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_J}, tempo / 2);
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_S, KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_D}, tempo);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_G}, tempo);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo / 2);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo / 2);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_G, KeyEvent.VK_E}, tempo);
            play(new int[]{KeyEvent.VK_C, KeyEvent.VK_D}, tempo);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_E}, tempo / 2);
            play(new int[]{KeyEvent.VK_F, KeyEvent.VK_R}, tempo / 2);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_E}, tempo / 2);
            play(new int[]{KeyEvent.VK_S, KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_J, KeyEvent.VK_E}, tempo);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo);
            play(new int[]{KeyEvent.VK_J, KeyEvent.VK_E}, tempo);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo);
            play(new int[]{KeyEvent.VK_J, KeyEvent.VK_E}, tempo);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo);
            play(new int[]{KeyEvent.VK_J, KeyEvent.VK_E}, tempo / 2);
            play(new int[]{KeyEvent.VK_R}, tempo / 2);
            play(new int[]{KeyEvent.VK_J, KeyEvent.VK_E}, tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_J, KeyEvent.VK_E}, tempo);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo);
            play(new int[]{KeyEvent.VK_J, KeyEvent.VK_E}, tempo);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo);
            play(new int[]{KeyEvent.VK_J, KeyEvent.VK_E}, tempo);
            play(new int[]{KeyEvent.VK_D}, tempo);
            play(new int[]{KeyEvent.VK_J, KeyEvent.VK_E}, tempo / 2);
            play(new int[]{KeyEvent.VK_R}, tempo / 2);
            play(new int[]{KeyEvent.VK_J, KeyEvent.VK_E}, tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_E, KeyEvent.VK_U}, tempo);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_J, KeyEvent.VK_E}, tempo);
            play(new int[]{KeyEvent.VK_E, KeyEvent.VK_U}, tempo);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_J, KeyEvent.VK_E}, tempo);
            /*play(new int[]{KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo / 2);*/
        } catch (AWTException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void play(int key[], int length) throws InterruptedException {
        length = length + generator.nextInt(21) - 10;
        for (int i = 0; i < key.length; ++i) {
            robot.keyPress(key[i]);
        }
        Thread.sleep(length / 2);
        for (int i = 0; i < key.length; ++i) {
            robot.keyRelease(key[i]);
        }
        Thread.sleep(length / 2);
    }
    
    private static void sleep(int length) throws InterruptedException {
        Thread.sleep(length);
    }
}
