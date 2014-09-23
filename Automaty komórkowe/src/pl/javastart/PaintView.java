package pl.javastart;
 
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;


public class PaintView extends SurfaceView
{
    Paint paint = new Paint(); 
	public static Canvas canvas;
	rysuj B=new rysuj();
	static int x=0;
	static int y=0;
	static int[] tab;
	
    public PaintView(Context context, AttributeSet attrs) 
    {
        super(context, attrs);
        paint = new Paint();
    }

	public void onDraw(Canvas canvas)
	{
		B.rysujAll(canvas,x,y,tab);
	}


}
