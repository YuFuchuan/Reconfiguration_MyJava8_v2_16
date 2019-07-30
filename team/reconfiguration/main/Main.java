package team.reconfiguration.main;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import team.reconfiguration.main.MyJava8_v2_16Lexer;
import team.reconfiguration.main.MyJava8_v2_16Parser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		//Window.init();
		
		while(true) {
			
			InputStream is = System.in;
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("输入文件名及其路径:");
			String filePath = br.readLine();
			is = new FileInputStream(filePath);
			
			ANTLRInputStream input = new ANTLRInputStream(is);
			MyJava8_v2_16Lexer lexer = new MyJava8_v2_16Lexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			MyJava8_v2_16Parser parser = new MyJava8_v2_16Parser(tokens);
			
			parser.compilationUnit();
			Rewriter.PrintStringStream();
			
			FileWriter writer;
			try {
				writer = new FileWriter(filePath);
				writer.write("");
				writer.write(Rewriter.all);
				writer.flush();
				writer.close();
				System.out.println("已更新该文件");
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
