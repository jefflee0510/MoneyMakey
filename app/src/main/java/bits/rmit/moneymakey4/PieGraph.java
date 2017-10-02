package bits.rmit.moneymakey4;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class PieGraph extends View {
    private Paint piePaint;
    private RectF rectF;
    private float[] data;

    public PieGraph(Context context, AttributeSet attrs){
        super(context,attrs);
        piePaint = new Paint();
        piePaint.setAntiAlias(true);
        piePaint.setDither(true);
        piePaint.setStyle(Paint.Style.FILL);
    }
    public void setData(float[] data){
        this.data = data;
        invalidate();
    }


}
