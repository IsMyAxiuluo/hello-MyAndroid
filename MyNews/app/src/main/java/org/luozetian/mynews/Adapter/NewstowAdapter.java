package org.luozetian.mynews.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.luozetian.mynews.R;
import org.luozetian.mynews.been.NewsoneData;
import org.luozetian.mynews.been.NewstowData;

import java.util.List;

/**
 * Created by sam on 2016/3/29.
 */
public class NewstowAdapter extends RecyclerView.Adapter<NewstowAdapter.ViewHolder> {
    private Context context;
    private List<NewstowData.StoriesBean> mlist;

    private int DATU = 0;
    private int XIAOTU = 1;

    public NewstowAdapter(Context context, List<NewstowData.StoriesBean> mData) {
        this.context = context;
        this.mlist = mData;
    }


    @Override
    public int getItemViewType(int position) {
        if (mlist.get(position).getType() == 0) {
            return DATU;
        } else {
            return XIAOTU;
        }
    }

    

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == DATU) {
            return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.newsecond_itemone, parent, false));
        } else {
            return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.newsecond_itemtow, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        int itemViewType = getItemViewType(position);
        NewstowData.StoriesBean storiesBean = mlist.get(position);
        switch (itemViewType) {
            case 0:
                if (storiesBean.getImages().get(0) != null) {
                    Picasso.with(context).load(storiesBean.getImages().get(0)).into(holder.imageView);
                }
                holder.tv1.setText("  "+ storiesBean.getTitle());
                break;
            case 1:
                if (storiesBean.getImages().get(0) != null) {
                    Picasso.with(context).load(storiesBean.getImages().get(0)).into(holder.imageView);
                }
                holder.tv1.setText("  "+ storiesBean.getTitle());
                break;
        }
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        private View view;
        private ImageView imageView;
        private TextView tv1;

        public ViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            imageView = (ImageView) view.findViewById(R.id.datugongfengxiang);
            tv1 = (TextView) view.findViewById(R.id.datugongfengxiang_title);
        }
    }

}
