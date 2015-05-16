package com.example.uchiwa;

import java.util.List;

import android.app.Activity;
import android.graphics.Canvas;
import android.hardware.Camera;
import android.hardware.Camera.Face;
import android.hardware.Camera.*;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.ImageView;

public class Home extends Activity {

	private Camera faceCamera;
	private FaceRectangleView faceRect;
	
	private SurfaceHolder.Callback surfaceListener = new SurfaceHolder.Callback() {
		
		@Override
		public void surfaceDestroyed(SurfaceHolder holder) {
			faceCamera.release();
			faceCamera = null;
		}
		
		@Override
		public void surfaceCreated(SurfaceHolder holder) {
			faceCamera = Camera.open(CameraInfo.CAMERA_FACING_FRONT);
			try{
				faceCamera.setPreviewDisplay(holder);
			} catch(Exception e){
				e.printStackTrace();
			}

		}
		
		@Override
		public void surfaceChanged(SurfaceHolder holder, int format, int width,
				int height) {
			setCameraPreviewSize(faceCamera, width, height);
			faceCamera.startPreview();
			faceCamera.setFaceDetectionListener(new FaceDetectionListener(){

				@Override
				public void onFaceDetection(Face[] faces, Camera camera) {
					Log.d("TAG", "faces count: " + faces.length);
					for(Face face : faces){
						Log.d("TAG", "face id: " + face.id);
						faceDetect(face);
					}
				}
				
			}
			);
			
			try{
				faceCamera.startFaceDetection();
			} catch (IllegalArgumentException e) {
                Log.e("TAG", "IllegalArgumentException.");
            } catch (RuntimeException e) {
                Log.e("TAG", "the method fails or the face detection is already running.");
            }
		}
	};
	
	private void faceDetect(Face face){
		//faceRect.clear();
		if(face.id == -1){
			//return;
		}
		if(face.score >= 50){
			Log.d("TAG", "face detected!");
			//faceRect.draw();
		}
		
	}
	
	protected void setCameraPreviewSize(Camera camera, int width, int height) {
		Camera.Parameters params = camera.getParameters();
		List<Camera.Size> supported = params.getSupportedPreviewSizes();
		if (supported != null) {
			for (Camera.Size size : supported) {
				if (size.width <= width && size.height <= height) {
					params.setPreviewSize(size.width, size.height);
					camera.setParameters(params);

					break;
				}
			}
		}
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		faceRect = new FaceRectangleView(getApplication());
		setContentView(R.layout.activity_home);
		
		ImageView imView = (ImageView) findViewById(R.id.imageView1);
		SurfaceView mySurfaceView = (SurfaceView) findViewById(R.id.surfaceView1);
		
		SurfaceHolder holder = mySurfaceView.getHolder();
		
		holder.addCallback(surfaceListener);
		
	}
	
}
