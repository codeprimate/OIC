package codeprimate.oic;

import codeprimate.oic.data.ISource;
import codeprimate.oic.data.Source;

public class Data {
	
	private ISource _source;
	
	public Data() {
		_source = new Source();
	}
	
	public Data(ISource source) {
		_source = source;
	}

	public String toString(int length) {
		return _source.toString(length);
	}
}
