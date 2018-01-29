package by.tc.task01.dao.util;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SourceApplianceReader {
	private static final SourceApplianceReader instance = new SourceApplianceReader();
	
	
	private SourceApplianceReader() {
		super();
	}

	public static SourceApplianceReader getInstance() {
		return instance;
	}


	public List<String> getAllFileLines() throws IOException {
		String fileName = ConfigurationManager.getProperty("file-name");
		List<String> fileLines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		return fileLines;
		
	}

}

