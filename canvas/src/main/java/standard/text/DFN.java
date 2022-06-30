package standard.text;

import nodes.NodeCreator;

public class DFN extends NodeCreator{
	public DFN() {
		setTag("dfn");
	}
	void setDFNContent(String content) {
		setContent(content);
	}
}
