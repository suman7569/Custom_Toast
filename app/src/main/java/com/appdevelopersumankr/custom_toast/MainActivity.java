package com.appdevelopersumankr.custom_toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;

import com.muddzdev.styleabletoast.StyleableToast;

public class MainActivity extends AppCompatActivity {
    AppCompatButton toastbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        toastbutton=findViewById ( R.id.buttonid);
        toastbutton.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                showtoast ();
            }
        } );
    }



    public void showtoast(){
        StyleableToast.makeText ( this,"suman Toast text ",R.style.exampletoast).show ();

    }
    //step 1---------implementation 'com.muddzdev:styleabletoast:2.3.0'
    //STEP   2----------------
    //VALUES--->THEMES
//          <style name="exampletoast">
//        <item name="stTextBold">true</item>
//        <item name="stTextColor">#FF03DAC5</item>
//        <item name="stStrokeWidth">3dp</item>
//        <item name="stStrokeColor">#FF3700B3</item>
//        <item name="stTextSize">18sp</item>
//        <item name="stColorBackground">#DDD9E4</item>
//        <item name="stRadius">5dp</item>
//        <item name="stLength">LONG</item>
//        <item name="stSolidBackground">true</item>
//    </style>
}