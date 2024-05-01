package com.example.application1;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button dialog_button;
     TextView okay, cancel;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);
          dialog_button = (Button) findViewById(R.id.button);
          Dialog dialog = new Dialog(MainActivity.this);
          dialog_button.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                    dialog.setContentView(R.layout.custom_dialog);
                    dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,
                              ViewGroup.LayoutParams.WRAP_CONTENT);
                    dialog.setCancelable(false);
                    okay = dialog.findViewById(R.id.okay_text);
                    cancel = dialog.findViewById(R.id.cancel_text);
                    okay.setOnClickListener(new View.OnClickListener() {
                         @Override
                         public void onClick(View v) {
                              dialog.dismiss();
                              Toast.makeText(MainActivity.this, "okay clicked",
                                        Toast.LENGTH_SHORT).show();
                         }
                    });
                    cancel.setOnClickListener(new View.OnClickListener() {
                         @Override
                         public void onClick(View v) {
                              dialog.dismiss();
                              Toast.makeText(MainActivity.this, "Cancel clicked",
                                        Toast.LENGTH_SHORT).show();
                         }
                    });
                    dialog.show();
               }
          });
     }
}