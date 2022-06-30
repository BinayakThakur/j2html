package standard.table;

import nodes.NodeCreator;

public class TD extends NodeCreator{
	public TD() {
		setTag("td");
	}
	void setDTContent(String content) {
		setContent(content);
	}
}