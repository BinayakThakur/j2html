package standard.text;

import nodes.NodeCreator;

public class PRE extends NodeCreator{
	public PRE() {
		setTag("pre");
	}
	void setPREContent(String content) {
		setContent(content);
	}
}
