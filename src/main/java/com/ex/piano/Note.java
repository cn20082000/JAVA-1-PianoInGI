/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ex.piano;

/**
 *
 * @author cn200
 */
public class Note {
    
    public static final int SLEEP_NOTE = 0;
    public static final int END_SHEET = -1;
    public static final int COMMENT_SHEET = -2;
    
    int key[];
    int length;
    
    public Note(){}
    
    public Note(int key[], int length) {
        this.key = key;
        this.length = length;
    }

    public int[] getKey() {
        return key;
    }

    public int getLength() {
        return length;
    }

    public void setKey(int[] key) {
        this.key = key;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
