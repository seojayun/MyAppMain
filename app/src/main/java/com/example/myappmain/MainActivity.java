package com.example.myappmain;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabs;
    ViewPager vpFragment;
    LinearLayout linegooglemap;
    Fragment map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent mIntent = new Intent(getApplicationContext(), OpActivity.class);
        startActivity(mIntent);


        tabs = (TabLayout)findViewById(R.id.tabs);
        vpFragment = (ViewPager)findViewById(R.id.vpFragment);
//        tabs.addTab(tabs.newTab().setIcon(R.drawable.icont));
        View view1 = getLayoutInflater().inflate(R.layout.tablayout1, null);
        view1.findViewById(R.id.icon).setBackgroundResource(R.drawable.icont);
        tabs.addTab(tabs.newTab().setCustomView(view1));

        View view2 = getLayoutInflater().inflate(R.layout.tablayout1, null);
        view2.findViewById(R.id.icon).setBackgroundResource(R.drawable.news);
        tabs.addTab(tabs.newTab().setCustomView(view2));

        //탭 크기에 맞추어서 이미지 세팅하기


//        tabs.addTab(tabs.newTab().setIcon(R.drawable.news));
        tabs.addTab(tabs.newTab().setText("칼럼  (네이버)"));
        tabs.addTab(tabs.newTab().setText("MLB.COM 검색요령"));
        tabs.setTabGravity(tabs.GRAVITY_FILL);
        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager(),4);     //ViewPager에 Adapter 연결
        vpFragment.setAdapter(adapter);
        //탭메뉴를 클릭하면 해당 프레그먼트를 변경
        tabs.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(vpFragment));
        //뷰페이지를 밀면 탭 메뉴를 변경
        vpFragment.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabs));
    }

    public class MyPagerAdapter extends FragmentPagerAdapter {

        int mNumOfTabs;           //tab의 갯수

        public MyPagerAdapter(@NonNull FragmentManager fm, int mNumOfTabs) {
            super(fm);
            this.mNumOfTabs = mNumOfTabs;
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch(position){
                case 0 :
                    Tabhost1 tabhost1 = new Tabhost1();
                    return tabhost1;
                case 1 :
                    Tabhost2 tabhost2 = new Tabhost2();
                    return tabhost2;
                    case 2 :
                    Tabhost3 tabhost3 = new Tabhost3();
                    return tabhost3;
                    case 3 :
                    Tabhost4 tabhost4 = new Tabhost4();
                    return tabhost4;
                default :
                    return null;
            }
        }

        @Override
        public int getCount() {

            return mNumOfTabs;                        //Tab의 갯수를 return해 준다.
        }
    }

}
