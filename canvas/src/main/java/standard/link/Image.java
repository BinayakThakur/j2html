package standard.link;

import nodes.NodeCreator;

public class Image extends NodeCreator{
	public Image() {
		setTag("img");
	}
	public void setImage(String link) {
		setNodeLink(link);
	}
}
