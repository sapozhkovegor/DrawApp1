package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.view.View;

import androidx.annotation.RequiresApi;

public class MyView extends View {
    MyView(Context c) {
        super(c);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();
        p.setAntiAlias(true);
        p.setStrokeWidth(10);
        p.setStyle(Paint.Style.FILL);
        p.setColor(Color.parseColor("#FFFF00"));
        canvas.drawCircle(100,150,200,p); //солнце


        p.setColor(Color.parseColor("#FFFF00"));
        canvas.drawLine(100,100,500,50,p); // лучи
        canvas.drawLine(100,100,500,100,p);
        canvas.drawLine(150,150,500,200,p);
        canvas.drawLine(200,200,500,300,p);
        canvas.drawLine(250,250,500,400,p);
        canvas.drawLine(100,250,450,500,p);
        canvas.drawLine(100,300,300,660,p);
        canvas.drawLine(30,300,100,690,p);

        p.setColor(Color.parseColor("#006400"));
        canvas.drawRect(0,1500,3500,3500,p); // трава

        p.setColor(Color.parseColor("#8B4513"));
        canvas.drawRect(100,1000,900,2000,p); //дом

        p.setColor(Color.parseColor("#D2691E"));
        canvas.drawRect(600,1600,800,2000,p); //дверь

        p.setColor(Color.parseColor("#8B4513"));
        canvas.drawRect(1179,1800,1199,2000,p); //ствол

        p.setColor(Color.parseColor("#00FF00"));
        canvas.drawOval(1000,900,1400,1900,p); //дерево

        p.setColor(Color.parseColor("#800000"));
        Path path = new Path();
        path.moveTo(100,1000);
        path.lineTo(530,300);
        path.lineTo(900,1000);
        path.lineTo(100,1000);
        canvas.drawPath(path,p);

        p.setColor(Color.parseColor("#00FFFF"));
        canvas.drawCircle(550,750,90,p);

        p.setColor(Color.parseColor("#000000"));
        canvas.drawLine(500,670,630,700,p);
        canvas.drawLine(470,700,640,730,p);
        canvas.drawLine(460,730,640,760,p);
        canvas.drawLine(458,760,633,790,p);
        canvas.drawLine(465,790,615,820,p);
        canvas.drawLine(488,820,573,840,p);









// rotate_center_x = 200;
//float rotate_center_y = 200;
//float rotate_angle = 45;

//canvas.rotate(-rotate_angle,rotate_center_x,rotate_center_y);



    }

}
