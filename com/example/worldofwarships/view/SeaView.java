package com.example.worldofwarships.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class SeaView extends View {

    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public SeaView(Context context) {
        super(context);
    }

    public SeaView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SeaView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public SeaView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float step = getWidth()/12;
        if(getWidth() > getHeight())
            step = getHeight()/12;
        canvas.save();
        paint.setColor(Color.CYAN);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(step, step, step*10, step*10, paint);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        for(int i = 1; i < 11; i++)
            for(int j = 1; j < 11; j++)
                canvas.drawRect(step*i, step*j, step*(i+1),step*(j+1), paint);
        canvas.restore();
    }
}
