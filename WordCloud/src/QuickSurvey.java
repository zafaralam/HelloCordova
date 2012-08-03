import org.mcavallo.opencloud.Cloud;
import org.mcavallo.opencloud.Tag;

public class QuickSurvey {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cloud cloud = new Cloud();
		cloud.setMaxWeight(38.0);
		
		Tag tag = new Tag("Google", "http://www.google.com"); // creates a tag 
		cloud.addTag(tag); 
		
		cloud.tags();
		
	}

}
