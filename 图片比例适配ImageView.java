
    //  无加减法低误差

public class AutoImageView extends AppCompatImageView {
    public AutoImageView(Context context) {
        super(context);
    }

    public AutoImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public AutoImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        ViewGroup.LayoutParams card_image_params = this.getLayoutParams();
        double measuredWidth=(double)this.getMeasuredWidth();
        int picWidth=getBackground().getIntrinsicWidth();
        int picHeight=getBackground().getIntrinsicHeight();

        Log.d("picwidth",picWidth+"");
        Log.d("picheigt",picHeight+"");
        double height;
        double width;

        width = measuredWidth;
        height = width * picHeight/picWidth;

        card_image_params.height=(int)height;
        card_image_params.width=(int)width;

        Log.d("picparawidth",card_image_params.height+"");
        Log.d("picparaheigt",card_image_params.width+"");
        this.setLayoutParams(card_image_params);

    }

}


----------------------------------------------------------------------------------------------------------------


public class AutoImageView extends AppCompatImageView {
    public AutoImageView(Context context) {
        super(context);
    }

    public AutoImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public AutoImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        ViewGroup.LayoutParams card_image_params = this.getLayoutParams();
        float measuredHeight=(float)this.getMeasuredHeight();
        float measuredWidth=(float)this.getMeasuredWidth();

        float height;
        float width;
        float IMAGE_SCALE_REAL=measuredWidth/measuredHeight;
        float IMAGE_SCALE=75/12;
        if(IMAGE_SCALE>IMAGE_SCALE_REAL){
            float tmp_minus=measuredHeight-measuredWidth/IMAGE_SCALE;
            height=(measuredHeight-tmp_minus);
            width=measuredWidth;

        }else{
            float tmp_minus=measuredWidth/IMAGE_SCALE-measuredHeight;
            width=measuredWidth;
            height=measuredHeight+tmp_minus;
        }

        card_image_params.height=(int)height;
        card_image_params.width=(int)width;
        this.setLayoutParams(card_image_params);

    }

}
