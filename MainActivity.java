package com.packagename;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    AdView mAdView;

    DatabaseReference mydte,tdraw,allbrd,brda,brdb,brdc,threed,fourd,cnt3,cnt2,cnt1,news1,news2;

    TextView dte,drw,allb,brd_a,brd_b,brd_c,three,four,cnt_three,cnt_two,cnt_one,news_1,news_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        dte = (TextView)findViewById(R.id.date);
        drw = (TextView)findViewById(R.id.draw);
        allb = (TextView)findViewById(R.id.all_board);
        brd_a = (TextView)findViewById(R.id.board_a);
        brd_b = (TextView)findViewById(R.id.board_b);
        brd_c = (TextView)findViewById(R.id.board_c);
        three = (TextView)findViewById(R.id.three_digit);
        four = (TextView)findViewById(R.id.four_digit);

        cnt_one = (TextView)findViewById(R.id.cnt1);
        cnt_two = (TextView)findViewById(R.id.cnt2);
        cnt_three = (TextView)findViewById(R.id.cnt3);

        news_1 = (TextView)findViewById(R.id.news);
        news_2 = (TextView)findViewById(R.id.news1);

        cnt1 = FirebaseDatabase.getInstance().getReference().child("main").child("content1");
        cnt2 = FirebaseDatabase.getInstance().getReference().child("main").child("content2");
        cnt3 = FirebaseDatabase.getInstance().getReference().child("main").child("content3");

        mydte = FirebaseDatabase.getInstance().getReference().child("result").child("date");
        tdraw = FirebaseDatabase.getInstance().getReference().child("result").child("draw");
        allbrd = FirebaseDatabase.getInstance().getReference().child("result").child("all_board");
        brda = FirebaseDatabase.getInstance().getReference().child("result").child("a");
        brdb = FirebaseDatabase.getInstance().getReference().child("result").child("b");
        brdc = FirebaseDatabase.getInstance().getReference().child("result").child("c");
        threed = FirebaseDatabase.getInstance().getReference().child("result").child("three_digit");
        fourd = FirebaseDatabase.getInstance().getReference().child("result").child("four_digit");

        news1 = FirebaseDatabase.getInstance().getReference().child("main").child("news");
        news2 = FirebaseDatabase.getInstance().getReference().child("main").child("news1");

        news1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                news_1.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        news2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                news_2.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        mydte.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                dte.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        tdraw.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                drw.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        allbrd.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                allb.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        brda.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                brd_a.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        brdb.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                brd_b.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        brdc.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                brd_c.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        threed.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                three.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        fourd.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                four.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        cnt1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                cnt_one.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        cnt2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                cnt_two.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        cnt3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                cnt_three.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
