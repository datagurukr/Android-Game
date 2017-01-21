package kr.dataguru.android.game.gamebasicbitmapsprite;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/**
 * Created by dataguru on 2017. 1. 20..
 */
public class MainView extends View {

    Bitmap bitmap;
    int bitmapWidth = 100;
    int bitmapHeight = 150;
    int count = 0;
    float scale;

    public MainView(Context context) {
        super(context);
        // drawable 폴더 에서 spearman 이미지를 가져와 Bitmap 으로 생성
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.spearman);
        // DIP 단위를 가져옴
        scale = context.getResources().getDisplayMetrics().density;
    }
    @Override
    public void onDraw(Canvas canvas){
        // 캔버스 (Canvas) 를 활용하여 배경색을 RED 로 변경
        canvas.drawColor(Color.RED);
        // 페인트 (Paint) 객체 생성
        Paint paint = new Paint();
        // Rect 를 활용하여 이미지 자르기

        canvas.drawBitmap(
                bitmap,
                new Rect(
                        0, // left
                        0, // top
                        (int)(bitmapWidth * scale), // right
                        (int)(bitmapHeight * scale) // bottom
                ),
                new Rect(
                        0,
                        0,
                        (int)(bitmapWidth * scale),
                        (int)(bitmapHeight*scale)
                ),
                null
        );
        canvas.drawBitmap(
                bitmap,
                new Rect(
                        (int)(bitmapWidth * scale),
                        0,
                        (int)(bitmapWidth * scale  *2),
                        (int)(bitmapHeight * scale)
                ),
                new Rect(
                        (int)(bitmapWidth * scale)
                        ,0
                        ,(int)(bitmapWidth * scale * 2)
                        , (int)(bitmapHeight*scale)
                ),
                null
        );
        canvas.drawBitmap(
                bitmap,
                new Rect(
                        (int)(bitmapWidth * scale * 2),
                        0,
                        (int)(bitmapWidth * scale * 3),
                        (int)(bitmapHeight * scale)
                ),
                new Rect(
                        (int)(bitmapWidth * scale * 2),
                        0,
                        (int)(bitmapWidth * scale * 3),
                        (int)(bitmapHeight*scale)
                ),
                null
        );

    }


}
