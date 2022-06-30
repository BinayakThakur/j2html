package standard.form;

import java.util.List;

public class RadioGroup {
	StringBuilder group=new StringBuilder("");
	public RadioGroup(List<String> items,String group) {
		for(String item:items) {
			this.group.append((new RadioButton(item, group)).createPairNode());
		}
	}
	public void addItem(String item,String groupID) {
		this.group.append((new RadioButton(item, groupID)).createPairNode());
	}
	public String createRadioGroup() {
		return group.toString();
	}
}
