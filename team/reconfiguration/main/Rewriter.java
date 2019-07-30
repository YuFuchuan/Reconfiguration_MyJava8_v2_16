package team.reconfiguration.main;

public class Rewriter {
	public static String all = "";
	
	public static void PrintStringStream() {
		all = "";
		PrintStringStreamPart(MyJava8_v2_16Parser.mark.get("enterPackageDeclaration"), MyJava8_v2_16Parser.mark.get("exitPackageDeclaration"));
		PrintStringStreamPart(MyJava8_v2_16Parser.mark.get("enterImportDeclaration"), MyJava8_v2_16Parser.mark.get("exitImportDeclaration"));
		PrintStringStreamPart(MyJava8_v2_16Parser.mark.get("enterTypeDeclaration"), MyJava8_v2_16Parser.mark.get("exitTypeDeclaration"));
	}
	
	public static void PrintStringStreamPart(int enter,int exit) {
		for(int i = enter; i < exit; i++) {
	    	if(!(MyJava8_v2_16Parser.code.get(i) == "//" ||
	    		(MyJava8_v2_16Parser.code.get(i) == " " && MyJava8_v2_16Parser.code.get(i-1) == " ") ||
	    		(MyJava8_v2_16Parser.code.get(i) == " " && MyJava8_v2_16Parser.code.get(i+1) == "\n") ||
	    		(MyJava8_v2_16Parser.code.get(i) == " " && MyJava8_v2_16Parser.code.get(i-1) == ".") ||
	    		(MyJava8_v2_16Parser.code.get(i) == " " && MyJava8_v2_16Parser.code.get(i-1) == "::") ||
	    		(MyJava8_v2_16Parser.code.get(i) == " " && MyJava8_v2_16Parser.code.get(i+1) == ".") ||
	    		(MyJava8_v2_16Parser.code.get(i) == " " && MyJava8_v2_16Parser.code.get(i+1) == "::") ||
	    		(MyJava8_v2_16Parser.code.get(i) == " " && MyJava8_v2_16Parser.code.get(i+1) == "(") ||
	    		(MyJava8_v2_16Parser.code.get(i) == " " && MyJava8_v2_16Parser.code.get(i-1) == "(") ||
	    		(MyJava8_v2_16Parser.code.get(i) == " " && MyJava8_v2_16Parser.code.get(i+1) == ")") ||
	    		(MyJava8_v2_16Parser.code.get(i) == "." && MyJava8_v2_16Parser.code.get(i-1) == ".") ||
	    		(MyJava8_v2_16Parser.code.get(i) == "." && MyJava8_v2_16Parser.code.get(i+1) == "\n") ||
	    		(MyJava8_v2_16Parser.code.get(i) == " " && MyJava8_v2_16Parser.code.get(i-1) == "@") ||
	    		(MyJava8_v2_16Parser.code.get(i) == " " && MyJava8_v2_16Parser.code.get(i+1) == "@") ||
	    		(MyJava8_v2_16Parser.code.get(i) == "\n" && MyJava8_v2_16Parser.code.get(i-1) == "(" && MyJava8_v2_16Parser.code.get(i+1) == "(") ||
	    		(MyJava8_v2_16Parser.code.get(i) == "\n" && MyJava8_v2_16Parser.code.get(i-1) == "(" && MyJava8_v2_16Parser.code.get(i+1) == ")") ||
	    		(MyJava8_v2_16Parser.code.get(i) == "\n" && MyJava8_v2_16Parser.code.get(i-1) == ")" && MyJava8_v2_16Parser.code.get(i+1) == ")") 
	    	)) {
	    		if(MyJava8_v2_16Parser.code.get(i)!="\n") {
	    			System.out.print(MyJava8_v2_16Parser.code.get(i));
	    			all += MyJava8_v2_16Parser.code.get(i);
	    		}
	    		else {
	    			int indent=0;
    	    		
	    			System.out.print("\n");
	    			all += "\n";
	    			if(MyJava8_v2_16Parser.code.get(i+1)=="/**/") {
	    				i += 2;
	    				System.out.print(MyJava8_v2_16Parser.code.get(i));
	    				all += MyJava8_v2_16Parser.code.get(i);
	    			}
	    			else {
		    			for(int j=0;j<i;j++) {
		    				if(MyJava8_v2_16Parser.code.get(j)=="{") {
		    					indent++;
		    				}
		    				else if(MyJava8_v2_16Parser.code.get(j)=="}") {
		    					indent--;
		    				}
		    			}
		    			if(MyJava8_v2_16Parser.code.get(i+1)=="}") {
		    				indent--;
		    			}
		    			while(indent>0) {
		    				indent--;
		    				System.out.print("    ");
		    				all += "    ";
		    			}
	    			}
	    		}
	    	}
		}
		System.out.print("\n");
		all += "\n";
	}
}
