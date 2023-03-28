package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

public class DateUtils {

	/** Je peut rien vaire de grand contre les répétitions, java ne prend pas d'arguments avec une valeur part défaut
	 * sans passé part la surcharge. Mais la surcharge est une répétition de code...
	 * Si je force, je perdrais la possibilité de faire appel aux fonction date sans pattern. Es important dans l'application ?
	 * Es triviale ? Je ne sais pas. Il faudrais pratiquer les méthodes agiles pour que j'ai une vue d'ensemble de ce que
	 * je fait et me permettre de prendre la meilleur option.
 	 */

	static SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public static String format(String pattern, Date date) {

		formateur = new SimpleDateFormat(pattern);
		return formateur.format(date);
	}

	public static String formatDefaut(Date date) {

		return formateur.format(date);
	}
}



