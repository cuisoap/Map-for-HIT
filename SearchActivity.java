package com.example.hitmap;

import com.example.hitmap.*;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SearchActivity extends Activity{
    protected void onCreate(Bundle savedInstanceState)
    {
    	  super.onCreate(savedInstanceState);  
          setContentView(R.layout.search);
          Button com=(Button)findViewById(R.id.confirm);
          final EditText input =(EditText)findViewById(R.id.searchedittext);
          com.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String poi=input.getText().toString();
				if(poi.equals(""))
				{
					Toast.makeText(getApplicationContext(), "请输入关键字", Toast.LENGTH_SHORT).show();
				}
				else 
				{
					MapActivity.interest=poi;
					startActivity(new Intent(getApplicationContext(),MapActivity.class).putExtra("function", "search"));
				}
			}
		});
    }
}
