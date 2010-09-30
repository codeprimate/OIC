package codeprimate.oic.data;

import android.text.format.Time;

public class Source implements ISource {
	public String toString(int length) {
		Time now = new Time();
		String timeStr = String.format("%02d%02d", now.hour, now.minute);
		return timeStr;
	}
	
	public byte[] toByte(int length) {
		return toString(length).getBytes();
	}
}
