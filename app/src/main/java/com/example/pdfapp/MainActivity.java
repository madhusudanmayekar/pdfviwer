package com.example.pdfapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Product> productList;

    //the recyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        relativeLayout.startAnimation(animation);
        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        //initializing the productlist
        productList = new ArrayList<>();



        //adding some items to our list
        productList.add(
                new Product(
                        1,
                        " Axis Bank Opening Procedure\n",
                        60000,
                        R.drawable.unnamed,
                        "https://firebasestorage.googleapis.com/v0/b/pdf-reader-bae37.appspot.com/o/Steps_to_open_Axis_Bank_account.pdf?alt=media&token=246b7f4b-b991-4cc3-8bfe-02365a4a7230"

                ));

        productList.add(
                new Product(
                        1,
                        " icici Bank Opening Procedure \n",

                        60000,
                        R.drawable.unnamed,
                        "https://firebasestorage.googleapis.com/v0/b/pdf-reader-bae37.appspot.com/o/Steps_to_open_ICICI_Bank_account.pdf?alt=media&token=b28b09cd-d25d-47b4-9670-5c976a7a8491"
                ));

        productList.add(
                new Product(
                        1,
                        "Msd Unit 3",


                        60000,
                        R.drawable.unnamed,
                        "https://firebasestorage.googleapis.com/v0/b/pdf-reader-bae37.appspot.com/o/MSD%20_%20UNIT%20-III%20_%20MCQ-merged.pdf?alt=media&token=06778e1b-1721-4e3a-9091-167fef679706"
                ));

        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }

}
