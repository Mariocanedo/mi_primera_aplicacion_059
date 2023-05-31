package com.example.mi_primera_aplicacion_059;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1= findViewById(R.id.btn_1);
        TextView textView= findViewById(R.id.txt_1);

        //textView.setText(" HOLA A MI NUEVO PROGRAMA");

         button1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {


                 Toast mytoast = Toast.makeText(getApplicationContext(),"BIENVENIDO ANDROID",Toast.LENGTH_LONG);
                 mytoast.setGravity(Gravity.CENTER_HORIZONTAL,0,67);
                 mytoast.show();
             }
         });

    }


}