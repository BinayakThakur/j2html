package standard.table;

import nodes.NodeCreator;

public class TH extends NodeCreator{
	public TH() {
		setTag("th");
	}
	void setDTContent(String content) {
		setContent(content);
	}
}