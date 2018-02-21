package parser;

import beaver.*;
import java.util.ArrayList;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "parser.beaver".
 */
public class Parser extends beaver.Parser {
	static public class Terminals {
		static public final short EOF = 0;
		static public final short ID = 1;
		static public final short LBRACKET = 2;
		static public final short LPAREN = 3;
		static public final short MINUS = 4;
		static public final short STRING_LITERAL = 5;
		static public final short INT_LITERAL = 6;
		static public final short TRUE = 7;
		static public final short FALSE = 8;
		static public final short RCURLY = 9;
		static public final short RPAREN = 10;
		static public final short VOID = 11;
		static public final short BOOLEAN = 12;
		static public final short INT = 13;
		static public final short LCURLY = 14;
		static public final short IF = 15;
		static public final short WHILE = 16;
		static public final short BREAK = 17;
		static public final short RETURN = 18;
		static public final short SEMICOLON = 19;
		static public final short RBRACKET = 20;
		static public final short EQL = 21;
		static public final short ELSE = 22;
		static public final short IMPORT = 23;
		static public final short PUBLIC = 24;
		static public final short COMMA = 25;
		static public final short PLUS = 26;
		static public final short TIMES = 27;
		static public final short DIV = 28;
		static public final short MOD = 29;
		static public final short TYPE = 30;
		static public final short MODULE = 31;
		static public final short EQEQ = 32;
		static public final short NEQ = 33;
		static public final short LT = 34;
		static public final short LEQ = 35;
		static public final short GT = 36;
		static public final short GEQ = 37;
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9p5M6TmLKKK$kvzIO18DGGC2WX22YKn1H9H8Pqac8I02X91iQ0IH514HQMe21Q8GTGVoem" +
		"pQi0MfHTfTaHZnnB5tXis50iUlxjlarpkko$tlOc3B$FjERkdxExPlMVF133tu4mCnpYKO2" +
		"8cOJBEmNZau3ASX9FH6vVZIdJ3KOX33noDOz0JlMGVPgDhs5O$u2fqzxJgVwWLzKSvzFDWu" +
		"hXM#ocGxt4DuZtz30pmqxB#u33rZmzJVuX3$sgSYmjHXBDmDgRW0lbLxiTSpCDyz4K2KZ4K" +
		"MO4wy7dgl8s847Hgl7Hm2jfu#X6CyFJJIVxor3aICG4wRl4yLSMpt64TAG#Z6cDTBOOfYux" +
		"g169bFoh2y7ii#k04d1w6nHcOW4gSvsgHf2pS9Eb19Tb19QL19HUvhipPd#QfuTzBFta7LU" +
		"gB6ur43C35c8vBC0CpSMc0nKZ7b#gK5tl8m#rtm22ai9s6A2IZBTgXCzje787skbsepdrH4" +
		"rsCAgGXG$xqtpRvND#wwx20Ouj8Rq0NB4M#V8fCd8YRjFmsZbKZ7uNyAd9HXkiPZJ7o2Fkd" +
		"uNnCnIpv0bTWZdo66t4jRiQjk0NBi0JMxtQYXlagWV5BOWG7SjM3kTuKPf1KhYOT6SmDGpb" +
		"V5c$RCCvgdP$1N9bzcApSz7lpj5hlnrhFV#7d$zMtTk5ZLetaFMkZxjaOTRiwCAzqufthml" +
		"mLg6E4eDCn19tkdZecjRnqW5XF7IC4Fz4kQmuUJwTr7kqBcBEyJg0T$oh2y6lm$HZTeb#dX" +
		"VyLRidYS4a2zt9eFy9JmxyNAsOzjCp7E5klLr$MM$rOKJajdAi9LnvkVmHhocvi8vX3ovWr" +
		"yoajv4imYldKt$hFtMYYCToBjOl66ncjwKZcV#lRicWfAweSIcBurqlBypXMmD5Shg2SjMw" +
		"SyXBDVXnxbcuqgSKPR0skCDQQJVYpMdvjmFBvAd4p0m07Y8E04GMOpEH6F95DVWLfYQNN28" +
		"ujurW5wKBYJl8JY74Kx2LTgdtk8rzjjtE2yZfYXUOD#ahKV0pv92A3V2rfCcb$qgcacQHLM" +
		"gzOh#SkyZj8QqWhzTZTchRNz1x7t8CurbNBueYUn3o2ynYFaWxNiZBRlZSIauYLkh#5kdD8" +
		"r#d#Uc8LCSLc4zDI31nndKxKESPc4vj3j5$jfzRPcciqdqP#hPQd4njSx9uWxYEiM6ydTcd" +
		"RELg#czX4F4zijTbjqxIUsD4yZZkQUNM7icqsUO7p6vDjyecDF2zgWutV7qeCR6leRECpR7" +
		"FLwh7ncixWd9cQNspJqp73lS7MwhAFdNeFLMmI$MV7Bzv$XdsqBDLXK#$e5xdudTNCctD3Z" +
		"u6nn6Mi8LJxre9h3Hgh8Fep0yUm7Fed1#L7HTdA7t90VeVZ9x#fzcFvI3wK3sIll2$lgP46" +
		"rRuReF#clCLsJrF$3U9rUKLU8trLwkKbMKVkHU6zb#S8vXZXjo8RPBqb8RTBTYlAZ24F4W$" +
		"92x9TDiicsIXRPAsiaTNok3mcTKfhbTJA0ufRATjagpmhpyZJyfGyAJivzhAIVANQhos$yg" +
		"Ly9z$ADxOLVqByqjJxMNvYLFvH$DziAbclHQd$FkInLy0N8PzyFlb2vlv6bF1ToLRrC$WYH" +
		"V26Hl75CWZmLJAQa6734FfgH2dxfTGj8b#aNYYJbQGH59dKooAALOrilJPj#JQQ15XvHhBs" +
		"D5bzcgnhB81rgCcAmL18fLq2gOL4hjMg8j8uLaxgXXJAKaXpD9BPjwhpN1lYwJ#UDAa53E1" +
		"S5QHyvLWx#GY35OAF5OAFTOAXCFPVspYVuG==");

	static final Action RETURN6 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 6];
		}
	};

	static final Action RETURN2 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 2];
		}
	};

	static final Action RETURN3 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 3];
		}
	};

	static final Action RETURN9 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 9];
		}
	};

	static final Action RETURN4 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 4];
		}
	};

	static final Action RETURN8 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 8];
		}
	};

	static final Action RETURN5 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 5];
		}
	};

	// turn off automated error recovery
	@Override
	protected void recoverFromError(Symbol token, TokenStream in) throws java.io.IOException, Exception {
		super.recoverFromError(new Symbol(0), in);
	}

	private final Action[] actions;

	public Parser() {
		super(PARSING_TABLES);
		actions = new Action[] {
			RETURN6,	// [0] Module = MODULE ID LCURLY Imports Declarations RCURLY; returns 'RCURLY' although none is marked
			RETURN2,	// [1] Imports = Import Imports; returns 'Imports' although none is marked
			Action.NONE,  	// [2] Imports = 
			RETURN3,	// [3] Import = IMPORT ID SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN2,	// [4] Declarations = Declaration Declarations; returns 'Declarations' although none is marked
			Action.NONE,  	// [5] Declarations = 
			Action.RETURN,	// [6] Declaration = FuncDeclaration
			Action.RETURN,	// [7] Declaration = FieldDeclaration
			Action.RETURN,	// [8] Declaration = TypeDeclaration
			RETURN9,	// [9] FuncDeclaration = AccessibilitySpecifier TypeName ID LPAREN ParameterList RPAREN LCURLY StatementLists RCURLY; returns 'RCURLY' although none is marked
			RETURN2,	// [10] StatementLists = Statement StatementLists; returns 'StatementLists' although none is marked
			Action.NONE,  	// [11] StatementLists = 
			RETURN4,	// [12] FieldDeclaration = AccessibilitySpecifier TypeName ID SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN6,	// [13] TypeDeclaration = AccessibilitySpecifier TYPE ID EQL STRING_LITERAL SEMICOLON; returns 'SEMICOLON' although none is marked
			Action.RETURN,	// [14] AccessibilitySpecifier = PUBLIC
			Action.NONE,  	// [15] AccessibilitySpecifier = 
			Action.RETURN,	// [16] TypeName = PrimitiveType
			Action.RETURN,	// [17] TypeName = ArrayType
			Action.RETURN,	// [18] TypeName = ID
			Action.RETURN,	// [19] PrimitiveType = VOID
			Action.RETURN,	// [20] PrimitiveType = BOOLEAN
			Action.RETURN,	// [21] PrimitiveType = INT
			RETURN3,	// [22] ArrayType = ArrayType LBRACKET RBRACKET; returns 'RBRACKET' although none is marked
			RETURN3,	// [23] ArrayType = PrimitiveType LBRACKET RBRACKET; returns 'RBRACKET' although none is marked
			RETURN3,	// [24] ArrayType = ID LBRACKET RBRACKET; returns 'RBRACKET' although none is marked
			Action.RETURN,	// [25] ParameterList = NonEmptyParameterList
			Action.NONE,  	// [26] ParameterList = 
			RETURN3,	// [27] NonEmptyParameterList = Parameter COMMA NonEmptyParameterList; returns 'NonEmptyParameterList' although none is marked
			Action.RETURN,	// [28] NonEmptyParameterList = Parameter
			RETURN2,	// [29] Parameter = TypeName ID; returns 'ID' although none is marked
			Action.RETURN,	// [30] Statement = Localvardeclaration
			Action.RETURN,	// [31] Statement = BlockStatement
			Action.RETURN,	// [32] Statement = IfStatement
			Action.RETURN,	// [33] Statement = WhileStatement
			Action.RETURN,	// [34] Statement = BreakStatement
			Action.RETURN,	// [35] Statement = ReturnStatement
			Action.RETURN,	// [36] Statement = ExpressionStatement
			RETURN3,	// [37] Localvardeclaration = TypeName ID SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN3,	// [38] BlockStatement = LCURLY StatementList RCURLY; returns 'RCURLY' although none is marked
			RETURN2,	// [39] StatementList = Statement StatementList; returns 'StatementList' although none is marked
			Action.NONE,  	// [40] StatementList = 
			RETURN8,	// [41] IfStatement = IF LPAREN Expression RPAREN Statement ELSE Statement IfTail; returns 'IfTail' although none is marked
			RETURN2,	// [42] IfTail = ELSE Statement; returns 'Statement' although none is marked
			Action.NONE,  	// [43] IfTail = 
			RETURN5,	// [44] WhileStatement = WHILE LPAREN Expression RPAREN Statement; returns 'Statement' although none is marked
			RETURN2,	// [45] BreakStatement = BREAK SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN2,	// [46] ReturnStatement = RETURN ReturnTail; returns 'ReturnTail' although none is marked
			RETURN2,	// [47] ReturnTail = Expression SEMICOLON; returns 'SEMICOLON' although none is marked
			Action.NONE,  	// [48] ReturnTail = 
			RETURN2,	// [49] ExpressionStatement = Expression SEMICOLON; returns 'SEMICOLON' although none is marked
			Action.RETURN,	// [50] Expression = Assignment
			Action.RETURN,	// [51] Expression = RHSExpression
			RETURN3,	// [52] Assignment = LHSExpression EQL Expression; returns 'Expression' although none is marked
			Action.RETURN,	// [53] LHSExpression = ID
			Action.RETURN,	// [54] LHSExpression = ArrayAccess
			RETURN4,	// [55] ArrayAccess = LHSExpression LBRACKET Expression RBRACKET; returns 'RBRACKET' although none is marked
			Action.RETURN,	// [56] RHSExpression = ArithmeticExpression
			RETURN3,	// [57] RHSExpression = ArithmeticExpression ComparisonOperator ArithmeticExpression; returns 'ArithmeticExpression' although none is marked
			Action.RETURN,	// [58] ComparisonOperator = EQEQ
			Action.RETURN,	// [59] ComparisonOperator = NEQ
			Action.RETURN,	// [60] ComparisonOperator = LT
			Action.RETURN,	// [61] ComparisonOperator = LEQ
			Action.RETURN,	// [62] ComparisonOperator = GT
			Action.RETURN,	// [63] ComparisonOperator = GEQ
			new Action() {	// [64] ArithmeticExpression = ArithmeticExpression AdditiveOperator Term
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 3]); return _symbols[offset + 1];
				}
			},
			new Action() {	// [65] ArithmeticExpression = Term
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			Action.RETURN,	// [66] AdditiveOperator = PLUS
			Action.RETURN,	// [67] AdditiveOperator = MINUS
			new Action() {	// [68] Term = Term MultiplicativeOperator Factor
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 3]); return _symbols[offset + 1];
				}
			},
			new Action() {	// [69] Term = Factor
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			Action.RETURN,	// [70] MultiplicativeOperator = TIMES
			Action.RETURN,	// [71] MultiplicativeOperator = DIV
			Action.RETURN,	// [72] MultiplicativeOperator = MOD
			RETURN2,	// [73] Factor = MINUS Factor; returns 'Factor' although none is marked
			Action.RETURN,	// [74] Factor = PrimaryExpression
			Action.RETURN,	// [75] PrimaryExpression = LHSExpression
			Action.RETURN,	// [76] PrimaryExpression = FunctionCall
			Action.RETURN,	// [77] PrimaryExpression = ArrayExpression
			Action.RETURN,	// [78] PrimaryExpression = STRING_LITERAL
			Action.RETURN,	// [79] PrimaryExpression = INT_LITERAL
			Action.RETURN,	// [80] PrimaryExpression = Boolean
			Action.RETURN,	// [81] PrimaryExpression = ParenthesizedExpression
			RETURN4,	// [82] FunctionCall = ID LPAREN ExpressionLists RPAREN; returns 'RPAREN' although none is marked
			Action.RETURN,	// [83] ExpressionLists = NonEmptyExpressionList
			Action.NONE,  	// [84] ExpressionLists = 
			RETURN3,	// [85] NonEmptyExpressionList = Expression COMMA NonEmptyExpressionList; returns 'NonEmptyExpressionList' although none is marked
			Action.RETURN,	// [86] NonEmptyExpressionList = Expression
			RETURN3,	// [87] ArrayExpression = LBRACKET NonEmptyExpressionList RBRACKET; returns 'RBRACKET' although none is marked
			RETURN3,	// [88] ParenthesizedExpression = LPAREN Expression RPAREN; returns 'RPAREN' although none is marked
			Action.RETURN,	// [89] Boolean = TRUE
			Action.RETURN	// [90] Boolean = FALSE
		};
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		return actions[rule_num].reduce(_symbols, offset);
	}
}
