package pl.javastart;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

	public static final String LOG_TAG = null;

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		Button button = (Button) findViewById(R.id.button1);   
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) 
            { 
            	PaintView.x=1;
            	onCreate(savedInstanceState);
            }
        });
        

		Button button2 = (Button) findViewById(R.id.button2);   
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) 
            { 
            	PaintView.x=0;
            	onCreate(savedInstanceState);
            }
        });
		
}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
