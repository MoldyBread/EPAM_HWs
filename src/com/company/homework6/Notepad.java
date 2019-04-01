package com.company.homework6;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

public class Notepad {
    private Date date;
    private List<Note> notes = new List<Note>() {
        private Note[] notesArray = new Note[0];
        //TODO: implement other (useless) methods

        @Override
        public int size() {
            return notesArray.length;
        }

        @Override
        public boolean isEmpty() {
            return notesArray.length==0;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Note> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Note note) {
            Note[] tmp= notesArray;
            notesArray = new Note[tmp.length+1];
            System.arraycopy(tmp, 0, notesArray, 0, tmp.length);
            notesArray[notesArray.length-1]=note;

            return tmp.length<notesArray.length;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Note> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Note> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Note get(int index) {
            return notesArray[index];
        }

        @Override
        public Note set(int index, Note element) {
            return null;
        }

        @Override
        public void add(int index, Note element) {

        }

        @Override
        public Note remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Note> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Note> listIterator(int index) {
            return null;
        }

        @Override
        public List<Note> subList(int fromIndex, int toIndex) {
            return null;
        }
    };

    public Notepad(String[] texts, String[] annotations,Date date) {
        this.date = date;
        addAllNotes(texts,annotations);
    }

    public Notepad(String[] texts, String[] annotations){
        date = new Date();
        addAllNotes(texts,annotations);
    }

    private void addAllNotes(String[] texts, String[] annotations){
        if(texts.length!=annotations.length){
            throw new ArrayIndexOutOfBoundsException("texts and annotations length can`t be not same!");
        }
        for (int i = 0; i < texts.length; i++) {
            notes.add(new Note(texts[i],annotations[i]));
        }
    }

    class Note{
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

        public String getAnnotation() {
            return annotation;
        }

        public void setAnnotation(String annotation) {
            this.annotation = annotation;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text+" - "+annotation;
        }
    }

    @Override
    public String toString() {
        String result = date.toString()+"\n";
        for (int i = 0; i < notes.size(); i++) {
            result+=notes.get(i)+(i!=notes.size()-1?"\n":"");
        }
        return result;
    }
}
