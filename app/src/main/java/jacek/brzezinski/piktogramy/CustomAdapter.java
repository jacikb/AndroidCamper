package jacek.brzezinski.piktogramy;

import android.content.Context;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends BaseAdapter {
    private static final String TAG = "CustomAdapter";
    Context context;
    int gridHeight;
    List<PictogramModel> pictograms;
    MediaPlayer mediaPlayer;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, int gridHeight, List<PictogramModel> pictograms) {
        this.context = applicationContext;

        this.pictograms = pictograms;
        //this.audios = new ArrayList<Integer>(audios);

        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return pictograms.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_gridview, null); // inflate the layout
        ImageView icon = (ImageView) view.findViewById(R.id.icon); // get the reference of ImageView
//        icon.getLayoutParams().height = view.getLayoutParams().width;
        PictogramModel pictogramModel = pictograms.get(i);
        icon.setImageResource(MainActivity.getResource("drawable", pictogramModel.getPath()));

        return view;
    }
}