package com.androidatc.customviewindrawer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by jorgecasariego on 29/6/15.
 */
public class AndroidATCView extends View {
    //Circle and text colors
    private int squareCol, labelColor;
    //Label text
    private String squareText;
    //Paint for drawing custom view
    private Paint squarePaint;

    public AndroidATCView(Context context, AttributeSet attrs) {
        super(context, attrs);

        //Paint object for drawing in onDraw
        squarePaint = new Paint();
        //Get the attributes specified in attrs.xml
        //Using the name you included
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.AndroidATCView,0,0);

        try {
            //Get the text and colors specified using
            //the names in attrs.xml
            squareText = a.getString(R.styleable.AndroidATCView_squareLabel);
            squareCol = a.getInteger(R.styleable.AndroidATCView_squareColor, 0); //0 is default
            labelColor = a.getInteger(R.styleable.AndroidATCView_labelColor,0);
        } finally {
            a.recycle();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {

        //Set the drawing properties
        squarePaint.setStyle(Paint.Style.FILL);
        squarePaint.setAntiAlias(true);

        //Set the paint color using the circle color specified
        squarePaint.setColor(squareCol);

        //draw the square sing the properties defined
        canvas.drawRect(0,0,this.getMeasuredWidth(), this.getMeasuredHeight(),squarePaint);

        //set the text color using the color specified
        squarePaint.setColor(labelColor);

        //Set the properties
        squarePaint.setTextAlign(Paint.Align.CENTER);
        squarePaint.setTextSize(50);

        //Draw the test using the string attribute and chosen properties
        canvas.drawText(squareText, this.getMeasuredWidth()/2, this.getMeasuredHeight()/2, squarePaint);
    }

    public int getSquareCol() {
        return squareCol;
    }

    public int getLabelColor() {
        return labelColor;
    }

    public String getSquareText() {
        return squareText;
    }

    public Paint getSquarePaint() {
        return squarePaint;
    }

    public void setSquareCol(int newColor) {
        //update the instance variable
        this.squareCol = newColor;
        //redraw the view
        invalidate();
        requestLayout();
    }

    public void setLabelColor(int newColor) {
        //Update the instance variable
        this.labelColor = newColor;
        //redraw the view
        invalidate();
        requestLayout();

    }

    public void setSquareText(String newLabel) {
        //Update the instance variable
        this.squareText = newLabel;
        //redraw the view
        invalidate();
        requestLayout();
    }

    public void setSquarePaint(Paint squarePaint) {
        this.squarePaint = squarePaint;
    }
}
