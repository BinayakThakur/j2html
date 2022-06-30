package standard.text;

import nodes.NodeCreator;

public class Var extends NodeCreator{
	public Var() {
		setTag("var");
	}
	void setVARContent(String content) {
		setContent(content);
	}
}	
