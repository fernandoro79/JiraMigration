package ar.com.indra.JiraMigration.ParseIssueType;

public class ParseIssueType {
	
	public String parseId (int id){
		String idParsed;
		switch(id) {
		case 8:
			idParsed = "Functional Support";
			break;
		case 10000:
			idParsed = "Big Feature Request";
			break;
		case 7:
			idParsed = "Corrective Maintenance";
			break;
		case 9:
			idParsed = "Feature Request";
			break;
		case 10201:
			idParsed = "Planned Corrective Maintenance";
			break;
		case 10202:
			idParsed = "Planned Funtional Support";
			break;
		case 11:
			idParsed = "Epic";
			break;
		default:
			idParsed = "Functional Support";
			break;	
		}
		return idParsed;
		
	}
}

