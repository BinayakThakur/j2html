package standard.text;

import nodes.NodeCreator;

public class BR  extends NodeCreator{
	public BR() {
		setTag("br");
	}
	void setINSContent(String content) {
		setContent(content);
	}
}