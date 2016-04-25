package testsample.altvr.com.testsample.util;

import android.graphics.Bitmap;

import com.squareup.picasso.Transformation;

/**
 * Created by Tejus Kudari on 4/13/2016.
 */
public class ItemImageTransformation implements Transformation {
    private static final String KEY = "itemImageTransformationKey";

    private int mImageViewWidth;

    public ItemImageTransformation(int imageViewWidth) {
        mImageViewWidth = imageViewWidth;
    }

    @Override
    public Bitmap transform(Bitmap source) {
        int newWidth = mImageViewWidth;
        int newHeight = getNewHeightFromAspectRatio(newWidth, source.getHeight(), source.getWidth());

        Bitmap result = Bitmap.createScaledBitmap(source, newWidth, newHeight, false);

        if (result != source) {
            source.recycle();
        }

        return result;
    }

    @Override
    public String key() {
        return KEY + mImageViewWidth;
    }

    private int getNewHeightFromAspectRatio(int newWidth, int originalHeight, int originalWidth) {
        return (int) (newWidth * ((float) originalHeight / originalWidth));
    }
}
