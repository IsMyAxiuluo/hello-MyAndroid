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

import java.util.List;

/**
 * Created by sam on 2016/3/29.
 */
public class NewsoneAdapter extends RecyclerView.Adapter<NewsoneAdapter.ViewHolder> {
    private Context context;
    private List<NewsoneData.DataBean.ListBean> mlist;

    public int LIVE_WUTU = 0;
    public int TUPIANZAIQITA = 1;
    public int XUNCHANGLAO = 2;

    public NewsoneAdapter(Context context, List<NewsoneData.DataBean.ListBean> mData) {
        this.context = context;
        this.mlist = mData;
    }

    @Override
    public int getItemViewType(int position) {
        String category = mlist.get(position).getCategory();
        if ("live".equals(category)) {
            return LIVE_WUTU;
        } else if ("sponsor".equals(category)) {
            return TUPIANZAIQITA;
        } else {
            return XUNCHANGLAO;
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
         return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        NewsoneData.DataBean.ListBean listBean = mlist.get(position);
        int itemViewType = getItemViewType(position);
        switch (itemViewType){
            case 0:
                holder.imageView.setImageResource(R.drawable.viewpager3);
                holder.tv1.setText(listBean.getTitle());
                holder.tv2.setText("   " + listBean.getIntro());
                break;
            case 1:
                Picasso.with(context).load(listBean.getKpic()).into(holder.imageView);
                holder.tv1.setText(listBean.getTitle());
                holder.tv2.setText("   " + listBean.getIntro());
                break;
            case 2:
                Picasso.with(context).load(listBean.getPic()).into(holder.imageView);
                holder.tv1.setText(listBean.getTitle());
                holder.tv2.setText("   " + listBean.getIntro());
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
        private TextView tv1, tv2;

        public ViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            imageView = (ImageView) view.findViewById(R.id.imgId);
            tv1 = (TextView) view.findViewById(R.id.titleId);
            tv2 = (TextView) view.findViewById(R.id.contentid);
        }
    }

}
