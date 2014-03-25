/**
* @author Andrew Gulla (100395486)
* @section DESCRIPTION
* @version 1.0
* @file LizpSuperListener.java
* This class handles what the grammar does
* and manages the parsing of the tree.
*/
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.misc.NotNull;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class LizpSuperListener extends LizpBaseListener {

	Stack<Double> numStack;
	Stack<String> opStack;
	Map<String, Double> IDmap;

	LizpSuperListener() {
		numStack = new Stack<Double>();
		opStack = new Stack<String>();
		IDmap = new HashMap<String, Double>();
	}

	@Override
    public void exitPrintExpr(@NotNull LizpParser.PrintExprContext ctx) {
       int c = ctx.getChildCount() - 3;
        for (int i = ctx.getChildCount() - 3; i > 0; i--) {
            if (ctx.getChild(i).getText().length() > 2 && ctx.getChild(i).getText().charAt(1) == 's') {
                c--;
            }
        }
        for (int i = numStack.size() - c; i < numStack.size(); i++) {
            System.out.print(numStack.elementAt(i) + " ");
        }
    }
	
	@Override
	public void exitUnaryExpr(@NotNull LizpParser.UnaryExprContext ctx){
		switch (opStack.pop()){
			case "-":
				numStack.push(-numStack.pop());
			break;
			case "abs":
				numStack.push(Math.abs(numStack.pop()));
			break;
			case "ceil":
				numStack.push(Math.ceil(numStack.pop()));
			break;
			case "floor":
				numStack.push(Math.floor(numStack.pop()));
			break;
			case "round":
				numStack.push((double)(Math.round(numStack.pop())));
			break;
		}
	}
	
	@Override
	public void exitUnaryOp(@NotNull LizpParser.UnaryOpContext ctx){
		if(ctx.getChild(0).getText().equals ("-") || ctx.getChild(0).getText().equals ("abs")
                || ctx.getChild(0).getText().equals ("ceil") || ctx.getChild(0).getText().equals ("floor")
                || ctx.getChild(0).getText().equals ("round")){
			opStack.push(ctx.getChild(0).getText());
		}
		else
			error("ERROR: Invalid Operator", 1);
		
	}	

	@Override
	public void exitBinaryExpr(@NotNull LizpParser.BinaryExprContext ctx){
		double x, y;
		y = numStack.pop();
		if (y == 0){
			error("DO NOT DIVIDE BY ZERO", -1);
		}
		x = numStack.pop();
		numStack.push((x/y));
	}

	public void exitBinaryOp(@NotNull LizpParser.BinaryOpContext ctx) {
        if(ctx.getChild(0).getText().equals ("/"))
            opStack.push("/");
        else
            error("ERROR: Invalid Operator", 1);
    }

	@Override
	public void exitNaryExpr(@NotNull LizpParser.NaryExprContext ctx){
		double value = 0.0;
		switch (opStack.pop()){
			case "+":
				for(int i = 0; i < (ctx.getChildCount()-3); i++){
					value += numStack.pop();
				}
			break;
			case "*":
				value += 1;
				for(int i = 0; i < (ctx.getChildCount()-3); i++){
					value *= numStack.pop();
				}
			break;
			case "max":
				value = numStack.pop(); 
				for(int i = 1; i < (ctx.getChildCount()-3); i++){
					if (numStack.peek() > value)
						value = numStack.pop();
					else
						numStack.pop();	
				}
			break;
			case "min":
				value = numStack.pop(); 
				for(int i = 1; i < (ctx.getChildCount()-3); i++){
					if (numStack.peek() < value)
						value = numStack.pop();
					else
						numStack.pop();	
				}
			break;
		}
		numStack.push(value); 
	}

	@Override
	public void exitNaryOp(@NotNull LizpParser.NaryOpContext ctx){
		if (ctx.getChild(0).getText().equals ("min")){
            opStack.push("min");
        }
        else if (ctx.getChild(0).getText().equals ("max")){
            opStack.push("max");
        }
        else if (ctx.getChild(0).getText().equals ("*")){
            opStack.push("*");
        }
        else if (ctx.getChild(0).getText().equals ("+")){
            opStack.push("+");
        }
        else
            error("ERROR: Invalid Operator", 1);
	}

	@Override
	public void exitRelExpr(@NotNull LizpParser.RelExprContext ctx){
		double x,y;
		switch (opStack.pop()){
			case "=":
				y = numStack.pop();
				x = numStack.pop();
				if(x==y)
					numStack.push(1.0);
				else
					numStack.push(0.0);
			break;
			case "/=":
				y = numStack.pop();
				x = numStack.pop();
				if(x!=y)
					numStack.push(1.0);
				else
					numStack.push(0.0);
			break;
			case "<":
				y = numStack.pop();
				x = numStack.pop();
				if(x<y)
					numStack.push(1.0);
				else
					numStack.push(0.0);
			break;
			case ">":
				y = numStack.pop();
				x = numStack.pop();
				if(x>y)
					numStack.push(1.0);
				else
					numStack.push(0.0);
			break;
			case "<=":
				y = numStack.pop();
				x = numStack.pop();
				if(x<=y)
					numStack.push(1.0);
				else
					numStack.push(0.0);
			break;
			case ">=":
				y = numStack.pop();
				x = numStack.pop();
				if(x>=y)
					numStack.push(1.0);
				else
					numStack.push(0.0);
			break;
		}
	}

	@Override
	public void exitRelOp(@NotNull LizpParser.RelOpContext ctx){
		if (ctx.getChild(0).getText().equals ("=")){
            opStack.push("=");
        }
        else if (ctx.getChild(0).getText().equals ("/=")){
            opStack.push("/=");
    	}
        else if (ctx.getChild(0).getText().equals ("<")){
            opStack.push("<");
        }
        else if (ctx.getChild(0).getText().equals (">")){
            opStack.push(">");
        }
        else if (ctx.getChild(0).getText().equals ("<=")){
            opStack.push("<=");
        }
        else if (ctx.getChild(0).getText().equals (">=")){
            opStack.push(">=");
        }
        else{
            error("ERROR: Invalid Operator", 1);
        }
	}

	@Override
	public void exitNotExpr(@NotNull LizpParser.NotExprContext ctx){
		if(numStack.pop() != 0.0)
			numStack.push(0.0);
		else
			numStack.push(1.0);
	}

	@Override
	public void exitAndExpr(@NotNull LizpParser.AndExprContext ctx){
		double value = numStack.pop();
		for(int i = 1; i < (ctx.getChildCount()-3); i++){
			if (numStack.pop() == 0.0)
			value = 0.0;
		}
		numStack.push(value); 
	}

	@Override
	public void exitOrExpr(@NotNull LizpParser.OrExprContext ctx){
		double value = numStack.pop();
		for(int i = 1; i < (ctx.getChildCount()-3); i++){
			if (numStack.peek() != 0.0)
				value = numStack.pop();
			else 
				numStack.pop();
		}
		numStack.push(value); 
	}

	@Override
	public void exitBindExpr(@NotNull LizpParser.BindExprContext ctx){
		IDmap.put(ctx.getChild(2).getText(), numStack.pop());
	}

	@Override
	public void exitIfExpr(@NotNull LizpParser.IfExprContext ctx){
		double first, second, third;
		third = 0.0;
		if (ctx.sExp().size() == 3){
			third = numStack.pop();
		}
		second = numStack.pop();
		first = numStack.pop();

		if (first != 0){
			numStack.push(second);
		}
		else if ((ctx.sExp().size()) == 3){
			numStack.push(third);
		}
	}

	@Override
	public void exitCondExpr(@NotNull LizpParser.CondExprContext ctx){
		double value = 0;
		for(int i = 0; i < (ctx.sExp().size()); i++){
			if(numStack.peek() != 0){
				value = numStack.pop();
			}
			else{
				numStack.pop();
			}
		}
		numStack.push(value);
	}

	@Override
	public void exitAtom(@NotNull LizpParser.AtomContext ctx) {
		double value;
		try { 
            value = Double.parseDouble(ctx.getChild(0).getText());
            numStack.push(value);
        } catch(Exception e){
            if(IDmap.containsKey(ctx.getChild(0).getText())){
            	numStack.push(IDmap.get(ctx.getChild(0).getText()));
            } else{
                error("INVALID ID", 2);
     		}
   		}
    }

    private void error(String text, int code) {
        System.out.println("\tERROR [" + code + "]: " + text);
    }

}