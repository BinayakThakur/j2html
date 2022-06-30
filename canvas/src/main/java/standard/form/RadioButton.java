package standard.form;


import nodes.NodeCreatorForm;

public class RadioButton extends NodeCreatorForm{
	public RadioButton(String content,String groupID) {
		setTag("input");
		setType("radio");
		setName(groupID);
		Label label=new Label();
		label.setContent(content);
		setContent(getContent()+label.createPairNode());
	}
	
}
