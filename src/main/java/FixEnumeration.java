import com.opencsv.*;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FixEnumeration {
	public static void main(String[] args) {
		try {
			CSVReader csvReader = new CSVReaderBuilder(new FileReader("English Grammar.csv")).withCSVParser(new CSVParserBuilder().withSeparator(';').build()).build();
			List<String[]> strings = csvReader.readAll();
			csvReader.close();

			ICSVWriter csvWriter = new CSVWriterBuilder(new FileWriter("English Grammar.csv")).withSeparator(';').build();
			for (int i = 0; i < strings.size(); i++) {
				String s = strings.get(i)[0];
				if (s.matches("\\d+")) {
					int x = Integer.parseInt(s);
					if (x != i + 1) {
						strings.get(i)[0] = String.valueOf(i + 1);
					}
				}
			}
			csvWriter.writeAll(strings, false);
			csvWriter.close();
		} catch (IOException | CsvException e) {
			e.printStackTrace();
		}
	}
}
