package com.example.shinji.doublecanvas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	private TextView label;
	private FirstView firstView;
	private SecondView secondView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		label = (TextView) this.findViewById(R.id.label);
		label.setText("abcd123456789cdefg\n" + "1234567893456978\n" +
				"hijklmnopq012698745rst4565848uvwxlmnopq\n" +
				"\n\n\n012698745rst4565848\nuvwx");

//		firstView = (FirstView) this.findViewById(R.id.first_view);
//        testView2 = (TestView) this.findViewById(R.id.test_view2);


		FirstView fv = new FirstView(this);
		fv.invalidate();

		SecondView sv = new SecondView(this);
		sv.invalidate();
	}
}