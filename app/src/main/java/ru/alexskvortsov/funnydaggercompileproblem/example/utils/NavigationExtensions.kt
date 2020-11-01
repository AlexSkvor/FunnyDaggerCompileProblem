package ru.alexskvortsov.funnydaggercompileproblem.example.utils

import android.app.Activity
import android.content.Intent
import ru.alexskvortsov.funnydaggercompileproblem.example.current.CurrentActivity
import ru.alexskvortsov.funnydaggercompileproblem.example.new.NewActivity
import ru.alexskvortsov.funnydaggercompileproblem.example.old.OldActivity

fun Activity.navigateToCurrentScreen() {
    val intent = Intent(this, CurrentActivity::class.java)
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
    startActivity(intent)
}

fun Activity.navigateToOldScreen() {
    val intent = Intent(this, OldActivity::class.java)
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
    startActivity(intent)
}

fun Activity.navigateToNewScreen() {
    val intent = Intent(this, NewActivity::class.java)
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
    startActivity(intent)
}