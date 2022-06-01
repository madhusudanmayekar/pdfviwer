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

import com.google.firebase.database.DatabaseReference;
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
                        " Sample 1\n",
                        60000,
                        R.drawable.book,
                        "https://firebasestorage.googleapis.com/v0/b/pdf-reader-bae37.appspot.com/o/sample.pdf?alt=media&token=ab5fd1ae-dcd8-47dd-a02d-93a0313e1579"

                ));

        productList.add(
                new Product(
                        1,
                        " Sample 2\n",

                        60000,
                        R.drawable.book,
                        "https://firebasestorage.googleapis.com/v0/b/pdf-reader-bae37.appspot.com/o/file-sample_150kB.pdf?alt=media&token=1bf4fbbf-0639-42de-8610-854a77f2d7ee"

                ));
        productList.add(
                new Product(
                        1,
                        "Sample 3",


                        60000,
                        R.drawable.book,
                        "https://firebasestorage.googleapis.com/v0/b/pdf-reader-bae37.appspot.com/o/MSD%20_%20UNIT%20-III%20_%20MCQ-merged.pdf?alt=media&token=06778e1b-1721-4e3a-9091-167fef679706"
                ));

        productList.add(
                new Product(
                        1,
                        "Sample 4",


                        60000,
                        R.drawable.book,
                        "https://firebasestorage.googleapis.com/v0/b/pdf-reader-bae37.appspot.com/o/Get_Started_With_Smallpdf.pdf?alt=media&token=34312161-dfbb-4ee6-a000-0f45b24cbf26"
                ));

        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }

}
