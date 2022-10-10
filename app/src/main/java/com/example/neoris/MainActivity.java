package com.example.neoris;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton boton1 = (ImageButton) findViewById(R.id.imagebutton);

        boton1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast notification;
                notification = Toast.makeText(MainActivity.this, "Marcelo Viera", Toast.LENGTH_SHORT);
                notification.show();
            }

        });

        ImageButton boton2 = (ImageButton) findViewById(R.id.imagebutton2);

        boton2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast notification;
                notification = Toast.makeText(MainActivity.this, "Miguel Borja", Toast.LENGTH_SHORT);
                notification.show();
            }

        });

        ImageButton boton3= (ImageButton) findViewById(R.id.imagebutton3);

        boton3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast notification;
                notification = Toast.makeText(MainActivity.this, "David Ospinaa", Toast.LENGTH_SHORT);
                notification.show();
            }

        });

        ImageButton boton4 = (ImageButton) findViewById(R.id.imagebutton4);

        boton4.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast notification;
                notification = Toast.makeText(MainActivity.this, "Luis Diaz", Toast.LENGTH_SHORT);
                notification.show();
            }

        });



    }

    @Override
    public void onClick(View v) {

    }
}







