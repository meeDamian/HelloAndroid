package pl.maurycywasilewski;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
	private Context mContext;
	
	public ImageAdapter(Context c) {
		mContext = c;
	}

	public int getCount() {
		return mThumbIds.length;
	}

	public Object getItem(int position) {
		return null;
	}

	public long getItemId(int position) {
		return 0;
	}

	// create a new ImageView for each item references by the Adapter
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView;
		if(convertView == null) {
			imageView = new ImageView(mContext);
			imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			imageView.setPadding(8, 8, 8, 8);
		} else {
			imageView = (ImageView) convertView;
		}
		
		imageView.setImageResource(mThumbIds[position]);
		return imageView;
	}
	
	// references to our images
	private Integer[] mThumbIds = { 
			R.drawable.image2_001, R.drawable.image2_002, 
			R.drawable.image2_003, R.drawable.image2_004, 
			R.drawable.image2_005, R.drawable.image2_006, 
			R.drawable.image2_007, R.drawable.image2_008,
			R.drawable.image2_001, R.drawable.image2_002, 
			R.drawable.image2_003, R.drawable.image2_004, 
			R.drawable.image2_005, R.drawable.image2_006, 
			R.drawable.image2_007, R.drawable.image2_008,
			R.drawable.image2_001, R.drawable.image2_002, 
			R.drawable.image2_003, R.drawable.image2_004, 
			R.drawable.image2_005, R.drawable.image2_006, 
			R.drawable.image2_007, R.drawable.image2_008,
			R.drawable.image2_001, R.drawable.image2_002, 
			R.drawable.image2_003, R.drawable.image2_004, 
			R.drawable.image2_005, R.drawable.image2_006, 
			R.drawable.image2_007, R.drawable.image2_008,
			R.drawable.image2_001, R.drawable.image2_002, 
			R.drawable.image2_003, R.drawable.image2_004, 
			R.drawable.image2_005, R.drawable.image2_006, 
			R.drawable.image2_007, R.drawable.image2_008
	};
}
