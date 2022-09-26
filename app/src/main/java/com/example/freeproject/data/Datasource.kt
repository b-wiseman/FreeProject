package com.example.freeproject.data


import com.example.freeproject.R
import com.example.freeproject.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.hamburger_foreground),
            Affirmation(R.string.affirmation2, R.drawable.hamburger_foreground),
            Affirmation(R.string.affirmation3, R.drawable.hamburger_foreground),
            Affirmation(R.string.affirmation4, R.drawable.hamburger_foreground),
            Affirmation(R.string.affirmation5, R.drawable.hamburger_foreground),
            Affirmation(R.string.affirmation6, R.drawable.hamburger_foreground),
            Affirmation(R.string.affirmation7, R.drawable.hamburger_foreground),
            Affirmation(R.string.affirmation8, R.drawable.hamburger_foreground),
            Affirmation(R.string.affirmation9, R.drawable.hamburger_foreground),
            Affirmation(R.string.affirmation10, R.drawable.hamburger_foreground)
        )
    }
}