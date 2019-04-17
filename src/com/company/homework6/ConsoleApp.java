package com.company.homework6;

public class ConsoleApp {
    private Notepad notepad;

    public ConsoleApp(Notepad notepad) {
        this.notepad = notepad;
    }

    public void run(){
        System.out.println("Showing Notepad test");
        System.out.println(notepad);
    }

}
