
// file operate practice

import java.io.*;
class FilePractice{
	public static void main(String[] args) {
		String fileName = "operate_test.txt";

		readFile(fileName);

		String content = "I am learning to study how to operate file in use java";
		writeToFile(fileName, content);

		readFile(fileName);
	}

	public static void writeToFile(String fileName, String content){
		try{
			File file = new File(fileName);

			// create the file if doesn't exists
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
		}
		catch(IOException e){
			System.out.println("IO Problem");
		}
	}

	public static void readFile(String fileName){
		try{
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);

			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
		}
		catch(IOException e){
			System.out.println("IO Problem");
		}
	}
}