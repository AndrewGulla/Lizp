// Generated from Lizp.g4 by ANTLR 4.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LizpLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__24=1, T__23=2, T__22=3, T__21=4, T__20=5, T__19=6, T__18=7, T__17=8, 
		T__16=9, T__15=10, T__14=11, T__13=12, T__12=13, T__11=14, T__10=15, T__9=16, 
		T__8=17, T__7=18, T__6=19, T__5=20, T__4=21, T__3=22, T__2=23, T__1=24, 
		T__0=25, WS=26, NEWLINE=27, ID=28, NUMBER=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'max'", "'ceil'", "')'", "'min'", "'+'", "'*'", "'-'", "'or'", "'('", 
		"'not'", "'print'", "'if'", "'floor'", "'<'", "'='", "'round'", "'<='", 
		"'cond'", "'set'", "'abs'", "'>'", "'and'", "'/='", "'/'", "'>='", "WS", 
		"NEWLINE", "ID", "NUMBER"
	};
	public static final String[] ruleNames = {
		"T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", 
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"WS", "NEWLINE", "ID", "NUMBER"
	};


	public LizpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lizp.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00b1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\7\35\u009d\n\35\f\35\16\35\u00a0\13\35\3\36\5\36\u00a3\n\36\3\36"+
		"\6\36\u00a6\n\36\r\36\16\36\u00a7\3\36\3\36\6\36\u00ac\n\36\r\36\16\36"+
		"\u00ad\5\36\u00b0\n\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37\3\2\b\4\2\13\13\"\"\4\2\f\f\17\17\5\2C\\"+
		"aac|\6\2\62;C\\aac|\4\2--//\3\2\62;\u00b5\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5A\3\2\2\2"+
		"\7F\3\2\2\2\tH\3\2\2\2\13L\3\2\2\2\rN\3\2\2\2\17P\3\2\2\2\21R\3\2\2\2"+
		"\23U\3\2\2\2\25W\3\2\2\2\27[\3\2\2\2\31a\3\2\2\2\33d\3\2\2\2\35j\3\2\2"+
		"\2\37l\3\2\2\2!n\3\2\2\2#t\3\2\2\2%w\3\2\2\2\'|\3\2\2\2)\u0080\3\2\2\2"+
		"+\u0084\3\2\2\2-\u0086\3\2\2\2/\u008a\3\2\2\2\61\u008d\3\2\2\2\63\u008f"+
		"\3\2\2\2\65\u0092\3\2\2\2\67\u0096\3\2\2\29\u009a\3\2\2\2;\u00a2\3\2\2"+
		"\2=>\7o\2\2>?\7c\2\2?@\7z\2\2@\4\3\2\2\2AB\7e\2\2BC\7g\2\2CD\7k\2\2DE"+
		"\7n\2\2E\6\3\2\2\2FG\7+\2\2G\b\3\2\2\2HI\7o\2\2IJ\7k\2\2JK\7p\2\2K\n\3"+
		"\2\2\2LM\7-\2\2M\f\3\2\2\2NO\7,\2\2O\16\3\2\2\2PQ\7/\2\2Q\20\3\2\2\2R"+
		"S\7q\2\2ST\7t\2\2T\22\3\2\2\2UV\7*\2\2V\24\3\2\2\2WX\7p\2\2XY\7q\2\2Y"+
		"Z\7v\2\2Z\26\3\2\2\2[\\\7r\2\2\\]\7t\2\2]^\7k\2\2^_\7p\2\2_`\7v\2\2`\30"+
		"\3\2\2\2ab\7k\2\2bc\7h\2\2c\32\3\2\2\2de\7h\2\2ef\7n\2\2fg\7q\2\2gh\7"+
		"q\2\2hi\7t\2\2i\34\3\2\2\2jk\7>\2\2k\36\3\2\2\2lm\7?\2\2m \3\2\2\2no\7"+
		"t\2\2op\7q\2\2pq\7w\2\2qr\7p\2\2rs\7f\2\2s\"\3\2\2\2tu\7>\2\2uv\7?\2\2"+
		"v$\3\2\2\2wx\7e\2\2xy\7q\2\2yz\7p\2\2z{\7f\2\2{&\3\2\2\2|}\7u\2\2}~\7"+
		"g\2\2~\177\7v\2\2\177(\3\2\2\2\u0080\u0081\7c\2\2\u0081\u0082\7d\2\2\u0082"+
		"\u0083\7u\2\2\u0083*\3\2\2\2\u0084\u0085\7@\2\2\u0085,\3\2\2\2\u0086\u0087"+
		"\7c\2\2\u0087\u0088\7p\2\2\u0088\u0089\7f\2\2\u0089.\3\2\2\2\u008a\u008b"+
		"\7\61\2\2\u008b\u008c\7?\2\2\u008c\60\3\2\2\2\u008d\u008e\7\61\2\2\u008e"+
		"\62\3\2\2\2\u008f\u0090\7@\2\2\u0090\u0091\7?\2\2\u0091\64\3\2\2\2\u0092"+
		"\u0093\t\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\b\33\2\2\u0095\66\3\2\2"+
		"\2\u0096\u0097\t\3\2\2\u0097\u0098\3\2\2\2\u0098\u0099\b\34\2\2\u0099"+
		"8\3\2\2\2\u009a\u009e\t\4\2\2\u009b\u009d\t\5\2\2\u009c\u009b\3\2\2\2"+
		"\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f:\3"+
		"\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\t\6\2\2\u00a2\u00a1\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a6\t\7\2\2\u00a5\u00a4\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00af\3\2\2\2\u00a9\u00ab\7\60\2\2\u00aa\u00ac\t\7\2\2\u00ab\u00aa\3"+
		"\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00a9\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0<\3\2\2\2"+
		"\b\2\u009e\u00a2\u00a7\u00ad\u00af\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}