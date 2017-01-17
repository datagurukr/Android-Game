package kr.dataguru.android.game.gamebasictext;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;

/**
 * Created by dataguru on 2017. 1. 17..
 */
public class MainView extends View {
    public MainView ( Context context ) {
        super(context);
    }

    @Override
    public void onDraw( Canvas canvas ) {

        // 캔버스를 활용하며 배경색을 흰색으로 색칠
        canvas.drawColor(Color.WHITE);

        // 캔버스로 도형 그리는 순서
        // 1. 페인트(Paint)객체를 이용하여 선과 면의 색상을 설정한다.
        // 2. 캔버스를 이용하여 텍스트 그리그

        // paint(페인트) 객체 초기화
        Paint paint = new Paint();

        // Typeface 설정
        Typeface typeface = Typeface.create(Typeface.SERIF, Typeface.BOLD); // 폰트 스타일 : SERIF, 폰트 굵기 BOLD

        // paint(페인트) 객체를 활용하여 텍스트색 설정 ( RED )
        paint.setColor(Color.RED); // 텍스트 색
        paint.setTextSize(12); // 텍스트 사이즈 ( 12 )
        // canvas(캔버스) 메소드를 활용하여 "CANVAS TEXT!!" 텍스트 그리기
        canvas.drawText(
                "CANVAS TEXT!!", // text
                canvas.getWidth() / 2 - 100, // x 좌표
                canvas.getHeight() / 4, // y 좌표
                paint // paint
        );

        // paint(페인트) 객체를 활용하여 텍스트색 설정 ( GREEN )
        paint.setColor(Color.GREEN); // 배경
        paint.setTextSize(24); // 텍스트 사이즈 ( 48 )
        // canvas(캔버스) 메소드를 활용하여 "CANVAS TEXT!!" 텍스트 그리기
        canvas.drawText(
                "CANVAS TEXT!!", // text
                canvas.getWidth() / 2 - 100, // x 좌표
                canvas.getHeight() * 2 / 4, // y 좌표
                paint // paint
        );

        // paint(페인트) 객체를 활용하여 텍스트색 설정 ( BLUE )
        paint.setColor(Color.BLUE); // 배경
        paint.setTextSize(48); // 텍스트 사이즈 ( 48 )
        // canvas(캔버스) 메소드를 활용하여 "CANVAS TEXT!!" 텍스트 그리기
        canvas.drawText(
                "CANVAS TEXT!!", // text
                canvas.getWidth() / 2 - 100, // x 좌표
                canvas.getHeight() * 3 / 4, // y 좌표
                paint // paint
        );
    }
}
