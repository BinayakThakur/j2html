package standard.text;

import nodes.NodeCreator;

public class EM extends NodeCreator{
	public EM() {
		setTag("em");
	
	}
	void setEMContent(String content) {
		setContent(content);
	}
}
