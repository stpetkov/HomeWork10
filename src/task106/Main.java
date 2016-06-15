package task106;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}

			String everything = sb.toString();
			System.out.print(everything);
			FileWriter writer = new FileWriter("newfile.txt");
			String[] da = everything.split("[ .?,!]");
			for (int i = 0; i < da.length; i++) {
				writer.write(da[i] + " ");
				writer.flush();
			}
			writer.write("Това ви е задачата бре");
			writer.close();
		} finally {
			br.close();
		}

	}

}
