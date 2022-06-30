package standard.text;

import nodes.NodeCreator;

public class Del  extends NodeCreator{
	public Del() {
		setTag("del");
	}
	void setDelContent(String content) {
		setContent(content);
	}
}
