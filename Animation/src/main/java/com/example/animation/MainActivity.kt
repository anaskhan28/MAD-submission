package com.example.animation

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


}
    public void rotate(View view)
    {
        TextView txt=(TextView)  findViewById(R.id.animtxt);
        txt.animate().rotationBy(45).setDuration(2000);
    }
    public void translate(View view)
    {
        TextView txt=(TextView)  findViewById(R.id.animtxt);
        txt.animate().translationXBy(50).setDuration(20);
    }
    public void scale(View view)
    {
        TextView txt=(TextView)  findViewById(R.id.animtxt);
        txt.animate().scaleX(2).setDuration(20);
    }
    public void disapp(View view)
    {
        TextView txt=(TextView)  findViewById(R.id.animtxt);
        txt.animate().alpha(0).setDuration(1000);
    }
}