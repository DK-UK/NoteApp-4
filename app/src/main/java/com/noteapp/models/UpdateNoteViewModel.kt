package com.noteapp.models

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.noteapp.db.DBUtils
import com.noteapp.db.NoteDataBase

class UpdateNoteViewModel(application: Application) : AndroidViewModel(application) {

    private var mNoteDataBase: NoteDataBase = NoteDataBase.getInstance(getApplication())!!

    fun updateNote(noteModel: NoteModel ){
        var dbUtils= DBUtils()
        dbUtils.updateNote(mNoteDataBase,noteModel)
    }
}