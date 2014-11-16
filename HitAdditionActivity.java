package com.example.hitmap;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class HitAdditionActivity extends Activity{
    protected void onCreate(Bundle savedInstanceState)
    {
    	 super.onCreate(savedInstanceState);
    	 setContentView(R.layout.hitadition);
    	 ListView lv=(ListView)findViewById(R.id.hit_listview);
    	 String [] list={"公共设施","快递","公寓","食堂","教学楼","生活便利","运动","自习推荐"};
    	 lv.setAdapter(new ArrayAdapter<String>(this, 
                 android.R.layout.simple_list_item_1, list));

    }
}
