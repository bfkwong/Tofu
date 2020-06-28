// Generated from Tofu.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TofuParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__27=1, T__26=2, T__25=3, T__24=4, T__23=5, T__22=6, T__21=7, T__20=8, 
		T__19=9, T__18=10, T__17=11, T__16=12, T__15=13, T__14=14, T__13=15, T__12=16, 
		T__11=17, T__10=18, T__9=19, T__8=20, T__7=21, T__6=22, T__5=23, T__4=24, 
		T__3=25, T__2=26, T__1=27, T__0=28, BOOLEAN=29, UNDEFINED=30, STRING=31, 
		IDENTIFIER=32, NUMBER=33, Whitespace=34, Newline=35;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "''s '", "'true'", "'!='", "'while'", "';'", "'{'", 
		"'}'", "'='", "'if'", "'<='", "'print'", "'('", "'is'", "'*'", "','", 
		"'>='", "'<'", "'=='", "'>'", "'or'", "'!'", "'else'", "')'", "'and'", 
		"'+'", "'then'", "'-'", "BOOLEAN", "'undefined'", "STRING", "IDENTIFIER", 
		"NUMBER", "Whitespace", "Newline"
	};
	public static final int
		RULE_r = 0, RULE_funDecls = 1, RULE_parameterList = 2, RULE_stmt = 3, 
		RULE_expStmt = 4, RULE_blockStmt = 5, RULE_ifStmt = 6, RULE_printStmt = 7, 
		RULE_iterationStmt = 8, RULE_expression = 9, RULE_logORExpression = 10, 
		RULE_logANDExpression = 11, RULE_eqExpression = 12, RULE_relExpression = 13, 
		RULE_addExpression = 14, RULE_multExpression = 15, RULE_unaryExpression = 16, 
		RULE_callMemExpression = 17, RULE_arguments = 18, RULE_argumentList = 19, 
		RULE_primaryExpression = 20, RULE_eqOp = 21, RULE_relOp = 22, RULE_addOp = 23, 
		RULE_multOp = 24, RULE_unaryOp = 25;
	public static final String[] ruleNames = {
		"r", "funDecls", "parameterList", "stmt", "expStmt", "blockStmt", "ifStmt", 
		"printStmt", "iterationStmt", "expression", "logORExpression", "logANDExpression", 
		"eqExpression", "relExpression", "addExpression", "multExpression", "unaryExpression", 
		"callMemExpression", "arguments", "argumentList", "primaryExpression", 
		"eqOp", "relOp", "addOp", "multOp", "unaryOp"
	};

	@Override
	public String getGrammarFileName() { return "Tofu.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public TofuParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RContext extends ParserRuleContext {
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<FunDeclsContext> funDecls() {
			return getRuleContexts(FunDeclsContext.class);
		}
		public FunDeclsContext funDecls(int i) {
			return getRuleContext(FunDeclsContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 13) | (1L << 22) | (1L << 28) | (1L << BOOLEAN) | (1L << UNDEFINED) | (1L << STRING) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				setState(54);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(52); funDecls();
					}
					break;

				case 2:
					{
					setState(53); stmt();
					}
					break;
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunDeclsContext extends ParserRuleContext {
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ExpStmtContext expStmt() {
			return getRuleContext(ExpStmtContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TofuParser.IDENTIFIER, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public FunDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterFunDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitFunDecls(this);
		}
	}

	public final FunDeclsContext funDecls() throws RecognitionException {
		FunDeclsContext _localctx = new FunDeclsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funDecls);
		int _la;
		try {
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59); match(IDENTIFIER);
				setState(60); match(13);
				setState(61); parameterList();
				setState(62); match(24);
				setState(63); match(9);
				setState(64); match(7);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 13) | (1L << 22) | (1L << 28) | (1L << BOOLEAN) | (1L << UNDEFINED) | (1L << STRING) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(65); stmt();
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(71); match(8);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); match(IDENTIFIER);
				setState(74); match(13);
				setState(75); parameterList();
				setState(76); match(24);
				setState(77); match(9);
				setState(78); expStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(TofuParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TofuParser.IDENTIFIER, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(82); match(IDENTIFIER);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==16) {
					{
					{
					setState(83); match(16);
					setState(84); match(IDENTIFIER);
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public ExpStmtContext expStmt() {
			return getRuleContext(ExpStmtContext.class,0);
		}
		public IterationStmtContext iterationStmt() {
			return getRuleContext(IterationStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt);
		try {
			setState(97);
			switch (_input.LA(1)) {
			case 5:
				enterOuterAlt(_localctx, 1);
				{
				setState(92); iterationStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); blockStmt();
				}
				break;
			case 13:
			case 22:
			case 28:
			case BOOLEAN:
			case UNDEFINED:
			case STRING:
			case IDENTIFIER:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(94); expStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 4);
				{
				setState(95); ifStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 5);
				{
				setState(96); printStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterExpStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitExpStmt(this);
		}
	}

	public final ExpStmtContext expStmt() throws RecognitionException {
		ExpStmtContext _localctx = new ExpStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); expression();
			setState(100); match(6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStmtContext extends ParserRuleContext {
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public BlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitBlockStmt(this);
		}
	}

	public final BlockStmtContext blockStmt() throws RecognitionException {
		BlockStmtContext _localctx = new BlockStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_blockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(7);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 13) | (1L << 22) | (1L << 28) | (1L << BOOLEAN) | (1L << UNDEFINED) | (1L << STRING) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(103); stmt();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109); match(8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockStmtContext> blockStmt() {
			return getRuleContexts(BlockStmtContext.class);
		}
		public BlockStmtContext blockStmt(int i) {
			return getRuleContext(BlockStmtContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitIfStmt(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); match(10);
			setState(112); match(13);
			setState(113); expression();
			setState(114); match(24);
			setState(115); match(14);
			setState(116); match(3);
			setState(117); match(27);
			setState(118); blockStmt();
			setState(122);
			_la = _input.LA(1);
			if (_la==21) {
				{
				setState(119); match(21);
				setState(120); match(23);
				setState(121); blockStmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitPrintStmt(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(12);
			setState(125); match(13);
			setState(126); expression();
			setState(127); match(24);
			setState(128); match(6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public IterationStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterIterationStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitIterationStmt(this);
		}
	}

	public final IterationStmtContext iterationStmt() throws RecognitionException {
		IterationStmtContext _localctx = new IterationStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_iterationStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); match(5);
			setState(131); match(13);
			setState(132); expression();
			setState(133); match(24);
			setState(134); match(14);
			setState(135); match(3);
			setState(136); blockStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LogORExpressionContext logORExpression() {
			return getRuleContext(LogORExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); logORExpression();
			setState(141);
			_la = _input.LA(1);
			if (_la==9) {
				{
				setState(139); match(9);
				setState(140); expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogORExpressionContext extends ParserRuleContext {
		public List<LogANDExpressionContext> logANDExpression() {
			return getRuleContexts(LogANDExpressionContext.class);
		}
		public LogANDExpressionContext logANDExpression(int i) {
			return getRuleContext(LogANDExpressionContext.class,i);
		}
		public LogORExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logORExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterLogORExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitLogORExpression(this);
		}
	}

	public final LogORExpressionContext logORExpression() throws RecognitionException {
		LogORExpressionContext _localctx = new LogORExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logORExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); logANDExpression();
			setState(146);
			_la = _input.LA(1);
			if (_la==21) {
				{
				setState(144); match(21);
				setState(145); logANDExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogANDExpressionContext extends ParserRuleContext {
		public List<EqExpressionContext> eqExpression() {
			return getRuleContexts(EqExpressionContext.class);
		}
		public EqExpressionContext eqExpression(int i) {
			return getRuleContext(EqExpressionContext.class,i);
		}
		public LogANDExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logANDExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterLogANDExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitLogANDExpression(this);
		}
	}

	public final LogANDExpressionContext logANDExpression() throws RecognitionException {
		LogANDExpressionContext _localctx = new LogANDExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logANDExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); eqExpression();
			setState(151);
			_la = _input.LA(1);
			if (_la==25) {
				{
				setState(149); match(25);
				setState(150); eqExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqExpressionContext extends ParserRuleContext {
		public EqOpContext eqOp() {
			return getRuleContext(EqOpContext.class,0);
		}
		public List<RelExpressionContext> relExpression() {
			return getRuleContexts(RelExpressionContext.class);
		}
		public RelExpressionContext relExpression(int i) {
			return getRuleContext(RelExpressionContext.class,i);
		}
		public EqExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterEqExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitEqExpression(this);
		}
	}

	public final EqExpressionContext eqExpression() throws RecognitionException {
		EqExpressionContext _localctx = new EqExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_eqExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); relExpression();
			setState(157);
			_la = _input.LA(1);
			if (_la==4 || _la==19) {
				{
				setState(154); eqOp();
				setState(155); relExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelExpressionContext extends ParserRuleContext {
		public List<AddExpressionContext> addExpression() {
			return getRuleContexts(AddExpressionContext.class);
		}
		public AddExpressionContext addExpression(int i) {
			return getRuleContext(AddExpressionContext.class,i);
		}
		public RelOpContext relOp() {
			return getRuleContext(RelOpContext.class,0);
		}
		public RelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterRelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitRelExpression(this);
		}
	}

	public final RelExpressionContext relExpression() throws RecognitionException {
		RelExpressionContext _localctx = new RelExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_relExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); addExpression();
			setState(163);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 11) | (1L << 17) | (1L << 18) | (1L << 20))) != 0)) {
				{
				setState(160); relOp();
				setState(161); addExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddExpressionContext extends ParserRuleContext {
		public MultExpressionContext multExpression(int i) {
			return getRuleContext(MultExpressionContext.class,i);
		}
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public List<MultExpressionContext> multExpression() {
			return getRuleContexts(MultExpressionContext.class);
		}
		public AddExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitAddExpression(this);
		}
	}

	public final AddExpressionContext addExpression() throws RecognitionException {
		AddExpressionContext _localctx = new AddExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_addExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); multExpression();
			setState(169);
			_la = _input.LA(1);
			if (_la==26 || _la==28) {
				{
				setState(166); addOp();
				setState(167); multExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultExpressionContext extends ParserRuleContext {
		public MultOpContext multOp() {
			return getRuleContext(MultOpContext.class,0);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public MultExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterMultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitMultExpression(this);
		}
	}

	public final MultExpressionContext multExpression() throws RecognitionException {
		MultExpressionContext _localctx = new MultExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_multExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); unaryExpression();
			setState(175);
			_la = _input.LA(1);
			if (_la==1 || _la==15) {
				{
				setState(172); multOp();
				setState(173); unaryExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryOpContext unaryOp() {
			return getRuleContext(UnaryOpContext.class,0);
		}
		public CallMemExpressionContext callMemExpression() {
			return getRuleContext(CallMemExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if (_la==22 || _la==28) {
				{
				setState(177); unaryOp();
				}
			}

			setState(180); callMemExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallMemExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(TofuParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TofuParser.IDENTIFIER, i);
		}
		public CallMemExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callMemExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterCallMemExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitCallMemExpression(this);
		}
	}

	public final CallMemExpressionContext callMemExpression() throws RecognitionException {
		CallMemExpressionContext _localctx = new CallMemExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_callMemExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); primaryExpression();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2 || _la==13) {
				{
				setState(186);
				switch (_input.LA(1)) {
				case 13:
					{
					setState(183); arguments();
					}
					break;
				case 2:
					{
					setState(184); match(2);
					setState(185); match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191); match(13);
			setState(192); argumentList();
			setState(193); match(24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 13) | (1L << 22) | (1L << 28) | (1L << BOOLEAN) | (1L << UNDEFINED) | (1L << STRING) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				setState(195); expression();
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==16) {
					{
					{
					setState(196); match(16);
					setState(197); expression();
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(TofuParser.NUMBER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode UNDEFINED() { return getToken(TofuParser.UNDEFINED, 0); }
		public TerminalNode STRING() { return getToken(TofuParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TofuParser.IDENTIFIER, 0); }
		public TerminalNode BOOLEAN() { return getToken(TofuParser.BOOLEAN, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_primaryExpression);
		try {
			setState(214);
			switch (_input.LA(1)) {
			case 13:
				enterOuterAlt(_localctx, 1);
				{
				setState(205); match(13);
				setState(206); expression();
				setState(207); match(24);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(209); match(NUMBER);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(210); match(BOOLEAN);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(211); match(STRING);
				}
				break;
			case UNDEFINED:
				enterOuterAlt(_localctx, 5);
				{
				setState(212); match(UNDEFINED);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 6);
				{
				setState(213); match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqOpContext extends ParserRuleContext {
		public EqOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterEqOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitEqOp(this);
		}
	}

	public final EqOpContext eqOp() throws RecognitionException {
		EqOpContext _localctx = new EqOpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_eqOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !(_la==4 || _la==19) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelOpContext extends ParserRuleContext {
		public RelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterRelOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitRelOp(this);
		}
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 11) | (1L << 17) | (1L << 18) | (1L << 20))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddOpContext extends ParserRuleContext {
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterAddOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitAddOp(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_la = _input.LA(1);
			if ( !(_la==26 || _la==28) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultOpContext extends ParserRuleContext {
		public MultOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterMultOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitMultOp(this);
		}
	}

	public final MultOpContext multOp() throws RecognitionException {
		MultOpContext _localctx = new MultOpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_multOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if ( !(_la==1 || _la==15) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOpContext extends ParserRuleContext {
		public UnaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitUnaryOp(this);
		}
	}

	public final UnaryOpContext unaryOp() throws RecognitionException {
		UnaryOpContext _localctx = new UnaryOpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_unaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_la = _input.LA(1);
			if ( !(_la==22 || _la==28) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\3%\u00e5\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\3\2\3\2\7\29\n\2\f\2\16\2<\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3E\n\3\f\3\16\3H\13\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3S\n\3\3\4\3\4\3\4\7\4X\n\4\f\4\16\4[\13\4\5\4"+
		"]\n\4\3\5\3\5\3\5\3\5\3\5\5\5d\n\5\3\6\3\6\3\6\3\7\3\7\7\7k\n\7\f\7\16"+
		"\7n\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b}\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\5\13\u0090\n\13\3\f\3\f\3\f\5\f\u0095\n\f\3\r\3\r\3\r\5\r\u009a\n\r\3"+
		"\16\3\16\3\16\3\16\5\16\u00a0\n\16\3\17\3\17\3\17\3\17\5\17\u00a6\n\17"+
		"\3\20\3\20\3\20\3\20\5\20\u00ac\n\20\3\21\3\21\3\21\3\21\5\21\u00b2\n"+
		"\21\3\22\5\22\u00b5\n\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00bd\n\23"+
		"\f\23\16\23\u00c0\13\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u00c9"+
		"\n\25\f\25\16\25\u00cc\13\25\5\25\u00ce\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u00d9\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\33\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\2\7\4\6\6\25\25\5\r\r\23\24\26\26\4\34\34\36\36\4\3\3\21"+
		"\21\4\30\30\36\36\u00e7\2:\3\2\2\2\4R\3\2\2\2\6\\\3\2\2\2\bc\3\2\2\2\n"+
		"e\3\2\2\2\fh\3\2\2\2\16q\3\2\2\2\20~\3\2\2\2\22\u0084\3\2\2\2\24\u008c"+
		"\3\2\2\2\26\u0091\3\2\2\2\30\u0096\3\2\2\2\32\u009b\3\2\2\2\34\u00a1\3"+
		"\2\2\2\36\u00a7\3\2\2\2 \u00ad\3\2\2\2\"\u00b4\3\2\2\2$\u00b8\3\2\2\2"+
		"&\u00c1\3\2\2\2(\u00cd\3\2\2\2*\u00d8\3\2\2\2,\u00da\3\2\2\2.\u00dc\3"+
		"\2\2\2\60\u00de\3\2\2\2\62\u00e0\3\2\2\2\64\u00e2\3\2\2\2\669\5\4\3\2"+
		"\679\5\b\5\28\66\3\2\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\3"+
		"\3\2\2\2<:\3\2\2\2=>\7\"\2\2>?\7\17\2\2?@\5\6\4\2@A\7\32\2\2AB\7\13\2"+
		"\2BF\7\t\2\2CE\5\b\5\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2"+
		"\2HF\3\2\2\2IJ\7\n\2\2JS\3\2\2\2KL\7\"\2\2LM\7\17\2\2MN\5\6\4\2NO\7\32"+
		"\2\2OP\7\13\2\2PQ\5\n\6\2QS\3\2\2\2R=\3\2\2\2RK\3\2\2\2S\5\3\2\2\2TY\7"+
		"\"\2\2UV\7\22\2\2VX\7\"\2\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z]"+
		"\3\2\2\2[Y\3\2\2\2\\T\3\2\2\2\\]\3\2\2\2]\7\3\2\2\2^d\5\22\n\2_d\5\f\7"+
		"\2`d\5\n\6\2ad\5\16\b\2bd\5\20\t\2c^\3\2\2\2c_\3\2\2\2c`\3\2\2\2ca\3\2"+
		"\2\2cb\3\2\2\2d\t\3\2\2\2ef\5\24\13\2fg\7\b\2\2g\13\3\2\2\2hl\7\t\2\2"+
		"ik\5\b\5\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2"+
		"op\7\n\2\2p\r\3\2\2\2qr\7\f\2\2rs\7\17\2\2st\5\24\13\2tu\7\32\2\2uv\7"+
		"\20\2\2vw\7\5\2\2wx\7\35\2\2x|\5\f\7\2yz\7\27\2\2z{\7\31\2\2{}\5\f\7\2"+
		"|y\3\2\2\2|}\3\2\2\2}\17\3\2\2\2~\177\7\16\2\2\177\u0080\7\17\2\2\u0080"+
		"\u0081\5\24\13\2\u0081\u0082\7\32\2\2\u0082\u0083\7\b\2\2\u0083\21\3\2"+
		"\2\2\u0084\u0085\7\7\2\2\u0085\u0086\7\17\2\2\u0086\u0087\5\24\13\2\u0087"+
		"\u0088\7\32\2\2\u0088\u0089\7\20\2\2\u0089\u008a\7\5\2\2\u008a\u008b\5"+
		"\f\7\2\u008b\23\3\2\2\2\u008c\u008f\5\26\f\2\u008d\u008e\7\13\2\2\u008e"+
		"\u0090\5\24\13\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\25\3\2"+
		"\2\2\u0091\u0094\5\30\r\2\u0092\u0093\7\27\2\2\u0093\u0095\5\30\r\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\27\3\2\2\2\u0096\u0099\5\32\16"+
		"\2\u0097\u0098\7\33\2\2\u0098\u009a\5\32\16\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\31\3\2\2\2\u009b\u009f\5\34\17\2\u009c\u009d\5,\27"+
		"\2\u009d\u009e\5\34\17\2\u009e\u00a0\3\2\2\2\u009f\u009c\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\33\3\2\2\2\u00a1\u00a5\5\36\20\2\u00a2\u00a3\5.\30"+
		"\2\u00a3\u00a4\5\36\20\2\u00a4\u00a6\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\35\3\2\2\2\u00a7\u00ab\5 \21\2\u00a8\u00a9\5\60\31"+
		"\2\u00a9\u00aa\5 \21\2\u00aa\u00ac\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\37\3\2\2\2\u00ad\u00b1\5\"\22\2\u00ae\u00af\5\62\32\2\u00af"+
		"\u00b0\5\"\22\2\u00b0\u00b2\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00b2\3"+
		"\2\2\2\u00b2!\3\2\2\2\u00b3\u00b5\5\64\33\2\u00b4\u00b3\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\5$\23\2\u00b7#\3\2\2\2"+
		"\u00b8\u00be\5*\26\2\u00b9\u00bd\5&\24\2\u00ba\u00bb\7\4\2\2\u00bb\u00bd"+
		"\7\"\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf%\3\2\2\2\u00c0\u00be\3\2\2\2"+
		"\u00c1\u00c2\7\17\2\2\u00c2\u00c3\5(\25\2\u00c3\u00c4\7\32\2\2\u00c4\'"+
		"\3\2\2\2\u00c5\u00ca\5\24\13\2\u00c6\u00c7\7\22\2\2\u00c7\u00c9\5\24\13"+
		"\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00c5\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce)\3\2\2\2\u00cf\u00d0\7\17\2\2\u00d0\u00d1\5\24\13"+
		"\2\u00d1\u00d2\7\32\2\2\u00d2\u00d9\3\2\2\2\u00d3\u00d9\7#\2\2\u00d4\u00d9"+
		"\7\37\2\2\u00d5\u00d9\7!\2\2\u00d6\u00d9\7 \2\2\u00d7\u00d9\7\"\2\2\u00d8"+
		"\u00cf\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d8\u00d5\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9+\3\2\2\2\u00da\u00db"+
		"\t\2\2\2\u00db-\3\2\2\2\u00dc\u00dd\t\3\2\2\u00dd/\3\2\2\2\u00de\u00df"+
		"\t\4\2\2\u00df\61\3\2\2\2\u00e0\u00e1\t\5\2\2\u00e1\63\3\2\2\2\u00e2\u00e3"+
		"\t\6\2\2\u00e3\65\3\2\2\2\308:FRY\\cl|\u008f\u0094\u0099\u009f\u00a5\u00ab"+
		"\u00b1\u00b4\u00bc\u00be\u00ca\u00cd\u00d8";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}