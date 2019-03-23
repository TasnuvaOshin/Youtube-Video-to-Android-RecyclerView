package oshin.tasnuva.youtubevideoandroidrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    ArrayList<DataSetList> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        arrayList = new ArrayList<DataSetList>();

        DataSetList dataSetList = new DataSetList("https://www.youtube.com/embed/UIXcKIz_UDA");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/UIXcKIz_UDA");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/9ouC5a_la4g");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/7YoE0xCMdy0");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/8OnXkproxuE");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/2OG0Z7hZQao");
        arrayList.add(dataSetList);


        YoutubeAdapter youtubeAdapter = new YoutubeAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(youtubeAdapter);

    }
}
