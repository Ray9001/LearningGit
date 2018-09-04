package com.example.rakeshkumar.myapplication;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.DialogInterface;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import com.example.rakeshkumar.myapplication.adapters.NotesItemAdapter;
import com.example.rakeshkumar.myapplication.databinding.User;
import com.example.rakeshkumar.myapplication.databinding.UserDataBindingActivityBinding;
import com.example.rakeshkumar.myapplication.models.NoteItem;
import com.example.rakeshkumar.myapplication.viewsmodels.NoteViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private NoteViewModel noteViewModel;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private NotesItemAdapter notesItemAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);


        UserDataBindingActivityBinding userDataBindingActivityBinding = DataBindingUtil.setContentView(this , R.layout.user_data_binding_activity);
        User user = new User(170 , "Ram" , "Singh" , "22222" , "Radhe Radhe");
        userDataBindingActivityBinding.setUser(user);



//        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
//        recyclerView.setHasFixedSize(true);
//        layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
//        noteViewModel = ViewModelProviders.of(this).get(NoteViewModel.class);
//        notesItemAdapter = new NotesItemAdapter(noteViewModel.getNotesItemsList());
//        noteViewModel.getNotesItemListData().observe(this, new Observer<List<NoteItem>>() {
//            @Override
//            public void onChanged(@Nullable List<NoteItem> noteItems) {
//                notesItemAdapter.updateNotesItemListData(noteItems);
//                recyclerView.setAdapter(notesItemAdapter);
//            }
//        });
//
//        LayoutInflater layoutInflaterAndroid = LayoutInflater.from(this);
//        View mView = layoutInflaterAndroid.inflate(R.layout.user_input_dialog_box, null);
//        AlertDialog.Builder alertDialogBuilderUserInput = new AlertDialog.Builder(this);
//        alertDialogBuilderUserInput.setView(mView);
//
//        final EditText userInputDialogEditText = (EditText) mView.findViewById(R.id.userInputDialog);
//        alertDialogBuilderUserInput
//                .setCancelable(false)
//                .setPositiveButton("Send", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialogBox, int id) {
//                        noteViewModel.saveNewNote(userInputDialogEditText.getText().toString());
//                    }
//                })
//
//                .setNegativeButton("Cancel",
//                        new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialogBox, int id) {
//                                dialogBox.cancel();
//                            }
//                        });
//
//        AlertDialog alertDialogAndroid = alertDialogBuilderUserInput.create();
//        alertDialogAndroid.show();
    }
}
