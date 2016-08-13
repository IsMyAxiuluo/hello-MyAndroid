package com.luozedian.or.ghoststories.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.luozedian.or.ghoststories.R;
import com.luozedian.or.ghoststories.been.GhoststoriesEntry;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Administrator on 2016/6/21.
 */
public class MRLVAdapter extends BaseAdapter{

    List<GhoststoriesEntry> mData;
    Context mcontext;
    private int[] image = { R.mipmap.img_rank_1,
                            R.mipmap.img_rank_2,
                            R.mipmap.img_rank_3,
                            R.mipmap.img_rank_4,
                          } ;

    public MRLVAdapter(List<GhoststoriesEntry> list,Context context){
        this.mData = list;
        this.mcontext = context;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return this.mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHolder mviewholder;
        if(convertView==null){
            mviewholder = new MyViewHolder();
            convertView = LayoutInflater.from(mcontext).inflate(R.layout.entryfg_item,null,false);
            mviewholder.imag = (ImageView) convertView.findViewById(R.id.item_img);
            mviewholder.imagerink = (ImageView) convertView.findViewById(R.id.image_rank);
            mviewholder.title = (TextView) convertView.findViewById(R.id.item_title);
            mviewholder.content = (TextView) convertView.findViewById(R.id.item_content);
            mviewholder.number = (TextView) convertView.findViewById(R.id.number);
            convertView.setTag(mviewholder);
        }else{
            mviewholder = (MyViewHolder) convertView.getTag();
        }
        chose(mviewholder,position);
        Picasso.with(mcontext).load(mData.get(position).getImg()).into(mviewholder.imag);
        mviewholder.title.setText(mData.get(position).getTitle());
        Log.i("MainActivity", mData.get(position).getTitle());
        mviewholder.content.setText("   "+mData.get(position).getDesc());
        mviewholder.number.setText(""+(position+1));
        return convertView;
    }

    private void chose(MyViewHolder mviewholder, int position) {
        if(position == 0){
            mviewholder.imagerink.setImageResource(image[position]);
        }else if(position == 1){
            mviewholder.imagerink.setImageResource(image[position]);
        }else if (position == 2){
            mviewholder.imagerink.setImageResource(image[position]);
        }else{
            mviewholder.imagerink.setImageResource(image[3]);
        }
    }


    class MyViewHolder {
        ImageView imag,imagerink;
        TextView title,content,number;
    }

}
