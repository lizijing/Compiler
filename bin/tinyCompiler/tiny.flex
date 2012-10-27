import java_cup.runtime

%%
%public
%class TinyLexer
%line
%column
%cup
%cupdebug

%{
	StringBuffer string = new StringBuffer();

	private Symbol symbol(int type){
	return new Symbol(type,yyline,yycolumn);
	}
	private Symbol symbol(int type,Object value){
	return new Symbol(type,yyline,yycolumn,value);
	}
%}

digit = [0-9]
number = {digit}+
letter = [a-zA-Z]
identifier = {letter}+
newline = \n
whitespace =[ \t]+
operator = "+"|"-"|"*"|"/"|"<"|"="|":="|"("|")"
reservedword = "if"|"then"|"else"|"end"|"repeat"|"until"|"read"|"write"
separator = ";"

%%

{whitespace} {}
{reservedword} {System.out.print("ReservedWord:"+yytext)()+"\n"}
{operator} {System.out.print("Operator:"+yytext()+"\n")}
{number} {
	int n=Integer.pareInt(yytext());
	System.out.print("Number:"+n+"\n");
}
{identifier} {System.out.print("Identifier:"+yytext()+"\n")}
{separator} {System.out.print("Separator:"+yytext()+"\n")}
{newline} {}