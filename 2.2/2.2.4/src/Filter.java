import java.io.File;
import java.io.FilenameFilter;

public class Filter implements FilenameFilter{
	String extension=".java";



	@Override
	public boolean accept(File dir, String filenamefilter) {
		return filenamefilter.endsWith(extension);
		}
	}
	
	
	
	


