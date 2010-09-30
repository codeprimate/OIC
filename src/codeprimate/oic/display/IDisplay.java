package codeprimate.oic.display;

import codeprimate.oic.data.IData;


public interface IDisplay {
	void Draw();
	void setData(IData data);
	IData getData();
	android.graphics.Canvas getCanvas();
	void setCanvas(android.graphics.Canvas canvas);
	void setStrategy(IStrategy strategy);
	IStrategy getStrategy();
}
