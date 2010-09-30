package codeprimate.oic.data;


public interface IData {
	String toString(int length);
	void setSource(ISource source);
	ISource getSource();
}
