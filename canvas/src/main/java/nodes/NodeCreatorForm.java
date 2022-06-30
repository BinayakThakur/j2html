package nodes;

import custom.processor.CSSLoader;

public class NodeCreatorForm extends CSSLoader{
	String Tag="";
	String content="";
	String layout="";
	String styleID="";
	String style="";
	String href="";
	String type="";
	String placeholder="";
	String label="";
	String name="";
	String value="";
	String action="";
	public String createPairNode(){
		return "<"+this.Tag+placeholder+style+type+name+value+action+" >"+ this.content   + "</"+this.Tag+">";
	}
	public void setType(String type) {
		this.type=" type="+type;
	}
	public void setTag(String tag) {
			this.Tag=tag;
	}
	public void setName(String name) {
		this.name=" name="+name;
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
	public void setPlaceholder(String place) {
		this.placeholder=" placeholder="+place;
		
	}
	public void setLabel(String label) {
		this.label=" label="+label;
	}
	public void setValue(String value) {
		this.value=" value="+value;
	}
	public void setAction(String action) {
		this.action=" action="+action;
	}
	public String getValue() {
		return this.value;
	}
	public void setStyle(String styleClass) {
		this.style=" style='"+getProperty(styleClass)+"' ";
	}
	
}
