package com.example.rakeshkumar.myapplication.models;

public class NoteItem {
    private int noteId;
    private String noteDescription;

    public String getNoteDescription() {
        return noteDescription;
    }

    public void setNoteDescription(String noteDescription) {
        this.noteDescription = noteDescription;
    }

    public NoteItem(String noteDescription) {
        this.noteDescription = noteDescription;
    }

}
