package app.kiti.com.kitiapp.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;


import app.kiti.com.kitiapp.main.KitiAppMain;

/**
 * Created by Ankit on 1/1/2018.
 */

public class PixelUtils {

    public static int pxToDp(int px) {
        return (int) (px / Resources.getSystem().getDisplayMetrics().density);
    }

    public static int dpToPx(int dp) {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }

    public static int getWidth(){

        WindowManager wm = (WindowManager) KitiAppMain.getContext().getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        return size.x/2;

    }

    public static DisplayMetrics getDimension(Context context){

        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return metrics;
    }

}
