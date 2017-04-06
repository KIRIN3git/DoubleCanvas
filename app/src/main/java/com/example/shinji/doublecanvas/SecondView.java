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

public class SecondView extends View{

	Paint paint;

	public SecondView(Context context) {

		super(context);
		paint = new Paint();
	}

	@Override
	protected void onDraw(Canvas canvas) {
		Log.w( "DEBUG_DATA", "onDraw2" );
		// 背景、半透明
		canvas.drawColor(Color.argb(125, 0, 0, 255));

		// 円
		paint.setColor(Color.argb(255, 68, 125, 255));
		paint.setStrokeWidth(30);
		paint.setAntiAlias(true);
		paint.setStyle(Paint.Style.STROKE);
		// (x1,y1,r,paint) 中心x1座標, 中心y1座標, r半径
		canvas.drawCircle(250, 250, 100, paint);


	}

	public boolean onTouchEvent(MotionEvent e){
		Log.d("ccc", "eee");

		return true;
	}
}