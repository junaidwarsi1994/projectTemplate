package app.invision.template.fonts;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import app.invision.template.R;


/**
 * Created by Junaid-Invision on 5/9/2017.
 */
public class CustomTextView extends TextView {

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.fontStyles, 0, 0);
        String FontPath = a.getString(R.styleable.fontStyles_fontStyle);
        setFont(FontPath);

    }



    private void setFont(String fontPath) {
        Typeface font = Typeface.createFromAsset(getContext().getAssets(), fontPath);
        setTypeface(font, Typeface.NORMAL);
//		setTextSize(Constants.fontsize);
      //  setTextSize(20);
//		setLineSpacing(5,2.5f);
//		setTextColor(getResources().getColor(R.color.priwhite));
    }
}
