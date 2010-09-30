package codeprimate.oic.display;

import android.graphics.Canvas;
import codeprimate.oic.data.IData;

public interface IStrategy {
	Canvas Process(Canvas canvas, IData data);
}
