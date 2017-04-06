package com.example.shinji.doublecanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by shinji on 2017/04/06.
 */

public class FirstView extends View{

	Paint paint;

	public FirstView(Context context) {

		super(context);
		paint = new Paint();
	}

	@Override
	protected void onDraw(Canvas canvas) {
Log.w( "DEBUG_DATA", "onDraw1" );
		// 背景、半透明
		canvas.drawColor(Color.argb(125, 0, 0, 255));

		// 円
		paint.setColor(Color.argb(255, 68, 125, 255));
		paint.setStrokeWidth(30);
		paint.setAntiAlias(true);
		paint.setStyle(Paint.Style.STROKE);
		// (x1,y1,r,paint) 中心x1座標, 中心y1座標, r半径
		canvas.drawCircle(450, 450, 100, paint);

		// 矩形
		paint.setColor(Color.argb(255, 255, 0, 255));
		paint.setStrokeWidth(10);
		paint.setStyle(Paint.Style.STROKE);
		// (x1,y1,x2,y2,paint) 左上の座標(x1,y1), 右下の座標(x2,y2)
		canvas.drawRect(480, 480, 850, 880, paint);

		// 線
		paint.setStrokeWidth(15);
		paint.setColor(Color.argb(255, 0, 255, 120));
		// (x1,y1,x2,y2,paint) 始点の座標(x1,y1), 終点の座標(x2,y2)
		canvas.drawLine(350, 850, 750, 630, paint);

		Log.d("aaa", "reload");

	}

	public boolean onTouchEvent(MotionEvent e){
		Log.d("aaa", "bbb");


		return true;
	}

	public void reloaddd(){
        invalidate();
	}
}