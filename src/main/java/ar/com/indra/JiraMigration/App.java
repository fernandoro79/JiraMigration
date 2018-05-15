package ar.com.indra.JiraMigration;

import java.util.ArrayList;

import ar.com.indra.JiraMigration.Connection.Connection;
import ar.com.indra.JiraMigration.Issue.IssueCreator;
import ar.com.indra.JiraMigration.Issue.IssueImpl;
import net.rcarz.jiraclient.Field;
import net.rcarz.jiraclient.Issue;
import net.rcarz.jiraclient.JiraClient;
import net.rcarz.jiraclient.JiraException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws JiraException {

		IssueImpl newIssue = new IssueImpl();
		newIssue.setSummary("Prueba automatizada");
		newIssue.setType("Epic");
		newIssue.setAssignee("desuarez");

		IssueImpl newIssue2 = new IssueImpl();
		newIssue2.setSummary("Prueba de segunda issue automatizada");
		newIssue2.setType("Functional Support");
		newIssue2.setAssignee("desuarez");

		ArrayList<IssueImpl> issues = new ArrayList<IssueImpl>();
		issues.add(newIssue);
		//issues.add(newIssue2);

		IssueCreator creator = new IssueCreator();
		 creator.createIssues(issues);
		
		/*
		 * Connection c = new Connection(); JiraClient jira = c.getJira();
		 * ArrayList<String> componentes = new ArrayList();
		 * componentes.add("InSanJuan"); componentes.add("InRosario"); try { // Create a
		 * new issue
		 * 
		 * Issue newIssue = jira.createIssue("CLAMNONCE",
		 * "Planned Corrective Maintenance") .field(Field.SUMMARY,
		 * "TEST TYPE ISSUE BIG FEAT ") .field(Field.DESCRIPTION,
		 * "PRUEBA PARA CERAR DISTINTAS ISSUES...") .field(Field.ASSIGNEE, "desuarez")
		 * .field(Field.COMPONENTS, componentes) .execute();
		 * System.out.println(newIssue);
		 * newIssue.addComment("COMENTARIO DE PRUEBA... ");
		 * newIssue.addComment("Segundo comentario para probar cronologia");
		 * newIssue.addComment("TERCER COMENTARIO"); //newIssue.addAttachment(new
		 * File("C:\\Users\\RiverPlate\\Desktop\\salida.sql")); // Retrieve issue
		 * TEST-123 from JIRA. We'll get an exception if this fails.
		 * System.out.println("ACÁ TERMINA LA ISSUE"); final Issue issue =
		 * jira.getIssue("TABAM-12880");
		 * 
		 * } catch (JiraException ex) { System.err.println(ex.getMessage());
		 * 
		 * if (ex.getCause() != null) System.err.println(ex.getCause().getMessage()); }
		 */
	}
}