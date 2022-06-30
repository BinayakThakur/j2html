package custom.tags;

import java.util.Arrays;

import standard.form.Form;
import standard.form.InputBox;
import standard.form.Label;
import standard.form.SubmitButton;
import standard.list.StandardList;
import standard.text.BR;
import standard.text.Heading;
import standard.text.Paragraph;
import standard.text.Q;
import structure.Brush;

public class CustomForm extends Brush{
	public void styleExample() {
		String body="";
		Heading head=new Heading("h1");
		head.setContent("Inline style in HTML");
		head.setStyle("h1-style");
		addNode(head.createPairNode());
		StandardList list=new StandardList();
		list.changeToUnorderedList();
		Arrays.asList("Example1","Example2","Example3").forEach(list::addItem);
		list.setStyle("ul-style");
		addNode(list.createPairNode());
		head.setTag("h1");
		head.setContent("HTML In-Line Style");
		addNode(head.createPairNode());
		Paragraph p=new Paragraph();
		Q q=new Q();
		q.setStyle("coral");
		q.setContent("EARTH MOON STARS AND WHOLE UNIVERSE");
		p.setContent(q.createPairNode());
		addNode(q.createPairNode());
		
		
		
	}
	
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
		submit.setStyle("green");
		submit.setAction("/Hello.html");
		form.setContent(fname.createPairNode()+inputFname.createPairNode()+br.createPairNode()+lname.createPairNode()+inputLname.createPairNode()+br.createPairNode()+submit.createPairNode());
		addNode(head.createPairNode());
		addNode(form.createPairNode());
		Paragraph para=new Paragraph();
		para.setContent("Click submit to send data to Hello");
		
	}	
		
	
}
