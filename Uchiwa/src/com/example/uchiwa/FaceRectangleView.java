package com.example.uchiwa;

import android.content.Context;
import android.graphics.*;
import android.view.View;

public class FaceRectangleView extends View {
	private Rect rect = new Rect(100, 200, 300, 400);
	private Paint paint = new Paint();
	
	public FaceRectangleView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onDraw(Canvas canvas){
		canvas.drawRect(rect, paint);
	}
	
	public void clear(){
		clear();
	}
}
