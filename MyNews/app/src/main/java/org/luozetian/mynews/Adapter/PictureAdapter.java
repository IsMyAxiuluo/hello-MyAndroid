package org.luozetian.mynews.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import org.luozetian.mynews.R;
import org.luozetian.mynews.been.PictureData;

import java.util.List;

/**
 * Created by Administrator on 2016/3/22.
 */
public class PictureAdapter extends RecyclerView.Adapter<PictureAdapter.Myhoder> {
    private Context context;
    private List<PictureData.ListBean> lists;

    private int IMAGE = 0;
    private int GIF   = 1;

    public PictureAdapter(Context context, List<PictureData.ListBean> lists) {
        this.context = context;
        this.lists = lists;
    }

    @Override
    public Myhoder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(context).inflate(R.layout.picture_item, parent, false);
        return new Myhoder(itemview);
    }

    @Override
    public int getItemViewType(int position) {
        if("image".equals(lists.get(position).getType())){
            return IMAGE;
        }else{
            return GIF;
        }
    }

    @Override
    public void onBindViewHolder(Myhoder holder, int position) {
        PictureData.ListBean itemsEntity = lists.get(position);
        Picasso.with(context).load(itemsEntity.getU().getHeader().get(0)).into(holder.image_icon);
        if(getItemViewType(position) == IMAGE){
            Picasso.with(context).load(itemsEntity.getImage().getDownload_url().get(0)).into(holder.image_content);
        }else{
            Picasso.with(context).load(itemsEntity.getGif().getGif_thumbnail().get(0)).into(holder.image_content);
        }
        holder.uesr_nam.setText(itemsEntity.getU().getName());
        holder.uesr_content.setText(itemsEntity.getText());
        int v = (int) (Math.random() + 1 * 50);
        int f = v+(int) (Math.random() + 1 * 50);
        int k = v+(int) (Math.random() + 1 * 50);
        holder.picture_comment_number.setText("" + itemsEntity.getBookmark()+v);
        holder.picture_share_number.setText("" + itemsEntity.getComment()+f);
        holder.picture_favorite_number.setText("" + itemsEntity.getDown()+k);
        holder.picture_good_number.setText(""+itemsEntity.getForward()+v);
        holder.tiaozhuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "没有服务", Toast.LENGTH_SHORT).show();
            }
        });
        holder.tiaozhuang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "没有服务", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return lists.size();
    }


    class Myhoder extends RecyclerView.ViewHolder {
        View itemview;
        ImageView image_icon,image_content,tiaozhuan;
        TextView uesr_nam,uesr_content,picture_good_number,
                picture_comment_number,picture_share_number,
                picture_favorite_number,tiaozhuang;
        public Myhoder(View itemView) {
            super(itemView);
            this.itemview = itemView;
            image_icon = (ImageView) itemview.findViewById(R.id.picture_user_icon);
            image_content = (ImageView) itemview.findViewById(R.id.picture_content_image);
            tiaozhuan = (ImageView) itemview.findViewById(R.id.image_letter_sound);

            uesr_nam = (TextView) itemview.findViewById(R.id.picture_user_name);
            uesr_content = (TextView) itemview.findViewById(R.id.picture_user_context);
            picture_good_number = (TextView) itemview.findViewById(R.id.picture_good_number);
            picture_comment_number = (TextView) itemview.findViewById(R.id.picture_comment_number);
            picture_share_number = (TextView) itemview.findViewById(R.id.picture_share_number);
            picture_favorite_number = (TextView) itemview.findViewById(R.id.picture_favorite_number);
            tiaozhuang = (TextView) itemview.findViewById(R.id.picture_favorite_number);
        }
    }
}
