package com.company.homework6;

public class Main {

    public static void main(String[] args) {
        String[] texts = new String[5];
        String[] annotations = new String[5];

        texts[0] = "Lowest";
        texts[1] = "Lower";
        texts[2] = "Middle";
        texts[3] = "Higher";
        texts[4] = "Highest";

        annotations[0] = "First annotation";
        annotations[1] = "Second annotation";
        annotations[2] = "Third annotation";
        annotations[3] = "Fourth annotation";
        annotations[4] = "Fifth annotation";

        Notepad notepad = new Notepad(texts,annotations);

        new ConsoleApp(notepad).run();
    }
}
