package edison.deepakraoj.gridview;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Deepak Rao J on 6/28/2017.
 */

public class Second extends AppCompatActivity {
    GridView androidGridView;
    //static int old=99;
   Integer []old = new Integer[1];
    Integer[] imageIDs = {
            R.drawable.ac01, R.drawable.bell01, R.drawable.dimer01,
            R.drawable.dog01, R.drawable.lock01, R.drawable.pir01,
            R.drawable.rgb01, R.drawable.sprinkler01, R.drawable.switch_board01,

    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo);

        androidGridView = (GridView) findViewById(R.id.gridview_android_example);
        androidGridView.setAdapter(new ImageAdapterGridView(this));

    }

    public class ImageAdapterGridView extends BaseAdapter {
        private Context mContext;
        private ImageView selectedView = null;
        public ImageAdapterGridView(Context c) {
            mContext = c;
        }

        public int getCount() {
            return imageIDs.length;
        }

        public Object getItem(int position) {
            return null;
        }

        public long getItemId(int position) {
            return 0;
        }

        public View getView(final int position, View convertView, ViewGroup parent) {
         final   ImageView mImageView;

            if (convertView == null) {
                mImageView = new ImageView(mContext);
                mImageView.setLayoutParams(new GridView.LayoutParams(130, 130));
                mImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                mImageView.setPadding(16, 16, 16, 16);
            } else {
                mImageView = (ImageView) convertView;
            }

            mImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(old[0]!=null)
                    {


                        selectedView.setImageResource(old[0]);
                        Toast.makeText(Second.this,""+old[0],Toast.LENGTH_LONG).show();
                    }

                    if(position==0)
                    {
                        // ImageView imageView = (ImageView) v;
                        mImageView.setImageResource(R.drawable.ac02);
                        old[0]=R.drawable.ac01;
                        selectedView=mImageView;



                    }else if(position==1)
                    {
                        // ImageView imageView = (ImageView) v;
                        mImageView.setImageResource(R.drawable.bell02);
                        old[0]=R.drawable.bell01;selectedView=mImageView;
                    }
                    else if(position==2)
                    {
                        // ImageView imageView = (ImageView) v;
                        mImageView.setImageResource(R.drawable.dimer02);
                        old[0]=R.drawable.dimer01;
                        selectedView=mImageView;

                    }
                    else if(position==3)
                    {
                        // ImageView imageView = (ImageView) v;
                        mImageView.setImageResource(R.drawable.dog02);
                        old[0]=R.drawable.dog01;
                        selectedView=mImageView;
                    }
                    else if(position==4)
                    {
                        // ImageView imageView = (ImageView) v;
                        mImageView.setImageResource(R.drawable.lock02);
                        old[0]=R.drawable.lock01;
                        selectedView=mImageView;
                    }
                    else if(position==5)
                    {
                        // ImageView imageView = (ImageView) v;
                        mImageView.setImageResource(R.drawable.pir02);
                        old[0]=R.drawable.pir01;
                        selectedView=mImageView;
                    }
                    else if(position==6)
                    {
                        // ImageView imageView = (ImageView) v;
                        mImageView.setImageResource(R.drawable.rgb02);
                        old[0]=R.drawable.rgb01;
                        selectedView=mImageView;
                    }

                    else if(position==7)
                    {
                        // ImageView imageView = (ImageView) v;
                        mImageView.setImageResource(R.drawable.sprinkler02);
                        old[0]=R.drawable.sprinkler01;
                        selectedView=mImageView;
                    }

                    else if(position==8)
                    {
                        // ImageView imageView = (ImageView) v;
                        mImageView.setImageResource(R.drawable.switch_board02);
                        old[0]=R.drawable.switch_board01;
                        selectedView=mImageView;
                    }

                }
            });
            mImageView.setImageResource(imageIDs[position]);
            return mImageView;
        }
    }
}
