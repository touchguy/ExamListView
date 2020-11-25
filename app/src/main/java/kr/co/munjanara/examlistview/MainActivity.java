package kr.co.munjanara.examlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 데이터 준비
        ArrayList<Weather> data = new ArrayList<>();
        data.add(new Weather("수원", "25도", "맑음"));
        data.add(new Weather("서울", "25도", "맑음"));
        data.add(new Weather("인천", "25도", "맑음"));
        data.add(new Weather("수원", "25도", "맑음"));
        data.add(new Weather("서울", "25도", "맑음"));
        data.add(new Weather("인천", "25도", "맑음"));
        data.add(new Weather("수원", "25도", "맑음"));
        data.add(new Weather("서울", "25도", "맑음"));
        data.add(new Weather("인천", "25도", "맑음"));


        // 어뎁터
        MyFirstAdapter adapter = new MyFirstAdapter( data );
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        // 클릭
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, position + "번째 아이템", Toast.LENGTH_SHORT).show();
            }
        });
    }
}