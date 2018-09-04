package com.example.rakeshkumar.myapplication.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rakeshkumar.myapplication.MainActivity;
import com.example.rakeshkumar.myapplication.R;
import com.example.rakeshkumar.myapplication.models.NoteItem;

import java.util.List;

public class NotesItemAdapter extends RecyclerView.Adapter<NotesItemAdapter.MyViewHolder>{

    private List<NoteItem> noteItemList;

    public void updateNotesItemListData(List<NoteItem> noteItems) {
        this.noteItemList = noteItems;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView noteDescriptionTextView;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.noteDescriptionTextView = (TextView) itemView.findViewById(R.id.textViewName);
        }
    }

    public NotesItemAdapter(List<NoteItem> noteItemList) {
        this.noteItemList = noteItemList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);
        //view.setOnClickListener(MainActivity.myOnClickListener);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {
        TextView textViewName = holder.noteDescriptionTextView;
        textViewName.setText(noteItemList.get(listPosition).getNoteDescription());
    }

    @Override
    public int getItemCount() {
        return noteItemList.size();
    }


}
