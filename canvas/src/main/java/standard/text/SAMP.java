package standard.text;

import nodes.NodeCreator;

public class SAMP extends NodeCreator{
	public SAMP() {
		setTag("samp");
	}
	void setSAMPContent(String content) {
		setContent(content);
	}
}
