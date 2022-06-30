package standard.list;

import nodes.NodeCreator;

public class DD extends NodeCreator{
	public DD() {
		setTag("dd");
	}
	void setDTContent(String content) {
		setContent(content);
	}
}
