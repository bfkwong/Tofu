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
		T__32=1, T__31=2, T__30=3, T__29=4, T__28=5, T__27=6, T__26=7, T__25=8, 
		T__24=9, T__23=10, T__22=11, T__21=12, T__20=13, T__19=14, T__18=15, T__17=16, 
		T__16=17, T__15=18, T__14=19, T__13=20, T__12=21, T__11=22, T__10=23, 
		T__9=24, T__8=25, T__7=26, T__6=27, T__5=28, T__4=29, T__3=30, T__2=31, 
		T__1=32, T__0=33, TRUE=34, FALSE=35, UNDEFINED=36, STRING=37, IDENTIFIER=38, 
		NUMBER=39, Whitespace=40, Newline=41;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "''s '", "'return'", "'!='", "'while'", "';'", "'{'", 
		"'blueprint'", "'='", "'}'", "'if'", "'for'", "'<='", "'print'", "'('", 
		"'is'", "'*'", "','", "'.'", "'>='", "'<'", "'=='", "'>'", "'or'", "'!'", 
		"'make'", "'else'", "'does'", "')'", "'and'", "'+'", "'then'", "'-'", 
		"'true'", "'false'", "'undefined'", "STRING", "IDENTIFIER", "NUMBER", 
		"Whitespace", "Newline"
	};
	public static final int
		RULE_program = 0, RULE_classDecls = 1, RULE_funDecl = 2, RULE_parameterList = 3, 
		RULE_stmt = 4, RULE_retStmt = 5, RULE_expStmt = 6, RULE_blockStmt = 7, 
		RULE_ifStmt = 8, RULE_printStmt = 9, RULE_iterationStmt = 10, RULE_expression = 11, 
		RULE_logORExpression = 12, RULE_logANDExpression = 13, RULE_eqExpression = 14, 
		RULE_relExpression = 15, RULE_addExpression = 16, RULE_multExpression = 17, 
		RULE_unaryExpression = 18, RULE_callMemExpression = 19, RULE_arguments = 20, 
		RULE_argumentList = 21, RULE_primaryExpression = 22, RULE_eqOp = 23, RULE_relOp = 24, 
		RULE_addOp = 25, RULE_multOp = 26, RULE_unaryOp = 27;
	public static final String[] ruleNames = {
		"program", "classDecls", "funDecl", "parameterList", "stmt", "retStmt", 
		"expStmt", "blockStmt", "ifStmt", "printStmt", "iterationStmt", "expression", 
		"logORExpression", "logANDExpression", "eqExpression", "relExpression", 
		"addExpression", "multExpression", "unaryExpression", "callMemExpression", 
		"arguments", "argumentList", "primaryExpression", "eqOp", "relOp", "addOp", 
		"multOp", "unaryOp"
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
	public static class ProgramContext extends ParserRuleContext {
		public ClassDeclsContext classDecls(int i) {
			return getRuleContext(ClassDeclsContext.class,i);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<FunDeclContext> funDecl() {
			return getRuleContexts(FunDeclContext.class);
		}
		public FunDeclContext funDecl(int i) {
			return getRuleContext(FunDeclContext.class,i);
		}
		public List<ClassDeclsContext> classDecls() {
			return getRuleContexts(ClassDeclsContext.class);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 5) | (1L << 7) | (1L << 8) | (1L << 11) | (1L << 14) | (1L << 15) | (1L << 25) | (1L << 26) | (1L << 33) | (1L << TRUE) | (1L << FALSE) | (1L << UNDEFINED) | (1L << STRING) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				setState(59);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(56); funDecl();
					}
					break;

				case 2:
					{
					setState(57); classDecls();
					}
					break;

				case 3:
					{
					setState(58); stmt();
					}
					break;
				}
				}
				setState(63);
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

	public static class ClassDeclsContext extends ParserRuleContext {
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<FunDeclContext> funDecl() {
			return getRuleContexts(FunDeclContext.class);
		}
		public FunDeclContext funDecl(int i) {
			return getRuleContext(FunDeclContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(TofuParser.IDENTIFIER, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public ClassDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterClassDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitClassDecls(this);
		}
	}

	public final ClassDeclsContext classDecls() throws RecognitionException {
		ClassDeclsContext _localctx = new ClassDeclsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDecls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); match(8);
			setState(65); match(12);
			setState(66); match(IDENTIFIER);
			setState(67); match(7);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 5) | (1L << 7) | (1L << 11) | (1L << 14) | (1L << 15) | (1L << 25) | (1L << 26) | (1L << 33) | (1L << TRUE) | (1L << FALSE) | (1L << UNDEFINED) | (1L << STRING) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				setState(70);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(68); funDecl();
					}
					break;

				case 2:
					{
					setState(69); stmt();
					}
					break;
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75); match(10);
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

	public static class FunDeclContext extends ParserRuleContext {
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
		public FunDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterFunDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitFunDecl(this);
		}
	}

	public final FunDeclContext funDecl() throws RecognitionException {
		FunDeclContext _localctx = new FunDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funDecl);
		int _la;
		try {
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77); match(IDENTIFIER);
				setState(78); match(15);
				setState(79); parameterList();
				setState(80); match(29);
				setState(81); match(9);
				setState(82); match(7);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 5) | (1L << 7) | (1L << 11) | (1L << 14) | (1L << 15) | (1L << 25) | (1L << 26) | (1L << 33) | (1L << TRUE) | (1L << FALSE) | (1L << UNDEFINED) | (1L << STRING) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(83); stmt();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89); match(10);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91); match(IDENTIFIER);
				setState(92); match(15);
				setState(93); parameterList();
				setState(94); match(29);
				setState(95); match(9);
				setState(96); expStmt();
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
		enterRule(_localctx, 6, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(100); match(IDENTIFIER);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==18) {
					{
					{
					setState(101); match(18);
					setState(102); match(IDENTIFIER);
					}
					}
					setState(107);
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
		public RetStmtContext retStmt() {
			return getRuleContext(RetStmtContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_stmt);
		try {
			setState(116);
			switch (_input.LA(1)) {
			case 5:
				enterOuterAlt(_localctx, 1);
				{
				setState(110); iterationStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 2);
				{
				setState(111); blockStmt();
				}
				break;
			case 15:
			case 25:
			case 26:
			case 33:
			case TRUE:
			case FALSE:
			case UNDEFINED:
			case STRING:
			case IDENTIFIER:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(112); expStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 4);
				{
				setState(113); ifStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 5);
				{
				setState(114); printStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 6);
				{
				setState(115); retStmt();
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

	public static class RetStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).enterRetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TofuListener ) ((TofuListener)listener).exitRetStmt(this);
		}
	}

	public final RetStmtContext retStmt() throws RecognitionException {
		RetStmtContext _localctx = new RetStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_retStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(3);
			setState(120);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(119); expression();
				}
				break;
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
		enterRule(_localctx, 12, RULE_expStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); expression();
			setState(123); match(6);
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
		enterRule(_localctx, 14, RULE_blockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(7);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 5) | (1L << 7) | (1L << 11) | (1L << 14) | (1L << 15) | (1L << 25) | (1L << 26) | (1L << 33) | (1L << TRUE) | (1L << FALSE) | (1L << UNDEFINED) | (1L << STRING) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(126); stmt();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132); match(10);
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
		enterRule(_localctx, 16, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(11);
			setState(135); match(15);
			setState(136); expression();
			setState(137); match(29);
			setState(138); match(16);
			setState(139); match(TRUE);
			setState(140); match(32);
			setState(141); blockStmt();
			setState(145);
			_la = _input.LA(1);
			if (_la==24) {
				{
				setState(142); match(24);
				setState(143); match(27);
				setState(144); blockStmt();
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
		enterRule(_localctx, 18, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); match(14);
			setState(148); match(15);
			setState(149); expression();
			setState(150); match(29);
			setState(151); match(6);
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
		enterRule(_localctx, 20, RULE_iterationStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); match(5);
			setState(154); match(15);
			setState(155); expression();
			setState(156); match(29);
			setState(157); match(16);
			setState(158); match(TRUE);
			setState(159); blockStmt();
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
		enterRule(_localctx, 22, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); logORExpression();
			setState(164);
			_la = _input.LA(1);
			if (_la==9) {
				{
				setState(162); match(9);
				setState(163); expression();
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
		enterRule(_localctx, 24, RULE_logORExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); logANDExpression();
			setState(169);
			_la = _input.LA(1);
			if (_la==24) {
				{
				setState(167); match(24);
				setState(168); logANDExpression();
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
		enterRule(_localctx, 26, RULE_logANDExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); eqExpression();
			setState(174);
			_la = _input.LA(1);
			if (_la==30) {
				{
				setState(172); match(30);
				setState(173); eqExpression();
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
		enterRule(_localctx, 28, RULE_eqExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); relExpression();
			setState(180);
			_la = _input.LA(1);
			if (_la==4 || _la==22) {
				{
				setState(177); eqOp();
				setState(178); relExpression();
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
		enterRule(_localctx, 30, RULE_relExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); addExpression();
			setState(186);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 13) | (1L << 20) | (1L << 21) | (1L << 23))) != 0)) {
				{
				setState(183); relOp();
				setState(184); addExpression();
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
		enterRule(_localctx, 32, RULE_addExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); multExpression();
			setState(192);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(189); addOp();
				setState(190); multExpression();
				}
				break;
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
		enterRule(_localctx, 34, RULE_multExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); unaryExpression();
			setState(198);
			_la = _input.LA(1);
			if (_la==1 || _la==17) {
				{
				setState(195); multOp();
				setState(196); unaryExpression();
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
		enterRule(_localctx, 36, RULE_unaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if (_la==25 || _la==33) {
				{
				setState(200); unaryOp();
				}
			}

			setState(203); callMemExpression();
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
		enterRule(_localctx, 38, RULE_callMemExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205); primaryExpression();
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(213);
					switch (_input.LA(1)) {
					case 15:
						{
						setState(206); arguments();
						}
						break;
					case 2:
						{
						setState(207); match(2);
						setState(208); match(IDENTIFIER);
						}
						break;
					case 19:
						{
						setState(209); match(19);
						setState(210); match(IDENTIFIER);
						}
						break;
					case 28:
						{
						setState(211); match(28);
						setState(212); match(IDENTIFIER);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 40, RULE_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); match(15);
			setState(219); argumentList();
			setState(220); match(29);
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
		enterRule(_localctx, 42, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 15) | (1L << 25) | (1L << 26) | (1L << 33) | (1L << TRUE) | (1L << FALSE) | (1L << UNDEFINED) | (1L << STRING) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				setState(222); expression();
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==18) {
					{
					{
					setState(223); match(18);
					setState(224); expression();
					}
					}
					setState(229);
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
		public TerminalNode TRUE() { return getToken(TofuParser.TRUE, 0); }
		public TerminalNode STRING() { return getToken(TofuParser.STRING, 0); }
		public TerminalNode FALSE() { return getToken(TofuParser.FALSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TofuParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 44, RULE_primaryExpression);
		try {
			setState(244);
			switch (_input.LA(1)) {
			case 15:
				enterOuterAlt(_localctx, 1);
				{
				setState(232); match(15);
				setState(233); expression();
				setState(234); match(29);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(236); match(NUMBER);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(237); match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(238); match(FALSE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(239); match(STRING);
				}
				break;
			case UNDEFINED:
				enterOuterAlt(_localctx, 6);
				{
				setState(240); match(UNDEFINED);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 7);
				{
				setState(241); match(IDENTIFIER);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 8);
				{
				setState(242); match(26);
				setState(243); match(IDENTIFIER);
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
		enterRule(_localctx, 46, RULE_eqOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !(_la==4 || _la==22) ) {
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
		enterRule(_localctx, 48, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 13) | (1L << 20) | (1L << 21) | (1L << 23))) != 0)) ) {
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
		enterRule(_localctx, 50, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_la = _input.LA(1);
			if ( !(_la==31 || _la==33) ) {
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
		enterRule(_localctx, 52, RULE_multOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !(_la==1 || _la==17) ) {
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
		enterRule(_localctx, 54, RULE_unaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if ( !(_la==25 || _la==33) ) {
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
		"\2\3+\u0103\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3"+
		"\2\7\2>\n\2\f\2\16\2A\13\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3I\n\3\f\3\16\3L"+
		"\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4W\n\4\f\4\16\4Z\13\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4e\n\4\3\5\3\5\3\5\7\5j\n\5\f\5\16"+
		"\5m\13\5\5\5o\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6w\n\6\3\7\3\7\5\7{\n\7\3"+
		"\b\3\b\3\b\3\t\3\t\7\t\u0082\n\t\f\t\16\t\u0085\13\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0094\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00a7\n\r\3\16"+
		"\3\16\3\16\5\16\u00ac\n\16\3\17\3\17\3\17\5\17\u00b1\n\17\3\20\3\20\3"+
		"\20\3\20\5\20\u00b7\n\20\3\21\3\21\3\21\3\21\5\21\u00bd\n\21\3\22\3\22"+
		"\3\22\3\22\5\22\u00c3\n\22\3\23\3\23\3\23\3\23\5\23\u00c9\n\23\3\24\5"+
		"\24\u00cc\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25"+
		"\u00d8\n\25\f\25\16\25\u00db\13\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\7\27\u00e4\n\27\f\27\16\27\u00e7\13\27\5\27\u00e9\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00f7\n\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\2\36\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\7\4\6\6\30\30\5\17\17\26\27"+
		"\31\31\4!!##\4\3\3\23\23\4\33\33##\u010c\2?\3\2\2\2\4B\3\2\2\2\6d\3\2"+
		"\2\2\bn\3\2\2\2\nv\3\2\2\2\fx\3\2\2\2\16|\3\2\2\2\20\177\3\2\2\2\22\u0088"+
		"\3\2\2\2\24\u0095\3\2\2\2\26\u009b\3\2\2\2\30\u00a3\3\2\2\2\32\u00a8\3"+
		"\2\2\2\34\u00ad\3\2\2\2\36\u00b2\3\2\2\2 \u00b8\3\2\2\2\"\u00be\3\2\2"+
		"\2$\u00c4\3\2\2\2&\u00cb\3\2\2\2(\u00cf\3\2\2\2*\u00dc\3\2\2\2,\u00e8"+
		"\3\2\2\2.\u00f6\3\2\2\2\60\u00f8\3\2\2\2\62\u00fa\3\2\2\2\64\u00fc\3\2"+
		"\2\2\66\u00fe\3\2\2\28\u0100\3\2\2\2:>\5\6\4\2;>\5\4\3\2<>\5\n\6\2=:\3"+
		"\2\2\2=;\3\2\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\3\3\2\2\2A?"+
		"\3\2\2\2BC\7\n\2\2CD\7\16\2\2DE\7(\2\2EJ\7\t\2\2FI\5\6\4\2GI\5\n\6\2H"+
		"F\3\2\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2"+
		"MN\7\f\2\2N\5\3\2\2\2OP\7(\2\2PQ\7\21\2\2QR\5\b\5\2RS\7\37\2\2ST\7\13"+
		"\2\2TX\7\t\2\2UW\5\n\6\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2"+
		"\2\2ZX\3\2\2\2[\\\7\f\2\2\\e\3\2\2\2]^\7(\2\2^_\7\21\2\2_`\5\b\5\2`a\7"+
		"\37\2\2ab\7\13\2\2bc\5\16\b\2ce\3\2\2\2dO\3\2\2\2d]\3\2\2\2e\7\3\2\2\2"+
		"fk\7(\2\2gh\7\24\2\2hj\7(\2\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2"+
		"lo\3\2\2\2mk\3\2\2\2nf\3\2\2\2no\3\2\2\2o\t\3\2\2\2pw\5\26\f\2qw\5\20"+
		"\t\2rw\5\16\b\2sw\5\22\n\2tw\5\24\13\2uw\5\f\7\2vp\3\2\2\2vq\3\2\2\2v"+
		"r\3\2\2\2vs\3\2\2\2vt\3\2\2\2vu\3\2\2\2w\13\3\2\2\2xz\7\5\2\2y{\5\30\r"+
		"\2zy\3\2\2\2z{\3\2\2\2{\r\3\2\2\2|}\5\30\r\2}~\7\b\2\2~\17\3\2\2\2\177"+
		"\u0083\7\t\2\2\u0080\u0082\5\n\6\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2"+
		"\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0087\7\f\2\2\u0087\21\3\2\2\2\u0088\u0089\7\r\2"+
		"\2\u0089\u008a\7\21\2\2\u008a\u008b\5\30\r\2\u008b\u008c\7\37\2\2\u008c"+
		"\u008d\7\22\2\2\u008d\u008e\7$\2\2\u008e\u008f\7\"\2\2\u008f\u0093\5\20"+
		"\t\2\u0090\u0091\7\32\2\2\u0091\u0092\7\35\2\2\u0092\u0094\5\20\t\2\u0093"+
		"\u0090\3\2\2\2\u0093\u0094\3\2\2\2\u0094\23\3\2\2\2\u0095\u0096\7\20\2"+
		"\2\u0096\u0097\7\21\2\2\u0097\u0098\5\30\r\2\u0098\u0099\7\37\2\2\u0099"+
		"\u009a\7\b\2\2\u009a\25\3\2\2\2\u009b\u009c\7\7\2\2\u009c\u009d\7\21\2"+
		"\2\u009d\u009e\5\30\r\2\u009e\u009f\7\37\2\2\u009f\u00a0\7\22\2\2\u00a0"+
		"\u00a1\7$\2\2\u00a1\u00a2\5\20\t\2\u00a2\27\3\2\2\2\u00a3\u00a6\5\32\16"+
		"\2\u00a4\u00a5\7\13\2\2\u00a5\u00a7\5\30\r\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\31\3\2\2\2\u00a8\u00ab\5\34\17\2\u00a9\u00aa\7\32"+
		"\2\2\u00aa\u00ac\5\34\17\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\33\3\2\2\2\u00ad\u00b0\5\36\20\2\u00ae\u00af\7 \2\2\u00af\u00b1\5\36"+
		"\20\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\35\3\2\2\2\u00b2\u00b6"+
		"\5 \21\2\u00b3\u00b4\5\60\31\2\u00b4\u00b5\5 \21\2\u00b5\u00b7\3\2\2\2"+
		"\u00b6\u00b3\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\37\3\2\2\2\u00b8\u00bc"+
		"\5\"\22\2\u00b9\u00ba\5\62\32\2\u00ba\u00bb\5\"\22\2\u00bb\u00bd\3\2\2"+
		"\2\u00bc\u00b9\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd!\3\2\2\2\u00be\u00c2"+
		"\5$\23\2\u00bf\u00c0\5\64\33\2\u00c0\u00c1\5$\23\2\u00c1\u00c3\3\2\2\2"+
		"\u00c2\u00bf\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3#\3\2\2\2\u00c4\u00c8\5"+
		"&\24\2\u00c5\u00c6\5\66\34\2\u00c6\u00c7\5&\24\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c5\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9%\3\2\2\2\u00ca\u00cc\58\35\2"+
		"\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce"+
		"\5(\25\2\u00ce\'\3\2\2\2\u00cf\u00d9\5.\30\2\u00d0\u00d8\5*\26\2\u00d1"+
		"\u00d2\7\4\2\2\u00d2\u00d8\7(\2\2\u00d3\u00d4\7\25\2\2\u00d4\u00d8\7("+
		"\2\2\u00d5\u00d6\7\36\2\2\u00d6\u00d8\7(\2\2\u00d7\u00d0\3\2\2\2\u00d7"+
		"\u00d1\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da)\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00dc\u00dd\7\21\2\2\u00dd\u00de\5,\27\2\u00de\u00df\7\37\2\2"+
		"\u00df+\3\2\2\2\u00e0\u00e5\5\30\r\2\u00e1\u00e2\7\24\2\2\u00e2\u00e4"+
		"\5\30\r\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2"+
		"\u00e5\u00e6\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e0"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9-\3\2\2\2\u00ea\u00eb\7\21\2\2\u00eb"+
		"\u00ec\5\30\r\2\u00ec\u00ed\7\37\2\2\u00ed\u00f7\3\2\2\2\u00ee\u00f7\7"+
		")\2\2\u00ef\u00f7\7$\2\2\u00f0\u00f7\7%\2\2\u00f1\u00f7\7\'\2\2\u00f2"+
		"\u00f7\7&\2\2\u00f3\u00f7\7(\2\2\u00f4\u00f5\7\34\2\2\u00f5\u00f7\7(\2"+
		"\2\u00f6\u00ea\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f6\u00ef\3\2\2\2\u00f6\u00f0"+
		"\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7/\3\2\2\2\u00f8\u00f9\t\2\2\2\u00f9\61\3\2\2\2\u00fa"+
		"\u00fb\t\3\2\2\u00fb\63\3\2\2\2\u00fc\u00fd\t\4\2\2\u00fd\65\3\2\2\2\u00fe"+
		"\u00ff\t\5\2\2\u00ff\67\3\2\2\2\u0100\u0101\t\6\2\2\u01019\3\2\2\2\33"+
		"=?HJXdknvz\u0083\u0093\u00a6\u00ab\u00b0\u00b6\u00bc\u00c2\u00c8\u00cb"+
		"\u00d7\u00d9\u00e5\u00e8\u00f6";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}