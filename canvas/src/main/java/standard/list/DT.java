package standard.list;

import nodes.NodeCreator;

public class DT  extends NodeCreator{
	public DT() {
		setTag("dt");
	}
	void setDTContent(String content) {
		setContent(content);
	}
}
