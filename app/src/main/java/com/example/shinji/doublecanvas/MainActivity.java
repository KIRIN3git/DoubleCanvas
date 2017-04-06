package com.example.shinji.doublecanvas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	private TextView label;
	private FirstView firstView;
	private SecondView secondView;
	static FirstView fv;
	static SecondView sv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		label = (TextView) this.findViewById(R.id.label);
		label.setText("abcd123456789cdefg\n" + "1234567893456978\n" +
				"hijklmnopq012698745rst4565848uvwxlmnopq\n" +
				"\n\n\n012698745rst4565848\nuvwx");

//		firstView = (FirstView) this.findViewById(R.id.first_view);
//      testView2 = (TestView) this.findViewById(R.id.test_view2);

		// レイアウトのIDを取得
		FrameLayout myFrameLayout = (FrameLayout)findViewById(R.id.myFrameLayout);

		// Viewクラスをインスタンス化
		fv = new FirstView(this);
		sv = new SecondView(this);

		// レイアウトに追加
		myFrameLayout.addView(fv);
		myFrameLayout.addView(sv);
	}

	// Viewを再読み込み関数
	public static void handan(){
		Log.w( "DEBUG_DATA", "aaaaaaaaa" );

		fv.invalidate();
	}
}