package com.quocnguyen.mediaplayerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        songList = (ListView) findViewById(R.id.songList);
        arrayList = new ArrayList<>();
        arrayList.add(new Music("Song1", "Regge", R.raw.cam_giac_yeu));
        arrayList.add(new Music("Song2", "jazz", R.raw.cau_vong_tinh_yeu));
        arrayList.add(new Music("Song3", "Kel", R.raw.loi_anh_chua_the_noi));
        arrayList.add(new Music("Song4", "ming", R.raw.tan));

        adapter = new CustomMusicAdapter(this, R.layout.custom_music_item, arrayList);
        songList.setAdapter(adapter);
    }
}
