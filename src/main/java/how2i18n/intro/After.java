package how2i18n.intro;

import java.util.Locale;
import java.util.ResourceBundle;

/*
 * see: http://docs.oracle.com/javase/tutorial/i18n/intro/after.html
 * usage:
 *   $ mvn -q exec:java -Dexec.mainClass=how2i18n.intro.After -Dexec.args="fr FR"
 */
public class After {
	public static void main( String[] args ) {
		String language;
		String country;
		
		if(args.length != 2){
			language = new String("en");
			country = new String("US");
		} else {
			language = new String(args[0]);
			country = new String(args[1]);
		}
		
		Locale currentLocale;
		ResourceBundle messages;
		currentLocale = new Locale(language, country);
		messages = ResourceBundle.getBundle("intro_MessagesBundle",currentLocale);
		try {
			System.out.println(messages.getString("greetings"));
			System.out.println(messages.getString("inquiry"));
			System.out.println(messages.getString("farewell"));
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}
