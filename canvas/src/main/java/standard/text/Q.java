package standard.text;

import nodes.NodeCreator;

public class Q extends NodeCreator{
	public Q() {
		setTag("q");
	}
	void setQContent(String content) {
		setContent(content);
	}

}
