package com.example.tp2ex2;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*
        Toast.makeText(this, "message à afficher", Toast.LENGTH_SHORT).show();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Voulez-vous continuer?")
                .setTitle("Bienvenue")
                .setIcon(R.drawable.ic_launcher_background)
                .setPositiveButton("OUI", null)
                .setNegativeButton("NON", null);

        AlertDialog alert = builder.create();
        alert.show();


        Log.i("Debug", "Mon premier commentaire");
*/

        TextView tv = new TextView(this);
        tv.setText("Hello, Android");
        setContentView(tv);


        Toast helloToast = Toast.makeText(MainActivity.this, "onCreate appelé", Toast.LENGTH_SHORT);
        helloToast.setGravity(Gravity.CENTER, 0, 0);
        helloToast.show();


        Log.d("CycleDeVie", "onCreate appelé");



    }

    @Override
    protected void onStart() {
        super.onStart();


        Toast helloToast = Toast.makeText(this, "onStart appelé", Toast.LENGTH_SHORT);
        helloToast.setGravity(Gravity.CENTER, 0, 0);
        helloToast.show();


        Log.d("CycleDeVie", "onStart appelé");
    }

    @Override
    protected void onResume() {
        super.onResume();


        Toast helloToast = Toast.makeText(this, "onResume appelé", Toast.LENGTH_SHORT);
        helloToast.setGravity(Gravity.CENTER, 0, 0);
        helloToast.show();


        Log.d("CycleDeVie", "onResume appelé");
    }

    @Override
    protected void onPause() {
        super.onPause();


        Toast helloToast = Toast.makeText(this, "onPause appelé", Toast.LENGTH_SHORT);
        helloToast.setGravity(Gravity.CENTER, 0, 0);
        helloToast.show();


        Log.d("CycleDeVie", "onPause appelé");
    }

    @Override
    protected void onStop() {
        super.onStop();


        Toast helloToast = Toast.makeText(this, "onStop appelé", Toast.LENGTH_SHORT);
        helloToast.setGravity(Gravity.CENTER, 0, 0);
        helloToast.show();


        Log.d("CycleDeVie", "onStop appelé");
    }

    @Override
    protected void onRestart() {
        super.onRestart();


        Toast helloToast = Toast.makeText(this, "onRestart appelé", Toast.LENGTH_SHORT);
        helloToast.setGravity(Gravity.CENTER, 0, 0);
        helloToast.show();


        Log.d("CycleDeVie", "onRestart appelé");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();


        Toast helloToast = Toast.makeText(this, "onDestroy appelé", Toast.LENGTH_SHORT);
        helloToast.setGravity(Gravity.CENTER, 0, 0);
        helloToast.show();


        Log.d("CycleDeVie", "onDestroy appelé");
    }
}