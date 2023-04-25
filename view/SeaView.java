package view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class SeaView extends View {

    private Paint paint;

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
        int step = getWidth()/12;
       // canvas.save();
        paint.setColor(0x80A6FF);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(step, step, getWidth() - step, getWidth() - step, paint);
        paint.setColor(0xFFFFFF);
        paint.setStyle(Paint.Style.STROKE);
        for(int i = 1; i < 11; i++)
            for(int j = 1; j < 11; j++)
                canvas.drawRect(step*i, step*j, step*(i+1),step*(j+1), paint);
      //  canvas.restore();
    }
}
