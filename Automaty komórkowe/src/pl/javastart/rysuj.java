package pl.javastart;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class rysuj {
	
public void rysujAll(Canvas canvas,int x,int y,int[] T){
    
    Paint paint = new Paint(); 
	paint.setColor(Color.rgb(0,0,0));
	
int n=54;

int[] tab=new int[n]; 
int[] tab1=new int[n]; 
int[][] tab2=new int[n][n];

    for(int i=0; i<n; i++)
    {
             tab[i]=0;
             tab1[i]=0;
    }
    tab[27]=1;
    
   //ustaw krawedzie na 1 
    if(x==1)
    {
    tab[0]=1;
    tab[1]=1;
    tab[52]=1;
    tab[53]=1;
    }
    
  for(int i=0;i<n;i++)
  tab2[0][i]=tab[i];
  
 
  
for(int j=1;j<n;j++)
{

     for(int i=0;i<n;i++)   
    {
    	 
		if(y==0 && i==(n-2))  //do periodycznosci
		break;
			
			
            if(i==(n-2))
            {        
			if(tab[i-1] == 1 && tab[i] == 1 && tab[i +  1] == 1)
            tab1[i] = T[7];
			if(tab[i-1] == 1 && tab[i] == 1 && tab[i + 1] == 0)
			tab1[i] =T[6];
			if(tab[i-1] == 1 && tab[i] == 0 && tab[i + 1] == 1)
			tab1[i] = T[5];
			if(tab[i-1] == 1 && tab[i] == 0 && tab[i + 1] == 0)
			tab1[i] =T[4];
			if(tab[i-1] == 0 && tab[i] == 1 && tab[i + 1] == 1)
			tab1[i] =T[3];
			if(tab[i-1] == 0 && tab[i] == 1 && tab[i + 1] == 0)
			tab1[i] = T[2];
			if(tab[i-1] == 0 && tab[i] == 0 && tab[i + 1] == 1)
			tab1[i] = T[1];
			if(tab[i-1] == 0 && tab[i] == 0 && tab[i + 1] == 0)
			tab1[i] = T[0];

            continue;
            }
        
		    
            if(i==(n-1))
            {
            if(tab[i-1] == 1 && tab[i] == 1 && tab[0] == 1)
            tab1[i] = T[7];
			if(tab[i-1] == 1 && tab[i] == 1 && tab[0] == 0)
			tab1[i] = T[6];
			if(tab[i-1] == 1 && tab[i] == 0 && tab[0] == 1)
			tab1[i] = T[5];
			if(tab[i-1] == 1 && tab[i] == 0 && tab[0] == 0)
			tab1[i] = T[4];
			if(tab[i-1] == 0 && tab[i] == 1 && tab[0] == 1)
			tab1[i] = T[3];
			if(tab[i-1] == 0 && tab[i] == 1 && tab[0] == 0)
			tab1[i] = T[2];
			if(tab[i-1] == 0 && tab[i] == 0 && tab[0] == 1)
			tab1[i] = T[1];
			if(tab[i-1] == 0 && tab[i] == 0 && tab[0] == 0)
			tab1[i] = T[0];
            
			break;
            }

             
            if(tab[i] == 1 && tab[i+1] == 1 && tab[i + 2] == 1)
            tab1[i+1] = T[7];
			if(tab[i] == 1 && tab[i+1] == 1 && tab[i + 2] == 0)
			tab1[i+1] = T[6];
			if(tab[i] == 1 && tab[i+1] == 0 && tab[i + 2] == 1)
			tab1[i+1] = T[5];
			if(tab[i] == 1 && tab[i+1] == 0 && tab[i + 2] == 0)
			tab1[i+1] = T[4];
			if(tab[i] == 0 && tab[i+1] == 1 && tab[i + 2] == 1)
			tab1[i+1] = T[3];
			if(tab[i] == 0 && tab[i+1] == 1 && tab[i + 2] == 0)
			tab1[i+1] = T[2];
			if(tab[i] == 0 && tab[i+1] == 0 && tab[i + 2] == 1)
			tab1[i+1] = T[1];
			if(tab[i] == 0 && tab[i+1] == 0 && tab[i + 2] == 0)
			tab1[i+1] = T[0];        	
    }

    for(int i=0; i<n;i++)
    tab2[j][i]=tab1[i];


	for(int i=0;i<n;i++)
    tab[i]=tab1[i];
}


for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		if(tab2[i][j]==1)
		canvas.drawRect(10*j,10*i,10+10*j,10+10*i,paint); 
	}	
}
}
}
