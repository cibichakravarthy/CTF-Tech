package com.chakravarthy.cibi.ctf;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Random;
//import static java.util.Calendar.getInstance;

public class MainActivity extends AppCompatActivity {

    public int randomgen(int k)
    {
        Calendar ne = Calendar.getInstance();
        int rand=ne.get(Calendar.SECOND);
        rand%=k;
        rand+=3;
        //return rand;
        rand+=7*ne.get(Calendar.HOUR_OF_DAY);
        rand+=2*ne.get(Calendar.MINUTE);
        rand+=3*ne.get(Calendar.DAY_OF_MONTH);
        rand+=4*ne.get(Calendar.MONTH);
        rand+=5*ne.get(Calendar.YEAR);
        rand%=k;
        return rand;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout rel = (RelativeLayout)findViewById(R.id.activity_main);
        TextView txt = (TextView)findViewById(R.id.rntext);
        String[] mot = {"nothing is impossible","popularity is immortality","smile to succeed","all is well","Be the best version of you","I am a champion","have no fear","passionate hardwork"};
        int rand = randomgen(8);
        int[] images = {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7,R.drawable.img8};
        rel.setBackgroundResource(images[rand]);
        txt.setText(mot[rand]+ "");
    }

    public void randomi(View view) {
        Calendar ne = Calendar.getInstance();
        RelativeLayout rel = (RelativeLayout)findViewById(R.id.activity_main);
        TextView txt = (TextView)findViewById(R.id.rntext);
        String[] mot = {"nothing is impossible","popularity is immortality","smile to succeed","all is well","Be the best version of you","I am a champion","have no fear","passion and hardwork are the pillars of success","Perseverance is the key to success","Failures are stepping stones to success","Winners do things different","what you think is what you are","Luck favours hardwork","idle mind is the workshop of devil"};
        int rand = randomgen(14);
        int rand2 = (randomgen(8)+ ne.get(Calendar.MINUTE) + ne.get(Calendar.SECOND)) % 8 ;
        int[] images = {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7,R.drawable.img8};
        rel.setBackgroundResource(images[rand2]);
        txt.setText(mot[rand]+ "");
    }
}
