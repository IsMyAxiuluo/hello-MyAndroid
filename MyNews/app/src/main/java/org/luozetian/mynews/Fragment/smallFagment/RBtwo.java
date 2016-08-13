package org.luozetian.mynews.Fragment.smallFagment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.luozetian.mynews.R;

/**
 * Created by sam on 2016/3/29.
 */
public class RBtwo extends Fragment{
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(view ==null){
            view = inflater.inflate(R.layout.read_book_two,container,false);
        }
        return view;
    }
}
