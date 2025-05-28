package com.example.myhomework04

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set up the Toolbar as App Bar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        // Button references
        val btnToast = findViewById<Button>(R.id.btnToast)
        val btnSnackbar = findViewById<Button>(R.id.btnSnackbar)
        val btnAlertDialog = findViewById<Button>(R.id.btnAlertDialog)
        val btnBottomSheet = findViewById<Button>(R.id.btnBottomSheet)

        // Show Toast
        btnToast.setOnClickListener {
            Toast.makeText(this, "This is a Toast message", Toast.LENGTH_SHORT).show()
        }

        // Show Snackbar
        btnSnackbar.setOnClickListener { view ->
            Snackbar.make(view, "This is a Snackbar", Snackbar.LENGTH_LONG)
                .setAction("Undo") {
                    Toast.makeText(this, "Undo clicked", Toast.LENGTH_SHORT).show()
                }.show()
        }

        // Show Alert Dialog
        btnAlertDialog.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Alert")
                .setMessage("Are you sure you want to continue?")
                .setPositiveButton("Yes") { dialog, _ ->
                    Toast.makeText(this, "Continuing...", Toast.LENGTH_SHORT).show()
                    dialog.dismiss()
                }
                .setNegativeButton("No") { dialog, _ ->
                    dialog.dismiss()
                }
                .show()
        }

        // Show Bottom Sheet Dialog
        btnBottomSheet.setOnClickListener {
            val bottomSheetDialog = BottomSheetDialog(this)
            val sheetView: View = LayoutInflater.from(this)
                .inflate(R.layout.bottom_sheet_layout, null)

            val btnClose = sheetView.findViewById<Button>(R.id.btnClose)
            btnClose.setOnClickListener {
                bottomSheetDialog.dismiss()
            }

            bottomSheetDialog.setContentView(sheetView)
            bottomSheetDialog.show()
        }
    }
}
