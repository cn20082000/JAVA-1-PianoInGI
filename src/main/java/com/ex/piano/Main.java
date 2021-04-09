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
        tempo = 800;
        generator = new Random(System.currentTimeMillis());
        try {
            robot = new Robot();
            
            System.out.println("Start counting...");
            sleep(5000);
            
            // k1
            sleep(tempo);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_J}, tempo / 2);
            play(new int[]{KeyEvent.VK_H}, tempo / 2);
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            // k2
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_H}, tempo / 2);
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_H}, tempo / 2);
            play(new int[]{KeyEvent.VK_J}, tempo / 2);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_S}, tempo / 2);
            play(new int[]{KeyEvent.VK_S}, tempo / 2);
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            // k3
            play(new int[]{KeyEvent.VK_S, KeyEvent.VK_H}, tempo / 2);
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_H}, tempo / 2);
            play(new int[]{KeyEvent.VK_J}, tempo / 2);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_G, KeyEvent.VK_J}, tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            // k4
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_J}, tempo / 2);
            play(new int[]{KeyEvent.VK_Q}, tempo / 2);
            play(new int[]{KeyEvent.VK_J}, tempo / 2);
            play(new int[]{KeyEvent.VK_S, KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_D}, tempo / 2);
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_J}, tempo / 2);
            // k5
            play(new int[]{KeyEvent.VK_J}, tempo * 2);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_S}, tempo / 2);
            play(new int[]{KeyEvent.VK_S}, tempo / 2);
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            // k6
            play(new int[]{KeyEvent.VK_A, KeyEvent.VK_D, KeyEvent.VK_H}, tempo / 2);
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_H}, tempo / 2);
            play(new int[]{KeyEvent.VK_A, KeyEvent.VK_D, KeyEvent.VK_J}, tempo / 2);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_S, KeyEvent.VK_H}, tempo / 2);
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_S, KeyEvent.VK_H}, tempo / 2);
            // k7
            play(new int[]{KeyEvent.VK_F, KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_J}, tempo / 2);
            play(new int[]{KeyEvent.VK_F, KeyEvent.VK_H}, tempo / 2);
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_J}, tempo / 2);
            play(new int[]{KeyEvent.VK_J}, tempo / 2);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_J}, tempo / 2);
            // k8
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_G, KeyEvent.VK_Q}, tempo);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_J}, tempo / 2);
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_S, KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_D}, tempo);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_G}, tempo / 2);
            // k9
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_G}, tempo);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo / 2);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo / 2);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_G}, tempo / 2);
            // k10
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_G, KeyEvent.VK_E}, tempo);
            play(new int[]{KeyEvent.VK_C, KeyEvent.VK_D}, tempo);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_E}, tempo / 2);
            play(new int[]{KeyEvent.VK_F, KeyEvent.VK_R}, tempo / 2);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_E}, tempo / 2);
            play(new int[]{KeyEvent.VK_S, KeyEvent.VK_W}, tempo / 2);
            // k11
            play(new int[]{KeyEvent.VK_J, KeyEvent.VK_E}, tempo);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo);
            play(new int[]{KeyEvent.VK_J, KeyEvent.VK_E}, tempo);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo);
            // k12
            play(new int[]{KeyEvent.VK_J, KeyEvent.VK_E}, tempo);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo);
            play(new int[]{KeyEvent.VK_J, KeyEvent.VK_E}, tempo / 2);
            play(new int[]{KeyEvent.VK_R}, tempo / 2);
            play(new int[]{KeyEvent.VK_J, KeyEvent.VK_E}, tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo / 2);
            // k13
            play(new int[]{KeyEvent.VK_J, KeyEvent.VK_E}, tempo);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo);
            play(new int[]{KeyEvent.VK_J, KeyEvent.VK_E}, tempo);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo);
            // k14
            play(new int[]{KeyEvent.VK_J, KeyEvent.VK_E}, tempo);
            play(new int[]{KeyEvent.VK_D}, tempo);
            play(new int[]{KeyEvent.VK_J, KeyEvent.VK_E}, tempo / 2);
            play(new int[]{KeyEvent.VK_R}, tempo / 2);
            play(new int[]{KeyEvent.VK_J, KeyEvent.VK_E}, tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo / 2);
            // k15
            play(new int[]{KeyEvent.VK_E, KeyEvent.VK_U}, tempo);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_J, KeyEvent.VK_E}, tempo);
            play(new int[]{KeyEvent.VK_E, KeyEvent.VK_U}, tempo);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_J, KeyEvent.VK_E}, tempo);
            // k16
            play(new int[]{KeyEvent.VK_E, KeyEvent.VK_U}, tempo);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_J, KeyEvent.VK_E}, tempo);
            play(new int[]{KeyEvent.VK_E, KeyEvent.VK_Y}, tempo / 2);
            play(new int[]{KeyEvent.VK_R, KeyEvent.VK_U}, tempo / 2);
            play(new int[]{KeyEvent.VK_E, KeyEvent.VK_Y}, tempo / 2);
            play(new int[]{KeyEvent.VK_W, KeyEvent.VK_T}, tempo / 2);
            // k17
            play(new int[]{KeyEvent.VK_E, KeyEvent.VK_U}, tempo);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_J, KeyEvent.VK_E}, tempo);
            play(new int[]{KeyEvent.VK_E, KeyEvent.VK_U}, tempo);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_J, KeyEvent.VK_E}, tempo);
            // k18
            play(new int[]{KeyEvent.VK_E, KeyEvent.VK_U}, tempo);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_J, KeyEvent.VK_E}, tempo);
            play(new int[]{KeyEvent.VK_E, KeyEvent.VK_Y}, tempo / 2);
            play(new int[]{KeyEvent.VK_R, KeyEvent.VK_U}, tempo / 2);
            play(new int[]{KeyEvent.VK_E, KeyEvent.VK_Y}, tempo / 2);
            play(new int[]{KeyEvent.VK_W, KeyEvent.VK_T}, tempo / 2);
            // k19
            play(new int[]{KeyEvent.VK_U}, tempo);
            play(new int[]{KeyEvent.VK_E}, tempo / 2);
            play(new int[]{KeyEvent.VK_Y}, tempo / 2);
            play(new int[]{KeyEvent.VK_Y}, tempo / 2);
            play(new int[]{KeyEvent.VK_E}, tempo / 2);
            play(new int[]{KeyEvent.VK_E}, tempo / 2);
            play(new int[]{KeyEvent.VK_E}, tempo / 2);
            // k20
            play(new int[]{KeyEvent.VK_T}, tempo / 2);
            play(new int[]{KeyEvent.VK_R}, tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo);
            play(new int[]{KeyEvent.VK_J}, tempo);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_E}, tempo / 2);
            // k21
            play(new int[]{KeyEvent.VK_U}, tempo / 2);
            play(new int[]{KeyEvent.VK_U}, tempo / 2);
            play(new int[]{KeyEvent.VK_E}, tempo / 2);
            play(new int[]{KeyEvent.VK_Y}, tempo / 2);
            play(new int[]{KeyEvent.VK_Y}, tempo / 2);
            play(new int[]{KeyEvent.VK_E}, tempo / 2);
            play(new int[]{KeyEvent.VK_E}, tempo / 2);
            play(new int[]{KeyEvent.VK_T}, tempo / 2);
            // k22
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_Y}, tempo / 2);
            play(new int[]{KeyEvent.VK_U}, tempo / 2);
            play(new int[]{KeyEvent.VK_U}, tempo / 2);
            play(new int[]{KeyEvent.VK_U}, tempo / 2);
            play(new int[]{KeyEvent.VK_Y}, tempo);
            // k23
            play(new int[]{KeyEvent.VK_J}, tempo);
            play(new int[]{KeyEvent.VK_D}, tempo / 2);
            play(new int[]{KeyEvent.VK_H}, tempo / 2);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_D}, tempo);
            play(new int[]{KeyEvent.VK_D}, tempo / 2);
            // k24
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_F}, tempo / 2);
            play(new int[]{KeyEvent.VK_S}, tempo);
            play(new int[]{KeyEvent.VK_M}, tempo);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_D}, tempo / 2);
            // k25
            play(new int[]{KeyEvent.VK_J}, tempo);
            play(new int[]{KeyEvent.VK_D}, tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_J}, tempo / 2);
            play(new int[]{KeyEvent.VK_H}, tempo / 2);
            play(new int[]{KeyEvent.VK_F}, tempo / 2);
            // k26
            play(new int[]{KeyEvent.VK_F}, tempo / 2);
            play(new int[]{KeyEvent.VK_G}, tempo / 2);
            play(new int[]{KeyEvent.VK_G}, tempo);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo / 2);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo / 2);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo / 2);
            // k27
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo / 2);
            sleep(tempo / 4);
            play(new int[]{KeyEvent.VK_N, KeyEvent.VK_S}, tempo / 4);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo / 2);
            play(new int[]{KeyEvent.VK_A, KeyEvent.VK_F}, tempo / 2);
            sleep(tempo / 4);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo / 4);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_N, KeyEvent.VK_S}, tempo / 2);
            // k28
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo / 2);
            sleep(tempo / 4);
            play(new int[]{KeyEvent.VK_N, KeyEvent.VK_S}, tempo / 4);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo / 2);
            play(new int[]{KeyEvent.VK_A, KeyEvent.VK_F}, tempo / 2);
            sleep(tempo / 4);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo / 4);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_N, KeyEvent.VK_S}, tempo / 2);
            // k29
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo / 2);
            sleep(tempo / 4);
            play(new int[]{KeyEvent.VK_N, KeyEvent.VK_S}, tempo / 4);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo / 2);
            play(new int[]{KeyEvent.VK_A, KeyEvent.VK_F}, tempo / 2);
            sleep(tempo / 4);
            play(new int[]{KeyEvent.VK_M, KeyEvent.VK_D}, tempo / 4);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_N, KeyEvent.VK_S}, tempo / 2);
            // k30 
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_E}, tempo / 2);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_E}, tempo / 2);
            play(new int[]{KeyEvent.VK_G, KeyEvent.VK_T}, tempo / 2);
            play(new int[]{KeyEvent.VK_G, KeyEvent.VK_T}, tempo / 2);
            play(new int[]{KeyEvent.VK_F, KeyEvent.VK_R}, tempo / 2);
            play(new int[]{KeyEvent.VK_F, KeyEvent.VK_R}, tempo / 2);
            play(new int[]{KeyEvent.VK_F, KeyEvent.VK_R}, tempo / 2);
            play(new int[]{KeyEvent.VK_F, KeyEvent.VK_R}, tempo / 2);
            // k31
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_J, KeyEvent.VK_E}, tempo / 2);
            sleep(tempo / 4);
            play(new int[]{KeyEvent.VK_S, KeyEvent.VK_H, KeyEvent.VK_W}, tempo / 4);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_J, KeyEvent.VK_E}, tempo / 2);
            play(new int[]{KeyEvent.VK_F, KeyEvent.VK_Q, KeyEvent.VK_R}, tempo / 2);
            sleep(tempo / 4);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_J, KeyEvent.VK_E}, tempo / 4);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_S, KeyEvent.VK_H, KeyEvent.VK_W}, tempo / 2);
            // k32
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_J, KeyEvent.VK_E}, tempo / 2);
            sleep(tempo / 4);
            play(new int[]{KeyEvent.VK_S, KeyEvent.VK_H, KeyEvent.VK_W}, tempo / 4);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_J, KeyEvent.VK_E}, tempo / 2);
            play(new int[]{KeyEvent.VK_F, KeyEvent.VK_Q, KeyEvent.VK_R}, tempo / 2);
            sleep(tempo / 4);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_J, KeyEvent.VK_E}, tempo / 4);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_S, KeyEvent.VK_H, KeyEvent.VK_W}, tempo / 2);
            // k33
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_J, KeyEvent.VK_E}, tempo / 2);
            sleep(tempo / 4);
            play(new int[]{KeyEvent.VK_S, KeyEvent.VK_H, KeyEvent.VK_W}, tempo / 4);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_J, KeyEvent.VK_E}, tempo / 2);
            play(new int[]{KeyEvent.VK_F, KeyEvent.VK_Q, KeyEvent.VK_R}, tempo / 2);
            sleep(tempo / 4);
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_J, KeyEvent.VK_E}, tempo / 4);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_S, KeyEvent.VK_H, KeyEvent.VK_W}, tempo / 2);
            // k34
            play(new int[]{KeyEvent.VK_D, KeyEvent.VK_J, KeyEvent.VK_E}, tempo);
            sleep(tempo);
            play(new int[]{KeyEvent.VK_J, KeyEvent.VK_E}, tempo);
            play(new int[]{KeyEvent.VK_J, KeyEvent.VK_E, KeyEvent.VK_U}, tempo);
            // k35
            play(new int[]{KeyEvent.VK_E, KeyEvent.VK_T, KeyEvent.VK_U}, tempo);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_U}, tempo / 4);
            play(new int[]{KeyEvent.VK_U}, tempo / 4);
            play(new int[]{KeyEvent.VK_E, KeyEvent.VK_U}, tempo);
            sleep(tempo / 2);
            play(new int[]{KeyEvent.VK_U}, tempo / 2);
            // k36
            play(new int[]{KeyEvent.VK_Q, KeyEvent.VK_E, KeyEvent.VK_Y}, tempo);
            play(new int[]{KeyEvent.VK_T}, tempo / 2);
            play(new int[]{KeyEvent.VK_T}, tempo / 2);
            play(new int[]{KeyEvent.VK_Q, KeyEvent.VK_E}, tempo);
            sleep(tempo);
            // k37
            play(new int[]{KeyEvent.VK_F, KeyEvent.VK_H, KeyEvent.VK_E}, tempo);
            play(new int[]{KeyEvent.VK_G, KeyEvent.VK_T}, tempo / 2);
            play(new int[]{KeyEvent.VK_Q, KeyEvent.VK_U}, tempo / 2);
            play(new int[]{KeyEvent.VK_J, KeyEvent.VK_U}, tempo / 2);
            play(new int[]{KeyEvent.VK_G, KeyEvent.VK_T}, tempo / 2);
            play(new int[]{KeyEvent.VK_G, KeyEvent.VK_T}, tempo / 2);
            play(new int[]{KeyEvent.VK_H, KeyEvent.VK_Y}, tempo / 2);
            // k38
            play(new int[]{KeyEvent.VK_G, KeyEvent.VK_J, KeyEvent.VK_W, KeyEvent.VK_T}, tempo);
            /*
            play(new int[]{KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo / 2);
            play(new int[]{KeyEvent.VK_W}, tempo / 2);*/
        } catch (AWTException | InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void play(int key[], int length) throws InterruptedException {
        length = length + generator.nextInt(21) - 10;
        for (int i = 0; i < key.length; ++i) {
            robot.keyPress(key[i]);
        }
        Thread.sleep((length / 4) * 3);
        for (int i = 0; i < key.length; ++i) {
            robot.keyRelease(key[i]);
        }
        Thread.sleep(length / 4);
    }
    
    private static void sleep(int length) throws InterruptedException {
        length = length + generator.nextInt(21) - 10;
        Thread.sleep(length);
    }
}
