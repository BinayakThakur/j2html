package standard.text;

import nodes.NodeCreator;

public class BDO extends NodeCreator{
	public BDO() {
		setTag("bdo");
	}
	void setBDOContent(String content) {
		setContent(content);
	}
}
