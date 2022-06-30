package standard.table;

import nodes.NodeCreator;

public class TR extends NodeCreator{
	public TR() {
		setTag("tr");
	}
	void setDTContent(String content) {
		setContent(content);
	}
}