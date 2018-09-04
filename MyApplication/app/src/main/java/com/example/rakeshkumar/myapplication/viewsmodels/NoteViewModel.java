package com.example.rakeshkumar.myapplication.viewsmodels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MediatorLiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.os.Handler;

import com.example.rakeshkumar.myapplication.datacontrollers.NoteItemDataController;
import com.example.rakeshkumar.myapplication.models.NoteItem;

import java.util.Collections;
import java.util.List;
import java.util.Random;


public class NoteViewModel extends ViewModel {

    private MutableLiveData<List<NoteItem>> notesItemListData = new MutableLiveData<>();
    private NoteItemDataController noteItemDataController;

    public LiveData<List<NoteItem>> getNotesItemListData() {
        return notesItemListData;
    }

    public List<NoteItem> getNotesItemsList() {
        List<NoteItem>  noteItemArrayList = noteItemDataController.createDummyNotes();
        long seed = System.nanoTime();
        Collections.shuffle(noteItemArrayList, new Random(seed));
        notesItemListData.setValue(noteItemArrayList);
        return noteItemArrayList;
    }


    @Override
    protected void onCleared() {
        super.onCleared();
    }

    public void saveNewNote(String s) {
        NoteItem noteItem = new NoteItem(s);
        notesItemListData.getValue().add(noteItem);
    }
}
