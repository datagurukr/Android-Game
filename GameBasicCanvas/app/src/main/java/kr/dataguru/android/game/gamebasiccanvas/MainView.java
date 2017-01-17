package kr.dataguru.android.game.gamebasiccanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
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
        // 2. 캔버스를 이용하여 도형 및 위치 크기를 설정후 그리기

        // paint(페인트) 객체 초기화
        Paint paint = new Paint();

        // RadialGradient Shader
        RadialGradient gradient = new RadialGradient(
                canvas.getWidth()/2,
                canvas.getHeight()/4,
                canvas.getHeight()/10,
                Color.RED,
                Color.GREEN,
                Shader.TileMode.MIRROR
        );

        // paint(페인트) 객체를 활용하여 선과 면의 색상 설정 ( RED )
        paint.setColor(Color.RED); // 배경
        //paint.setShader(gradient); // Shader 추가
        // canvas(캔버스) 메소드를 활용하여 반지름크기의 원을 그린다
        canvas.drawCircle(
                canvas.getWidth()/2, // x 좌표
                canvas.getHeight()/4, // y 좌표
                canvas.getHeight()/10, // radius
                paint // paint
        );

        // paint(페인트) 객체를 활용하여 선과 면의 색상 설정 ( GREEN )
        paint.setColor(Color.GREEN); // 배경
        paint.setStyle(Paint.Style.STROKE); // 선
        // canvas(캔버스) 메소드를 활용하여 사각형을 그린다
        canvas.drawRect(
                canvas.getWidth()/2-canvas.getHeight()/10, // x1 좌표
                canvas.getHeight()*2/4-canvas.getHeight()/10, // y1 좌표
                canvas.getWidth()/2+canvas.getHeight()/10, // x2 좌표
                canvas.getHeight()*2/4+canvas.getHeight()/10, // y2 좌표
                paint // paint
        );

        // paint(페인트) 객체를 활용하여 선과 면의 색상 설정 ( BLUE )
        paint.setColor(Color.BLUE); // 배경
        paint.setStyle(Paint.Style.FILL); // 배경색 채우기
        paint.setAntiAlias(true); // 경계면의 부드러움을 설정
        // canvas(캔버스) 메소드를 활용하여 반지름크기의 원을 그린다
        canvas.drawCircle(
                canvas.getWidth()/2, // x 좌표
                canvas.getHeight()*3/4, // y 좌표
                canvas.getHeight()/10, // radius
                paint // paint
        );

    }
}
