
package com.example.customlistview;
        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ListView;
        import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    ListView list;
    String[] maintitle ={
            "IronMan","DoctorStrange",
            "Batman","DoctorStrange",
            "SpiderMan",
    };
    String[] subtitle ={
            "And, I am IRONMAN! ..Snap..","Dormamu I have come to bargain!",
            "I am VENGENCE","Why so Serious :)",
            "With Great Power comes Great Responsibility",
    };
    Integer[] imgid={
            R.drawable.ironman,R.drawable.doctorstrange,
            R.drawable.batman,R.drawable.joker,
            R.drawable.spiderman,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle,imgid);
        list=(ListView)findViewById(R.id.listView);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
// TODO Auto-generated method stub
                if(position == 0) {
//code specific to first list item
                    Toast.makeText(getApplicationContext(),"Place Your First Option
                            Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 1) {
//code specific to 2nd list item
                    Toast.makeText(getApplicationContext(),"Place Your Second Option
                            Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 2) {
                    Toast.makeText(getApplicationContext(),"Place Your Third Option
                            Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {
                    Toast.makeText(getApplicationContext(),"Place Your Forth Option
                            Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {
                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option
                            Code",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}