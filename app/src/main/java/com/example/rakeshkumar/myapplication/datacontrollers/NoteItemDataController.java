package com.example.rakeshkumar.myapplication.datacontrollers;

import android.os.Handler;

import com.example.rakeshkumar.myapplication.models.NoteItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class NoteItemDataController {

    public NoteItemDataController() {

    }

    public List<NoteItem> createDummyNotes() {
        // do async operation to fetch users
        Handler myHandler = new Handler();
        List<NoteItem> noteItemArrayList = new ArrayList<>();
        int i = 0;
        while ( i < 5) {
            NoteItem noteItem = new NoteItem("Rakesh Kumar");
            noteItemArrayList.add(noteItem);
            i++;
        }

        return  noteItemArrayList;

    }

}



