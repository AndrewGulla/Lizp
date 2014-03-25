/**
* @author Andrew Gulla (100395486)
* @section DESCRIPTION
* @version 1.0
* @file Lizp.java
* This program initializes the parsing
* of the language and inputs default.txt
*/
package uoit;

import java.io.FileInputStream;
import java.io.InputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Lizp {

	public static void main(String[] args) throws Exception {
		String inFile=null;

		if(args.length>0)
			inFile=args[0];
		else
			inFile = "default.txt";

		InputStream inStream = new FileInputStream(inFile);
		LizpLexer lexer = new LizpLexer(new ANTLRFileStream(inFile));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		LizpParser parser = new LizpParser(tokens);

		ParserRuleContext tree = parser.program();
		tree.inspect(parser);
		LizpSuperListener lsl = new LizpSuperListener();
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(lsl, tree);
	}
}