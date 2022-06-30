package standard.text;

import nodes.NodeCreator;

public class Strong extends NodeCreator{
	public Strong() {
		setTag("strong");
	}
	void setStrongContent(String content) {
		setContent(content);
	}
}
