package codeprimate.oic;

import android.graphics.Canvas;
import codeprimate.oic.Display;
import codeprimate.oic.data.IData;
import codeprimate.oic.display.IDisplay;
import codeprimate.oic.display.IStrategy;

public class Display implements IDisplay {
	
	private IData _data;
	private Canvas _canvas;
	private IStrategy _strategy;
	
	public Display(Canvas canvas, IData data, IStrategy strategy) {
		_data = data;
		_canvas = canvas;
		_strategy = strategy;
	}
	
	public Canvas getCanvas() {
		return _canvas;
	}
	
	public void setCanvas(Canvas canvas) {
		_canvas = canvas;
	}
	
	public void setData(IData data){
		_data = data;
	}
	
	public IData getData(){
		return _data;
	}
	
	public void setStrategy(IStrategy strategy) {
		_strategy = strategy;
	}
	
	public IStrategy getStrategy() {
		return _strategy;
	}
	
	// TODO: draw stuff on the canvas
	public void Draw() {
		
	}
}
