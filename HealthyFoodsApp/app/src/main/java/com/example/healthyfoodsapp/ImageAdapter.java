package com.example.healthyfoodsapp;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context context;
    MyFoodList myFoodList = new MyFoodList();
    public ImageAdapter (Context c){
        context = c;
    }

    @Override
    public int getCount(){
        return myFoodList.myMeals.length;
    }
    @Override
    public Object getItem(int Position){
        return null;
    }
    @Override
    public long getItemId(int position){
        return 0;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        myFoodList.myMenu = new ImageView(context);
        myFoodList.myMenu.setImageResource(myFoodList.myMeals[position]);
        myFoodList.myMenu.setScaleType(ImageView.ScaleType.FIT_XY);
        myFoodList.myMenu.setLayoutParams(new GridView.LayoutParams(330,300));
        return  myFoodList.myMenu;

    }
}
