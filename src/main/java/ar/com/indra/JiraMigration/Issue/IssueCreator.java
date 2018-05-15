package ar.com.indra.JiraMigration.Issue;

import java.util.ArrayList;
import java.util.List;

import ar.com.indra.JiraMigration.Connection.Connection;
import ar.com.indra.JiraMigration.ParseIssueType.ParseIssueType;
import net.rcarz.jiraclient.Field;
import net.rcarz.jiraclient.Issue;
import net.rcarz.jiraclient.JiraClient;
import net.rcarz.jiraclient.JiraException;

public class IssueCreator {
	
    Connection c; 
    JiraClient jira; 
	List<String> components;
	ParseIssueType parseIssueType;
    
    public IssueCreator() {
    	c = new Connection();
    	jira = c.getJira();
    	components = new ArrayList<String>();
    	components.add("InSanJuan");
    }
	public void createIssues(List<IssueImpl> issuesList) {
		
		for(IssueImpl issueImpl:issuesList) {
			createIssue(issueImpl);
		}
	}
	
	private void createIssue(IssueImpl i) {
        try {
            /* Create a new issue. */
        	
            Issue newIssue = jira.createIssue("CLAMNONCE", (i.getType()))
                .field(Field.SUMMARY, i.getSummary())
                .field(Field.DESCRIPTION, i.getDescription() + "---")
                .field(Field.ASSIGNEE, i.getAssignee())
                .field(Field.COMPONENTS, this.components)
                .field("customfield_10505","Epic Name")
                
                
                .execute();
            System.out.println(newIssue);

            newIssue.transition()
            .field(Field.ASSIGNEE, "desuarez")
            .execute("Open");
            //newIssue.addComment("Segundo comentario para probar cronologia");
            //newIssue.addComment("TERCER COMENTARIO");
            //newIssue.addAttachment(new File("C:\\Users\\RiverPlate\\Desktop\\salida.sql"));
        	
            if(i.getComentarios() != null ) {
            	
            	for(String comentario: i.getComentarios()) {
            		newIssue.addComment(comentario);
            	}
            }
        } catch (JiraException ex) {
            System.err.println(ex.getMessage());

            if (ex.getCause() != null)
                System.err.println(ex.getCause().getMessage());
        }
	}
	

	
	
}
