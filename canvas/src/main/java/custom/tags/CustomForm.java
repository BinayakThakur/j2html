package custom.tags;

import standard.form.Form;
import standard.form.InputBox;
import standard.form.Label;
import standard.form.SubmitButton;
import standard.text.BR;
import standard.text.Heading;
import standard.text.Paragraph;
import structure.Brush;

public class CustomForm extends Brush{
	
	public void createForm() {
		
		Heading head=new Heading("h2");
		head.setContent("HTML Forms");
		Form form =new Form();
		Label fname=new Label();
		fname.setContent("First name:");
		InputBox inputFname=new InputBox();
		inputFname.setType("text");
		BR br=new BR();
		br.setContent ("");
		Label lname=new Label();
		lname.setContent("Last name:");
		InputBox inputLname=new InputBox();
		inputLname.setType("text");
		
		SubmitButton submit=new SubmitButton();
		submit.setAction("/Hello.html");
		form.setContent(fname.createPairNode()+inputFname.createPairNode()+br.createPairNode()+lname.createPairNode()+inputLname.createPairNode()+br.createPairNode()+submit.createPairNode());
		addNode(head.createPairNode());
		addNode(form.createPairNode());
		Paragraph para=new Paragraph();
		para.setContent("Click submit to send data to Hello");
		
		
		
	}
}
