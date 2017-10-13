package com.example.machenike.listfragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private RelativeLayout mRelativeLayout;
    private ArrayList<String> mArrayList;
    private FragmentManager mSupportFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.left_list);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.right_fragment);
        mArrayList = new ArrayList<>();
        for (int i = 0;i<5;i++){
            mArrayList.add("条目"+i);
        }

        mListView.setAdapter(new MyAdapter(mArrayList));
        mSupportFragmentManager = getSupportFragmentManager();
        mSupportFragmentManager.beginTransaction().replace(R.id.right_fragment,new Fragment0()).commit();
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FragmentTransaction fragmentTransaction = mSupportFragmentManager.beginTransaction();
                switch (i){
                    case 0:
                        fragmentTransaction.replace(R.id.right_fragment,new Fragment0()).commit();
                        break;
                    case 1:
                        fragmentTransaction.replace(R.id.right_fragment,new Fragment1()).commit();
                        break;
                    case 2:
                        fragmentTransaction.replace(R.id.right_fragment,new Fragment2()).commit();
                        break;
                    case 3:
                        fragmentTransaction.replace(R.id.right_fragment,new Fragment3()).commit();
                        break;
                    case 4:
                        fragmentTransaction.replace(R.id.right_fragment,new Fragment4()).commit();
                        break;
                }

            }
        });
    }
}
