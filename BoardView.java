package pub.etti.tictactoe;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class BoardView extends View
{
    private static final int LINE_SIZE = 5;
    private static final int GRID_MARGIN = 20;
    private static final int GRID_STROKE_WIDTH = 15;
    private int width, height, gridW, gridH;
    private Paint gridPaint, oPaint, xPaint;
    private GameEngine gameEngine;


}
