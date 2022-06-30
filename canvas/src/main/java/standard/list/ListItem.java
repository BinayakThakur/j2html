package standard.list;

import nodes.NodeCreator;

public class ListItem extends NodeCreator{
	public ListItem() {
		setTag("li");
	}
	void setListItemContent(String content) {
		setContent(content);
	}
}
