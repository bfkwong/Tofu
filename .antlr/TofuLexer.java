// Generated from /Users/bryankwong/Desktop/Tofu/Tofu.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TofuLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, TRUE=36, FALSE=37, UNDEFINED=38, 
		STRING=39, IDENTIFIER=40, NUMBER=41, Whitespace=42, Newline=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "TRUE", "FALSE", "UNDEFINED", "STRING", "IDENTIFIER", 
			"SAFECODEPOINT", "ESC", "UNICODE", "HEX", "NUMBER", "INT", "EXP", "Whitespace", 
			"Newline"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'blueprint'", "'for'", "'{'", "'}'", "'('", "')'", "'='", "','", 
			"'return'", "';'", "'if'", "'is'", "'then'", "'or'", "'else'", "'print'", 
			"'while'", "'and'", "''s '", "'.'", "'does'", "'make'", "'['", "']'", 
			"'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", 
			"'!'", "'true'", "'false'", "'undefined'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"TRUE", "FALSE", "UNDEFINED", "STRING", "IDENTIFIER", "NUMBER", "Whitespace", 
			"Newline"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public TofuLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tofu.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0144\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\""+
		"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\7(\u00f2\n(\f(\16(\u00f5\13(\3(\3(\3(\3"+
		"(\7(\u00fb\n(\f(\16(\u00fe\13(\3(\5(\u0101\n(\3)\3)\7)\u0105\n)\f)\16"+
		")\u0108\13)\3*\3*\3+\3+\3+\5+\u010f\n+\3,\3,\3,\3,\3,\3,\3-\3-\3.\3.\3"+
		".\6.\u011c\n.\r.\16.\u011d\5.\u0120\n.\3.\5.\u0123\n.\3/\3/\3/\7/\u0128"+
		"\n/\f/\16/\u012b\13/\5/\u012d\n/\3\60\3\60\5\60\u0131\n\60\3\60\3\60\3"+
		"\61\6\61\u0136\n\61\r\61\16\61\u0137\3\61\3\61\3\62\3\62\5\62\u013e\n"+
		"\62\3\62\5\62\u0141\n\62\3\62\3\62\2\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S\2"+
		"U\2W\2Y\2[+]\2_\2a,c-\3\2\f\4\2C\\c|\5\2\62;C\\c|\5\2\2!$$^^\n\2$$\61"+
		"\61^^ddhhppttvv\5\2\62;CHch\3\2\62;\3\2\63;\4\2GGgg\4\2--//\4\2\13\13"+
		"\"\"\2\u014d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"[\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5o\3\2\2\2\7s\3\2\2\2\tu\3"+
		"\2\2\2\13w\3\2\2\2\ry\3\2\2\2\17{\3\2\2\2\21}\3\2\2\2\23\177\3\2\2\2\25"+
		"\u0086\3\2\2\2\27\u0088\3\2\2\2\31\u008b\3\2\2\2\33\u008e\3\2\2\2\35\u0093"+
		"\3\2\2\2\37\u0096\3\2\2\2!\u009b\3\2\2\2#\u00a1\3\2\2\2%\u00a7\3\2\2\2"+
		"\'\u00ab\3\2\2\2)\u00af\3\2\2\2+\u00b1\3\2\2\2-\u00b6\3\2\2\2/\u00bb\3"+
		"\2\2\2\61\u00bd\3\2\2\2\63\u00bf\3\2\2\2\65\u00c2\3\2\2\2\67\u00c5\3\2"+
		"\2\29\u00c7\3\2\2\2;\u00ca\3\2\2\2=\u00cc\3\2\2\2?\u00cf\3\2\2\2A\u00d1"+
		"\3\2\2\2C\u00d3\3\2\2\2E\u00d5\3\2\2\2G\u00d7\3\2\2\2I\u00d9\3\2\2\2K"+
		"\u00de\3\2\2\2M\u00e4\3\2\2\2O\u0100\3\2\2\2Q\u0102\3\2\2\2S\u0109\3\2"+
		"\2\2U\u010b\3\2\2\2W\u0110\3\2\2\2Y\u0116\3\2\2\2[\u0118\3\2\2\2]\u012c"+
		"\3\2\2\2_\u012e\3\2\2\2a\u0135\3\2\2\2c\u0140\3\2\2\2ef\7d\2\2fg\7n\2"+
		"\2gh\7w\2\2hi\7g\2\2ij\7r\2\2jk\7t\2\2kl\7k\2\2lm\7p\2\2mn\7v\2\2n\4\3"+
		"\2\2\2op\7h\2\2pq\7q\2\2qr\7t\2\2r\6\3\2\2\2st\7}\2\2t\b\3\2\2\2uv\7\177"+
		"\2\2v\n\3\2\2\2wx\7*\2\2x\f\3\2\2\2yz\7+\2\2z\16\3\2\2\2{|\7?\2\2|\20"+
		"\3\2\2\2}~\7.\2\2~\22\3\2\2\2\177\u0080\7t\2\2\u0080\u0081\7g\2\2\u0081"+
		"\u0082\7v\2\2\u0082\u0083\7w\2\2\u0083\u0084\7t\2\2\u0084\u0085\7p\2\2"+
		"\u0085\24\3\2\2\2\u0086\u0087\7=\2\2\u0087\26\3\2\2\2\u0088\u0089\7k\2"+
		"\2\u0089\u008a\7h\2\2\u008a\30\3\2\2\2\u008b\u008c\7k\2\2\u008c\u008d"+
		"\7u\2\2\u008d\32\3\2\2\2\u008e\u008f\7v\2\2\u008f\u0090\7j\2\2\u0090\u0091"+
		"\7g\2\2\u0091\u0092\7p\2\2\u0092\34\3\2\2\2\u0093\u0094\7q\2\2\u0094\u0095"+
		"\7t\2\2\u0095\36\3\2\2\2\u0096\u0097\7g\2\2\u0097\u0098\7n\2\2\u0098\u0099"+
		"\7u\2\2\u0099\u009a\7g\2\2\u009a \3\2\2\2\u009b\u009c\7r\2\2\u009c\u009d"+
		"\7t\2\2\u009d\u009e\7k\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7v\2\2\u00a0"+
		"\"\3\2\2\2\u00a1\u00a2\7y\2\2\u00a2\u00a3\7j\2\2\u00a3\u00a4\7k\2\2\u00a4"+
		"\u00a5\7n\2\2\u00a5\u00a6\7g\2\2\u00a6$\3\2\2\2\u00a7\u00a8\7c\2\2\u00a8"+
		"\u00a9\7p\2\2\u00a9\u00aa\7f\2\2\u00aa&\3\2\2\2\u00ab\u00ac\7)\2\2\u00ac"+
		"\u00ad\7u\2\2\u00ad\u00ae\7\"\2\2\u00ae(\3\2\2\2\u00af\u00b0\7\60\2\2"+
		"\u00b0*\3\2\2\2\u00b1\u00b2\7f\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7g\2"+
		"\2\u00b4\u00b5\7u\2\2\u00b5,\3\2\2\2\u00b6\u00b7\7o\2\2\u00b7\u00b8\7"+
		"c\2\2\u00b8\u00b9\7m\2\2\u00b9\u00ba\7g\2\2\u00ba.\3\2\2\2\u00bb\u00bc"+
		"\7]\2\2\u00bc\60\3\2\2\2\u00bd\u00be\7_\2\2\u00be\62\3\2\2\2\u00bf\u00c0"+
		"\7?\2\2\u00c0\u00c1\7?\2\2\u00c1\64\3\2\2\2\u00c2\u00c3\7#\2\2\u00c3\u00c4"+
		"\7?\2\2\u00c4\66\3\2\2\2\u00c5\u00c6\7@\2\2\u00c68\3\2\2\2\u00c7\u00c8"+
		"\7@\2\2\u00c8\u00c9\7?\2\2\u00c9:\3\2\2\2\u00ca\u00cb\7>\2\2\u00cb<\3"+
		"\2\2\2\u00cc\u00cd\7>\2\2\u00cd\u00ce\7?\2\2\u00ce>\3\2\2\2\u00cf\u00d0"+
		"\7-\2\2\u00d0@\3\2\2\2\u00d1\u00d2\7/\2\2\u00d2B\3\2\2\2\u00d3\u00d4\7"+
		",\2\2\u00d4D\3\2\2\2\u00d5\u00d6\7\61\2\2\u00d6F\3\2\2\2\u00d7\u00d8\7"+
		"#\2\2\u00d8H\3\2\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7t\2\2\u00db\u00dc"+
		"\7w\2\2\u00dc\u00dd\7g\2\2\u00ddJ\3\2\2\2\u00de\u00df\7h\2\2\u00df\u00e0"+
		"\7c\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e3\7g\2\2\u00e3"+
		"L\3\2\2\2\u00e4\u00e5\7w\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7f\2\2\u00e7"+
		"\u00e8\7g\2\2\u00e8\u00e9\7h\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7p\2\2"+
		"\u00eb\u00ec\7g\2\2\u00ec\u00ed\7f\2\2\u00edN\3\2\2\2\u00ee\u00f3\7$\2"+
		"\2\u00ef\u00f2\5U+\2\u00f0\u00f2\5S*\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0"+
		"\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u0101\7$\2\2\u00f7\u00fc\7)\2"+
		"\2\u00f8\u00fb\5U+\2\u00f9\u00fb\5S*\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9"+
		"\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0101\7)\2\2\u0100\u00ee\3\2"+
		"\2\2\u0100\u00f7\3\2\2\2\u0101P\3\2\2\2\u0102\u0106\t\2\2\2\u0103\u0105"+
		"\t\3\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107R\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\n\4\2\2"+
		"\u010aT\3\2\2\2\u010b\u010e\7^\2\2\u010c\u010f\t\5\2\2\u010d\u010f\5W"+
		",\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010fV\3\2\2\2\u0110\u0111"+
		"\7w\2\2\u0111\u0112\5Y-\2\u0112\u0113\5Y-\2\u0113\u0114\5Y-\2\u0114\u0115"+
		"\5Y-\2\u0115X\3\2\2\2\u0116\u0117\t\6\2\2\u0117Z\3\2\2\2\u0118\u011f\5"+
		"]/\2\u0119\u011b\7\60\2\2\u011a\u011c\t\7\2\2\u011b\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2"+
		"\2\2\u011f\u0119\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121"+
		"\u0123\5_\60\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\\\3\2\2\2"+
		"\u0124\u012d\7\62\2\2\u0125\u0129\t\b\2\2\u0126\u0128\t\7\2\2\u0127\u0126"+
		"\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u0124\3\2\2\2\u012c\u0125\3\2"+
		"\2\2\u012d^\3\2\2\2\u012e\u0130\t\t\2\2\u012f\u0131\t\n\2\2\u0130\u012f"+
		"\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\5]/\2\u0133"+
		"`\3\2\2\2\u0134\u0136\t\13\2\2\u0135\u0134\3\2\2\2\u0136\u0137\3\2\2\2"+
		"\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a"+
		"\b\61\2\2\u013ab\3\2\2\2\u013b\u013d\7\17\2\2\u013c\u013e\7\f\2\2\u013d"+
		"\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u0141\7\f"+
		"\2\2\u0140\u013b\3\2\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0143\b\62\2\2\u0143d\3\2\2\2\23\2\u00f1\u00f3\u00fa\u00fc\u0100\u0106"+
		"\u010e\u011d\u011f\u0122\u0129\u012c\u0130\u0137\u013d\u0140\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}