package com.example.cooknote;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.cooknote.FragmentA;
import com.example.cooknote.FragmentB;
import com.example.cooknote.FragmentC;

public class Adapter extends FragmentStateAdapter {

    public int mCount;

    public Adapter(FragmentActivity fa, int count) {
        super(fa);
        mCount = count;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        int index = getRealPosition(position);

        switch(index){
            case 0 :
                return FragmentA.newInstance(index+1);
            case 1:
                return FragmentB.newInstance(index+1);
            case 2:
                return FragmentC.newInstance(index+1);
            default:
                return null;
        }

    }

    @Override
    public int getItemCount() {
        return 2000;
    }

    public int getRealPosition(int position) { return position % mCount; }

}