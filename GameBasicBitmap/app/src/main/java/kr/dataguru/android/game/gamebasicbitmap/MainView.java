package kr.dataguru.android.game.gamebasicbitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;

/**
 * Created by dataguru on 2017. 1. 19..
 */
public class MainView extends View {
    public MainView ( Context context ) {
        super(context);
    }

    @Override
    public void onDraw(Canvas canvas){

        //preScale(float x, float y) // 확대, 축소
        //preRotate(float degrees) // 이미지 회전
        //preSkew(float sx, float sy) // 이미지 비틀기
        //preTranslate(float dx, float dy) // 이미지 이동

        // 캔버스를 활용하며 배경색을 흰색으로 색칠
        canvas.drawColor(Color.WHITE);

        // paint(페인트) 객체 초기화
        Paint paint = new Paint();

        // 비트맵 읽기 drawable spearman
        Bitmap bitmap = BitmapFactory.decodeResource (
                getResources(),
                R.drawable.spearman
        );
        canvas.drawBitmap (
                bitmap,
                canvas.getWidth()/2 - bitmap.getWidth()/2,
                canvas.getHeight()/4 -bitmap.getHeight()/2,
                paint
        );

        // 비트맵 축소
        Bitmap bitmapScale =Bitmap.createScaledBitmap(bitmap, 150,150,false);
        canvas.drawBitmap (
                bitmapScale,
                canvas.getWidth() / 2 - bitmapScale.getScaledWidth(canvas)/2,
                canvas.getHeight() * 2 / 4 - bitmapScale.getScaledHeight(canvas)/2,
                paint
        );

        // 매트릭스 축소
        Matrix matrixDirX = new Matrix();
        matrixDirX.preScale(-1,1);
        Bitmap bitmapMatrixDirX = Bitmap.createBitmap (
                bitmap,
                0,
                0,
                bitmap.getWidth(),
                bitmap.getHeight(),
                matrixDirX,
                false
        );
        canvas.drawBitmap (
                bitmapMatrixDirX,
                canvas.getWidth()/4 - bitmap.getWidth()/2,
                canvas.getHeight()*3/4- bitmap.getWidth()/2,
                paint
        );

        // 매트릭스 회전
        Matrix matrix = new Matrix();
        matrix.preRotate(90);
        Bitmap bitmapMatrix = Bitmap.createBitmap (
                bitmap,
                0,
                0,
                bitmap.getWidth(),
                bitmap.getHeight(),
                matrix,
                false
        );
        canvas.drawBitmap (
                bitmapMatrix,
                canvas.getWidth()/2 - bitmap.getWidth()/2,
                canvas.getHeight()*3/4- bitmap.getWidth()/2,
                paint
        );

        // 매트릭스 회전
        Matrix matrixDirY = new Matrix();
        matrixDirY.preScale(1,-1);
        Bitmap bitmapMatrixDirY =
                Bitmap.createBitmap (
                        bitmap,
                        0,
                        0,
                        bitmap.getWidth(),
                        bitmap.getHeight(),
                        matrixDirY,
                        false
                );
        canvas.drawBitmap (
                bitmapMatrixDirY,
                canvas.getWidth()*3/4 - bitmap.getWidth()/2,
                canvas.getHeight()*3/4- bitmap.getWidth()/2,
                paint
        );

        bitmapScale.recycle();
        bitmap.recycle();
    }
}
