package standard.text;

import nodes.NodeCreator;

public class KBD extends NodeCreator{
	public KBD() {
		setTag("ins");
	}
	void setKBDContent(String content) {
		setContent(content);
	}
}
