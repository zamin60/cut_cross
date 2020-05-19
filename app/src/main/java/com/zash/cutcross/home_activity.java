package com.zash.cutcross;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class home_activity extends AppCompatActivity {
    public ImageView b1;
    public ImageView b2;
    public ImageView b3;
    public ImageView b4;
    public ImageView b5;
    public ImageView b6;
    public ImageView b7;
    public ImageView b8;
    public ImageView b9;
    public ImageView arr[]= new ImageView[9];
    public static int shpoint=0;
    public static int arpoint=0;
    public TextView p1;
    public TextView p2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.home);
        b1 = findViewById(R.id.im1);
       b2 = findViewById(R.id.im2);
      b3 = findViewById(R.id.im3);
        b4 = findViewById(R.id.im4);
       b5 = findViewById(R.id.im5);
       b6 = findViewById(R.id.im6);
      b7 = findViewById(R.id.im7);
    b8 = findViewById(R.id.im8);
       p1 =(TextView) findViewById(R.id.shPoint);
       p2 = (TextView) findViewById(R.id.arPoint);
       b9 = findViewById(R.id.im9);
       arr[0]=b1;
        arr[1]=b2;
        arr[2]=b3;
        arr[3]=b4;
        arr[4]=b5;
        arr[5]=b6;
        arr[6]=b7;
        arr[7]=b8;
        arr[8]=b9;
    }
    //--------------------------------------------------------



    boolean change=true;
    public void touch(View view) {
        if(change){
            view.setBackground(ContextCompat.getDrawable(this,R.drawable.shield));
            view.setTag("sh");
            view.setEnabled(false);
            Log.d("cut","player one");
            checkWin(view);


            change=false;
        }else{

            view.setBackground(ContextCompat.getDrawable(this,R.drawable.arrow));
            view.setTag("ar");
            view.setEnabled(false);
            Log.d("cut","player two");
            checkWin(view);
            change=true;
        }
    }
    public void checkWin(View v){
        Log.d("cut","under check win");
         boolean win = false;
        if(b1.getTag()==b2.getTag() && b2.getTag()==b3.getTag()){

            win = true;
        }
        if(b4.getTag()==b5.getTag() && b5.getTag()==b6.getTag()){
            win = true;
        }
        if(b7.getTag()==b8.getTag() && b8.getTag()==b9.getTag()){
            win = true;
        }
        if(b1.getTag()==b4.getTag() && b4.getTag()==b7.getTag()){
            win = true;
        }
        if(b2.getTag()==b5.getTag() && b5.getTag()==b8.getTag()){
            win = true;
        }
        if(b3.getTag()==b6.getTag() && b6.getTag()==b9.getTag()){
            win = true;
        }
        if(b1.getTag()==b5.getTag() && b5.getTag()==b9.getTag()){
            win = true;
        }
        if(b3.getTag()==b5.getTag() && b5.getTag()==b7.getTag()){
            win = true;
        }
        if(win){
            Log.d("cut","winner winner chicken dinner");

            Toast.makeText(this,"player win",Toast.LENGTH_SHORT).show();
               if(v.getTag()=="sh") {
                   shpoint++;
                   p1.setText(String.valueOf(shpoint));

               }
            else {
                   arpoint++;
                   p2.setText(String.valueOf(arpoint));
               }
            for(ImageView i :arr){
               i.setEnabled(false);
            }



        }
   }

    public void reset(View v) {
       // b1.setTag("1");b2.setTag("2");b3.setTag("3");b4.setTag("4");b5.setTag("5");b6.setTag("6");b7.setTag("7");b8.setTag("8");b9.setTag("9");
        int k=0;
        p1.setText("");
        shpoint=0;
        arpoint=0;
        p2.setText("");
        for(ImageView i :arr){
             k++;
              i.setTag(String.valueOf(k));
              i.setBackgroundColor(Color.CYAN);
            i.setEnabled(true);

        }

    }

}