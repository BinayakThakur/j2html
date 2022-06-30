package standard.text;

import nodes.NodeCreator;

public class Code extends NodeCreator{
	public Code() {
		setTag("code");
	}
	void setCodeContent(String content) {
		setContent(content);
	}

}
