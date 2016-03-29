import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class RWByBufferedCharStream {

	public static void main(String[] args) {
		try {
			
			//File file = new File("java.txt");
			FileInputStream fis = new FileInputStream("java.txt");
			FileOutputStream fos = new FileOutputStream("java_new_buff.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			
			BufferedReader br = new BufferedReader(isr);
		//	BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(osw);
			
			String input;
			int l = 0;
			while((input = br.readLine()) != null){
			//	System.out.println(new String(input,0,l));
			//	bw.write(input);    不会自动换行
				pw.println(input);
			}
			//bw.close();
			br.close();
			pw.flush();
			isr.close();
			fis.close();
			osw.close();
			fos.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
