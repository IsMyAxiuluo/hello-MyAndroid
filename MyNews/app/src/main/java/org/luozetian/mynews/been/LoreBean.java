package org.luozetian.mynews.been;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by sam on 2016/3/31.
 */
public class LoreBean implements Parcelable{
    private boolean isSelect;

    private  String description;

    public LoreBean(){

    }

    protected LoreBean(Parcel in) {
        isSelect = in.readByte() != 0;
        description = in.readString();
    }

    public static final Creator<LoreBean> CREATOR = new Creator<LoreBean>() {
        @Override
        public LoreBean createFromParcel(Parcel in) {
            return new LoreBean(in);
        }

        @Override
        public LoreBean[] newArray(int size) {
            return new LoreBean[size];
        }
    };

    /**
     * Describe the kinds of special objects contained in this Parcelable's
     * marshalled representation.
     *
     * @return a bitmask indicating the set of special object types marshalled
     * by the Parcelable.
     */
    @Override
    public int describeContents() {
        return 0;
    }

    /**
     * Flatten this object in to a Parcel.
     *
     * @param dest  The Parcel in which the object should be written.
     * @param flags Additional flags about how the object should be written.
     *              May be 0 or {@link #PARCELABLE_WRITE_RETURN_VALUE}.
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte((byte) (isSelect ? 1 : 0));
        dest.writeString(description);
    }

//    protected LoreBean(Parcel in) {
//        isSelect = in.readByte() != 0;
//        description = in.readString();
//    }
//
//    public static final Creator<LoreBean> CREATOR = new Creator<LoreBean>() {
//        @Override
//        public LoreBean createFromParcel(Parcel in) {
//            return new LoreBean(in);
//        }
//
//        @Override
//        public LoreBean[] newArray(int size) {
//            return new LoreBean[size];
//        }
//    };
//
//    /**
//     * Describe the kinds of special objects contained in this Parcelable's
//     * marshalled representation.
//     *
//     * @return a bitmask indicating the set of special object types marshalled
//     * by the Parcelable.
//     */
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    /**
//     * Flatten this object in to a Parcel.
//     *
//     * @param dest  The Parcel in which the object should be written.
//     * @param flags Additional flags about how the object should be written.
//     *              May be 0 or {@link #PARCELABLE_WRITE_RETURN_VALUE}.
//     */
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeByte((byte) (isSelect ? 1 : 0));
//        dest.writeString(description);
//    }
}
