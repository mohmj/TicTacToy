package com.softwareclinics.tictactoy

import android.os.Bundle
import android.view.View
import android.view.View.inflate
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.core.content.res.ComplexColorCompat.inflate
import androidx.fragment.app.DialogFragment
import java.util.zip.Inflater

class FragmentDialogue:DialogFragment(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

         var rootView: View= View.inflate(R.layout.name_dialogue, conext)
         }
    }
}