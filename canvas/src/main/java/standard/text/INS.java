package standard.text;

import nodes.NodeCreator;

public class INS extends NodeCreator{
	public INS() {
		setTag("ins");
	}
	void setINSContent(String content) {
		setContent(content);
	}
}
