package nodes;

public class NodeCreator{
	String Tag="";
	String content="";
	String layout="";
	String styleID="";
	String style="";
	String href="";
	public String createPairNode(){
		if(Tag.equals("img")) {
			return "<"+this.Tag+" "+"src ="+href+"/>";
		}
		if(href.length()>0) {
			return "<"+this.Tag+" "+"href ="+href+">"+ this.content   + "</"+this.Tag+">";
		}
		return "<"+this.Tag+">"+ this.content   + "</"+this.Tag+">";
	}
	public void setTag(String tag) {
			this.Tag=tag;
	}
	public void setContent(String content) {
		this.content=content;
	}
	public void setNodeLink(String href) {
		this.href=href;
	}
	public String getContent() {
		return content;
	}
	
}
