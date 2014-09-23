package pl.javastart;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MenuActivity extends Activity {

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		
    final EditText txtName;
    txtName = (EditText) findViewById(R.id.editText1); 
    final CharSequence txtNamee = (CharSequence)txtName.getText();
   
    Button button = (Button) findViewById(R.id.button37);   
    button.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) 
        {    	
        	  CharSequence txt2 ="0";
        	  if(txtNamee.length()!=0)
        	  txt2 =txtNamee;
        	  int liczba = Integer.parseInt(txt2.toString());
        	  
        	  if(liczba>255)
        	  {
        		  Toast.makeText(getBaseContext(), (CharSequence) "Podales za du¿¹ liczbê, ustawiam na regu³ê '0' ", 
                  Toast.LENGTH_LONG).show();
        	
        		  liczba=0;
        	  }
        	  
        	  String bi =Integer.toBinaryString(liczba);
        	  
        	  
        	  int[] tab=new int[8];
        	 
        	  for(int i=0;i<8;i++)
        		  tab[i]=0;
        	
            for(int i=0,j=bi.length()-1 ;i<bi.length(); i++, j--)
        	  {
        		  if(bi.charAt(j)=='1')
        		   tab[i]=1;
        	  }
        	  
        	PaintView.tab=tab;
            Intent startNewActivityOpen = new Intent(MenuActivity.this, MainActivity.class);
        	startActivityForResult(startNewActivityOpen, 0);
          	
        }
    });
}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

}
