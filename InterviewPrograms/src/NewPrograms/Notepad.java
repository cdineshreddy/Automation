package NewPrograms;
	
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;


	public class Notepad {
		
	public static void main(String[] args) throws Throwable {
			
		
	String testfile="f:\\test.txt";
	File fc=new File(testfile);
	fc.createNewFile();

	FileWriter fw=new FileWriter(testfile);
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write("This is First Line");
	bw.newLine();
	bw.write("This is second line");
	bw.close();
	bw.flush();


	FileReader fr=new FileReader(testfile);
	BufferedReader br=new BufferedReader(fr);
	String content= " ";
		while((content=br.readLine())!=null)
		{
			System.out.println(content);
		}
		br.close();
	}

	}


