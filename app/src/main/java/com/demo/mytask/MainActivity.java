package com.demo.mytask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       buttonListDetail bill_detail = new buttonListDetail("Half Plate","120");
   //        FirebaseDatabase database = FirebaseDatabase.getInstance();
   //       DatabaseReference databaseReference = database.getReference().child("ItemName").child("btnList");
   //     databaseReference.push().setValue(bill_detail);

        Intent intent=new Intent(this,ListOoFDishes.class);
        startActivity(intent);



    }
}
