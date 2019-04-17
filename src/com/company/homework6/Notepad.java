package com.company.homework6;

import java.util.Arrays;
import java.util.Date;

public class Notepad {
    private Note[] notes;
    private Date date;

    public Notepad(String[] texts, String[] annotations, Date date) {
        this.date = date;
        addAllNotes(texts,annotations);
    }

    public Notepad(String[] texts, String[] annotations) {
        date = new Date();
        addAllNotes(texts,annotations);
    }


    private void addAllNotes(String[] texts, String[] annotations){
        if(texts.length!=annotations.length){
            throw  new ArrayIndexOutOfBoundsException("texts and annotations length must be the same!");
        }

        notes = new Note[texts.length];
        for (int i = 0; i < texts.length; i++) {
            notes[i]=new Note(texts[i],annotations[i]);
        }
    }

    @Override
    public String toString() {
        String result = date.toString()+"\n";
        for (int i = 0; i < notes.length; i++) {
            result+=notes[i]+(i!=notes.length-1?"\n":"");
        }

        return result;
    }

    private class Note {
        private String text;
        private String annotation;

        public Note(String text, String annotation) {
            this.text = text;
            this.annotation = annotation;
        }

        public Note(String text) {
            this.text = text;
            annotation="";
        }

        @Override
        public String toString() {
            return text+(annotation.length()>0?" - ":"")+annotation;
        }
    }
}
