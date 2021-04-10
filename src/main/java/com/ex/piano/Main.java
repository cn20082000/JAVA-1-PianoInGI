 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ex.piano;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cn200
 */
public class Main {
    private static String song;
    private static int tempo;
    private static Robot robot;
    private static Random generator;
    private static List<Note> sheet = new ArrayList<>();
    
    public static void main(String args[]) {
        init();
        
        generator = new Random(System.currentTimeMillis());
        
        try {
            robot = new Robot();
        } catch (AWTException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            read();
            System.out.println("Doc file thanh cong!");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            int sec = 5;
            System.out.println("Bat dau choi nhac trong " + sec + " giay nua...");
            Thread.sleep(sec * 1000);
            play();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Hoan thanh choi nhac!");
    }
    
    private static void init() {
        tempo = 500;
//        song = "OneRoomSugarLife";
        song = "AuldLangSyne";
    }
    
    private static void read() throws FileNotFoundException {
        Scanner sc = new Scanner(new File(System.getProperty("user.dir")
                + "//src//main//java//com//ex/piano//src//" + song + ".txt"));
        int header = 0;
        while (header != Note.END_SHEET) {
            Note note = new Note();
            // Doc header
            header = sc.nextInt();

            // Doc note
            switch (header) {
                case Note.END_SHEET:
                case Note.COMMENT_SHEET: {
                    continue;
                }
                case Note.SLEEP_NOTE: {
                    note.setKey(new int[]{});
                    break;
                }
                default: {
                    int key[] = new int[header];
                    for (int i = 0; i < header; ++i) {
                        int k = sc.next().charAt(0);
                        if (k > 96) {
                            k -= 32;
                        }
                        key[i] = k;
                    }   note.setKey(key);
                    break;
                }
            }

            // Doc length
            int len = sc.nextInt();
            int length = (int) (tempo / Math.pow(2, len));
            len = sc.nextInt();
            if (len > 0) {
                length = (int) (length * 3 / 2);
            }
            note.setLength(length);

            sheet.add(note);
        }
    }
    
    private static void play() throws InterruptedException {
        for (Note i : sheet) {
            play(i.getKey(), i.getLength());
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
}
