/* The following code was generated by JFlex 1.7.0 */

/*****************************************************************
 * Lexer.java
 *
 * Copyright ©2020 Ronald Berdúo. All Rights Reserved.
 * This software is the proprietary information of Ronald Berdúo.
 *
 *****************************************************************/
package com.neftxx.interpreter.jflex_cup;

import com.neftxx.interpreter.AritLanguage;
import com.neftxx.util.NodeInfo;
import java_cup.runtime.Symbol;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;

/**
 *
 * @author Ronald Berdúo
 */


public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMENTARIO_DE_FIN_DE_LINEA = 2;
  public static final int COMENTARIO_TRADICIONAL = 4;
  public static final int CADENA = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\5\1\4\1\64\1\65\1\3\22\0\1\5\1\37\1\34"+
    "\1\63\1\0\1\41\1\52\1\0\1\53\1\54\1\44\1\42\1\60"+
    "\1\43\1\6\1\45\12\1\1\50\1\57\1\40\1\35\1\36\1\47"+
    "\1\0\1\15\1\31\1\22\1\26\1\13\1\14\1\2\1\30\1\25"+
    "\1\2\1\33\1\16\1\2\1\21\1\23\2\2\1\11\1\20\1\10"+
    "\1\12\1\2\1\27\3\2\1\55\1\66\1\56\1\46\1\7\1\0"+
    "\1\15\1\31\1\22\1\26\1\13\1\14\1\2\1\30\1\25\1\2"+
    "\1\33\1\16\1\2\1\21\1\23\2\2\1\11\1\20\1\10\1\12"+
    "\1\2\1\27\3\2\1\61\1\51\1\62\7\0\1\64\252\0\2\24"+
    "\115\0\1\17\u1ea8\0\1\64\1\64\u0100\0\1\32\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udee5\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\1\2\1\3\2\4\1\1\4\3\1\1"+
    "\3\3\1\1\4\3\1\5\1\6\1\7\1\10\1\11"+
    "\1\1\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\2\35\2\36\1\37\2\40"+
    "\1\41\1\1\1\0\6\3\1\0\4\3\1\42\1\43"+
    "\1\42\1\43\1\3\1\44\2\3\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57"+
    "\1\60\1\61\1\62\2\3\1\0\3\3\1\63\1\0"+
    "\2\3\1\0\3\3\1\0\2\3\1\64\1\3\2\65"+
    "\1\3\2\0\1\3\1\66\2\67\2\3\1\0\4\3"+
    "\1\64\1\0\1\3\1\0\2\3\2\70\2\71\1\72"+
    "\1\0\1\3\2\73\1\0\2\3\1\0\1\3\1\0"+
    "\1\3\1\74\2\75\2\76";

  private static int [] zzUnpackAction() {
    int [] result = new int[153];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\67\0\156\0\245\0\334\0\u0113\0\u014a\0\u0181"+
    "\0\334\0\u01b8\0\u01ef\0\u0226\0\u025d\0\u0294\0\u02cb\0\u0302"+
    "\0\u0339\0\u0370\0\u03a7\0\u03de\0\u0415\0\u044c\0\u0483\0\334"+
    "\0\u04ba\0\u04f1\0\u0528\0\u055f\0\u0596\0\334\0\334\0\334"+
    "\0\334\0\334\0\334\0\334\0\334\0\334\0\334\0\334"+
    "\0\334\0\334\0\334\0\334\0\334\0\334\0\u05cd\0\334"+
    "\0\u0604\0\334\0\334\0\u063b\0\u0672\0\u06a9\0\334\0\334"+
    "\0\u06e0\0\u0717\0\u074e\0\u0785\0\u07bc\0\u07f3\0\u082a\0\u0861"+
    "\0\u0898\0\u08cf\0\u0906\0\u093d\0\u0974\0\334\0\334\0\u014a"+
    "\0\u014a\0\u09ab\0\u014a\0\u09e2\0\u0a19\0\334\0\334\0\334"+
    "\0\334\0\334\0\334\0\334\0\334\0\334\0\334\0\334"+
    "\0\334\0\334\0\u0717\0\u0a50\0\u0a87\0\u0abe\0\u0af5\0\u0b2c"+
    "\0\u0b63\0\u014a\0\u0b9a\0\u0bd1\0\u0c08\0\u0c3f\0\u0c76\0\u0cad"+
    "\0\u0ce4\0\u0d1b\0\u0d52\0\u0d89\0\u014a\0\u0dc0\0\334\0\u014a"+
    "\0\u0df7\0\u0e2e\0\u0e65\0\u0e9c\0\u014a\0\334\0\u014a\0\u0ed3"+
    "\0\u0f0a\0\u0f41\0\u0f78\0\u0faf\0\u0fe6\0\u101d\0\334\0\u1054"+
    "\0\u108b\0\u10c2\0\u10f9\0\u1130\0\334\0\u014a\0\334\0\u014a"+
    "\0\u014a\0\u1167\0\u119e\0\334\0\u014a\0\u11d5\0\u120c\0\u1243"+
    "\0\u127a\0\u12b1\0\u12e8\0\u131f\0\u014a\0\334\0\u014a\0\334"+
    "\0\u014a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[153];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\5\1\6\1\7\1\10\2\11\1\12\1\5\1\13"+
    "\1\14\1\7\1\15\1\16\2\7\1\17\1\20\1\21"+
    "\1\22\1\7\1\23\1\24\1\25\1\26\1\7\1\27"+
    "\1\5\1\7\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
    "\1\56\1\57\1\5\1\11\1\5\3\60\1\61\1\62"+
    "\57\60\2\5\1\60\44\63\1\64\22\63\3\65\1\66"+
    "\1\67\27\65\1\70\31\65\1\71\70\0\1\6\4\0"+
    "\1\72\61\0\2\7\3\0\11\7\1\0\4\7\1\0"+
    "\5\7\1\0\1\7\37\0\1\11\64\0\1\7\3\0"+
    "\11\7\1\0\4\7\1\0\5\7\1\0\1\7\34\0"+
    "\2\7\3\0\3\7\1\73\5\7\1\0\4\7\1\0"+
    "\5\7\1\0\1\7\34\0\2\7\3\0\5\7\1\74"+
    "\3\7\1\0\4\7\1\0\5\7\1\0\1\7\34\0"+
    "\2\7\3\0\10\7\1\75\1\0\4\7\1\0\5\7"+
    "\1\0\1\7\34\0\2\7\3\0\4\7\1\76\2\7"+
    "\1\77\1\7\1\0\3\7\1\100\1\0\5\7\1\0"+
    "\1\7\62\0\1\101\40\0\2\7\3\0\11\7\1\0"+
    "\4\7\1\0\2\7\1\102\2\7\1\0\1\7\34\0"+
    "\2\7\3\0\4\7\1\103\4\7\1\0\4\7\1\0"+
    "\5\7\1\0\1\7\34\0\2\7\3\0\7\7\1\104"+
    "\1\7\1\0\3\7\1\105\1\0\5\7\1\0\1\7"+
    "\47\0\1\106\4\0\1\107\46\0\2\7\3\0\6\7"+
    "\1\110\2\7\1\0\1\7\1\111\2\7\1\0\5\7"+
    "\1\0\1\7\34\0\2\7\3\0\5\7\1\112\3\7"+
    "\1\0\3\7\1\113\1\0\5\7\1\0\1\7\34\0"+
    "\2\7\3\0\11\7\1\0\4\7\1\0\3\7\1\114"+
    "\1\7\1\0\1\7\34\0\2\7\3\0\3\7\1\115"+
    "\5\7\1\0\4\7\1\0\5\7\1\0\1\7\70\0"+
    "\1\116\1\117\65\0\1\120\66\0\1\121\66\0\1\122"+
    "\72\0\1\123\71\0\1\124\26\0\1\62\145\0\1\62"+
    "\3\0\3\65\2\0\27\65\1\0\31\65\5\0\1\67"+
    "\62\0\3\125\2\0\3\125\1\126\1\127\7\125\1\130"+
    "\12\125\1\131\27\125\2\0\1\132\1\0\1\133\66\0"+
    "\2\7\3\0\4\7\1\134\4\7\1\0\4\7\1\0"+
    "\5\7\1\0\1\7\34\0\2\7\3\0\2\7\1\135"+
    "\6\7\1\0\4\7\1\0\5\7\1\0\1\7\34\0"+
    "\2\7\3\0\11\7\1\136\1\137\3\7\1\0\5\7"+
    "\1\0\1\7\34\0\2\7\3\0\11\7\1\0\1\7"+
    "\1\140\2\7\1\0\5\7\1\0\1\7\34\0\2\7"+
    "\3\0\10\7\1\141\1\0\4\7\1\0\5\7\1\0"+
    "\1\7\34\0\2\7\3\0\3\7\1\142\5\7\1\0"+
    "\4\7\1\0\5\7\1\0\1\7\57\0\2\143\42\0"+
    "\2\7\3\0\11\7\1\0\4\7\1\143\1\144\4\7"+
    "\1\0\1\7\34\0\2\7\3\0\10\7\1\145\1\0"+
    "\4\7\1\0\5\7\1\0\1\7\34\0\2\7\3\0"+
    "\11\7\1\146\1\147\3\7\1\0\5\7\1\0\1\7"+
    "\34\0\2\7\3\0\11\7\1\0\1\7\1\150\2\7"+
    "\1\0\5\7\1\0\1\7\34\0\2\7\3\0\6\7"+
    "\1\151\2\7\1\0\4\7\1\0\5\7\1\0\1\7"+
    "\34\0\2\7\3\0\11\7\1\0\4\7\1\152\1\153"+
    "\4\7\1\0\1\7\34\0\2\7\3\0\5\7\1\154"+
    "\3\7\1\0\4\7\1\0\5\7\1\0\1\7\34\0"+
    "\2\7\3\0\5\7\1\155\3\7\1\0\4\7\1\0"+
    "\5\7\1\0\1\7\34\0\2\7\3\0\4\7\1\156"+
    "\4\7\1\0\4\7\1\0\5\7\1\0\1\7\46\0"+
    "\1\157\54\0\2\7\3\0\5\7\1\160\3\7\1\0"+
    "\4\7\1\0\5\7\1\0\1\7\34\0\2\7\3\0"+
    "\11\7\1\0\2\7\1\161\1\7\1\0\5\7\1\0"+
    "\1\7\34\0\2\7\3\0\11\7\1\162\1\134\3\7"+
    "\1\0\5\7\1\0\1\7\43\0\1\163\57\0\2\7"+
    "\3\0\2\7\1\164\6\7\1\0\4\7\1\0\5\7"+
    "\1\0\1\7\34\0\2\7\3\0\10\7\1\165\1\0"+
    "\4\7\1\0\5\7\1\0\1\7\46\0\1\166\54\0"+
    "\2\7\3\0\5\7\1\167\3\7\1\0\4\7\1\0"+
    "\5\7\1\0\1\7\34\0\2\7\3\0\2\7\1\170"+
    "\6\7\1\0\4\7\1\0\5\7\1\0\1\7\34\0"+
    "\2\7\3\0\7\7\1\171\1\7\1\0\4\7\1\0"+
    "\5\7\1\0\1\7\51\0\1\172\51\0\2\7\3\0"+
    "\10\7\1\173\1\0\4\7\1\0\5\7\1\0\1\7"+
    "\34\0\2\7\3\0\7\7\1\174\1\7\1\0\4\7"+
    "\1\0\5\7\1\0\1\7\34\0\2\7\3\0\3\7"+
    "\1\175\5\7\1\0\4\7\1\0\5\7\1\0\1\7"+
    "\34\0\2\7\3\0\2\7\1\176\6\7\1\0\4\7"+
    "\1\0\5\7\1\0\1\7\46\0\1\177\75\0\1\200"+
    "\45\0\2\7\3\0\11\7\1\0\2\7\1\201\1\7"+
    "\1\0\5\7\1\0\1\7\34\0\2\7\3\0\11\7"+
    "\1\0\4\7\1\202\1\203\4\7\1\0\1\7\34\0"+
    "\2\7\3\0\4\7\1\204\4\7\1\0\4\7\1\0"+
    "\5\7\1\0\1\7\46\0\1\205\54\0\2\7\3\0"+
    "\5\7\1\206\3\7\1\0\4\7\1\0\5\7\1\0"+
    "\1\7\34\0\2\7\3\0\11\7\1\0\4\7\1\0"+
    "\5\7\1\207\1\210\34\0\2\7\3\0\11\7\1\0"+
    "\1\7\1\211\2\7\1\0\5\7\1\0\1\7\34\0"+
    "\2\7\3\0\11\7\1\0\4\7\1\212\1\213\4\7"+
    "\1\0\1\7\63\0\1\214\37\0\2\7\3\0\11\7"+
    "\1\0\4\7\1\0\3\7\1\215\1\7\1\0\1\7"+
    "\54\0\1\216\46\0\2\7\3\0\11\7\1\0\1\7"+
    "\1\217\2\7\1\0\5\7\1\0\1\7\34\0\2\7"+
    "\3\0\10\7\1\220\1\0\4\7\1\0\5\7\1\0"+
    "\1\7\56\0\1\221\44\0\2\7\3\0\11\7\1\0"+
    "\3\7\1\222\1\0\5\7\1\0\1\7\45\0\1\223"+
    "\55\0\2\7\3\0\4\7\1\224\4\7\1\0\4\7"+
    "\1\0\5\7\1\0\1\7\34\0\2\7\3\0\2\7"+
    "\1\225\6\7\1\0\4\7\1\0\5\7\1\0\1\7"+
    "\54\0\1\226\46\0\2\7\3\0\11\7\1\0\1\7"+
    "\1\227\2\7\1\0\5\7\1\0\1\7\46\0\1\230"+
    "\54\0\2\7\3\0\5\7\1\231\3\7\1\0\4\7"+
    "\1\0\5\7\1\0\1\7\33\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4950];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\1\11\3\1\1\11\16\1\1\11\5\1\21\11"+
    "\1\1\1\11\1\1\2\11\3\1\2\11\1\1\1\0"+
    "\6\1\1\0\4\1\2\11\6\1\15\11\3\1\1\0"+
    "\4\1\1\0\2\1\1\0\3\1\1\0\4\1\1\11"+
    "\2\1\2\0\2\1\1\11\3\1\1\0\4\1\1\11"+
    "\1\0\1\1\1\0\2\1\1\11\1\1\1\11\2\1"+
    "\1\0\1\1\1\11\1\1\1\0\2\1\1\0\1\1"+
    "\1\0\2\1\1\11\1\1\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[153];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    /**
     * Guarda el texto de las cadenas
     */
    private StringBuilder string;

    /**
     * Creador de simbolos complejos
     */
    private ComplexSymbolFactory symbolFactory;

    /**
     * analizador
     */
    private AritLanguage aritLanguage;

    /**
     * Constructor del analizador lexico
     *
     * @param in Entrada que se va analizar
     * @param symbolFactory creador de simbolos complejos
     */
    public Lexer(java.io.Reader in, ComplexSymbolFactory symbolFactory, AritLanguage aritLanguage) {
	    this(in);
        string = new StringBuilder();
	    this.symbolFactory = symbolFactory;
        this.aritLanguage = aritLanguage;
    }

    /**
     * Metodo que devuelve un nuevo java_cup.runtime.Symbol
     *
     * @param name nombre que recibira el simbolo
     * @param sym numero de token
     * @param value valor que recibira el simbolo
     * @param buflength tam del valor
     * @return java_cup.runtime.Symbol
     */
    private Symbol symbol(String name, int sym, Object value, int buflength) {
        Location left = new Location(yyline + 1, yycolumn + yylength() - buflength, yychar + yylength() - buflength);
        Location right= new Location(yyline + 1, yycolumn + yylength(), yychar + yylength());
        return symbolFactory.newSymbol(name, sym, left, right, value);
    }

    /**
     * Metodo que devuelve un nuevo java_cup.runtime.Symbol
     *
     * @param name nombre que recibira el simbolo
     * @param sym numero de token
     * @return java_cup.runtime.Symbol
     */
    private Symbol symbol(String name, int sym) {
        Location left = new Location(yyline + 1, yycolumn + 1, yychar);
        Location right= new Location(yyline + 1, yycolumn + yylength(), yychar + yylength());
        return symbolFactory.newSymbol(name, sym, left, right);
    }

    /**
     * Devuelve un nuevo java_cup.runtime.Symbol
     *
     * @param name nombre que recibira el simbolo
     * @param sym numero de token
     * @param val valor que recibira el simbolo
     * @return java_cup.runtime.Symbol
     */
    private Symbol symbol(String name, int sym, Object val) {
        Location left = new Location(yyline + 1, yycolumn + 1, yychar);
        Location right= new Location(yyline + 1, yycolumn + yylength(), yychar + yylength());
        return symbolFactory.newSymbol(name, sym, left, right, val);
    }

    /**
     * Guarda los errores en el manejador
     *
     * @param message mensaje del error
     */
    private void error(String message) {
        aritLanguage.addLexicalError(message, new NodeInfo(yyline + 1, yycolumn + 1, aritLanguage.filename));
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 228) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
            switch (zzLexicalState) {
            case COMENTARIO_TRADICIONAL: {
              yybegin(YYINITIAL);
            }  // fall though
            case 154: break;
            default:
          {     return symbolFactory.newSymbol(
        "EOF", Sym.EOF,
        new Location(yyline + 1, yycolumn + 1, yychar),
        new Location(yyline + 1, yycolumn + 1, yychar + 1)
    );
 }
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { error("Error: Carácter no valido '"+ yytext () +"'.");
            } 
            // fall through
          case 63: break;
          case 2: 
            { int valor = 0;
                            try {
                                valor = Integer.parseInt(yytext());
                            } catch (NumberFormatException ex) {
                                error("Error: Numero "+ yytext () +" fuera del rango de un integer.");
                            }
                            return symbol("`Integer Literal`", Sym.LIT_ENTERO, valor);
            } 
            // fall through
          case 64: break;
          case 3: 
            { return symbol("`Identifier: '" + yytext() + "'`", Sym.ID, yytext().toLowerCase());
            } 
            // fall through
          case 65: break;
          case 4: 
            { /* IGNORAR ESPACIOS */
            } 
            // fall through
          case 66: break;
          case 5: 
            { string.setLength(0); yybegin(CADENA);
            } 
            // fall through
          case 67: break;
          case 6: 
            { return symbol("`=`",  Sym.IGUAL);
            } 
            // fall through
          case 68: break;
          case 7: 
            { return symbol("`>`",  Sym.MAYOR_QUE);
            } 
            // fall through
          case 69: break;
          case 8: 
            { return symbol("`!`",  Sym.NOT);
            } 
            // fall through
          case 70: break;
          case 9: 
            { return symbol("`<`",  Sym.MENOR_QUE);
            } 
            // fall through
          case 71: break;
          case 10: 
            { return symbol("`+`",  Sym.MAS);
            } 
            // fall through
          case 72: break;
          case 11: 
            { return symbol("`-`",  Sym.MENOS);
            } 
            // fall through
          case 73: break;
          case 12: 
            { return symbol("`*`",  Sym.MULT);
            } 
            // fall through
          case 74: break;
          case 13: 
            { return symbol("`/`",  Sym.DIV);
            } 
            // fall through
          case 75: break;
          case 14: 
            { return symbol("`^`",  Sym.POTENCIA);
            } 
            // fall through
          case 76: break;
          case 15: 
            { return symbol("`?`",  Sym.INTERROGANTE);
            } 
            // fall through
          case 77: break;
          case 16: 
            { return symbol("`:`",  Sym.DOS_PUNTOS);
            } 
            // fall through
          case 78: break;
          case 17: 
            { return symbol("`|`",  Sym.OR);
            } 
            // fall through
          case 79: break;
          case 18: 
            { return symbol("`&`",  Sym.AND);
            } 
            // fall through
          case 80: break;
          case 19: 
            { return symbol("`(`",  Sym.PAR_IZQ);
            } 
            // fall through
          case 81: break;
          case 20: 
            { return symbol("`)`",  Sym.PAR_DER);
            } 
            // fall through
          case 82: break;
          case 21: 
            { return symbol("`[`",  Sym.COR_IZQ);
            } 
            // fall through
          case 83: break;
          case 22: 
            { return symbol("`]`",  Sym.COR_DER);
            } 
            // fall through
          case 84: break;
          case 23: 
            { return symbol("`;`",  Sym.PUNTO_COMA);
            } 
            // fall through
          case 85: break;
          case 24: 
            { return symbol("`,`",  Sym.COMA);
            } 
            // fall through
          case 86: break;
          case 25: 
            { return symbol("`{`",  Sym.LLAVE_IZQ);
            } 
            // fall through
          case 87: break;
          case 26: 
            { return symbol("`}`",  Sym.LLAVE_DER);
            } 
            // fall through
          case 88: break;
          case 27: 
            { yybegin(COMENTARIO_DE_FIN_DE_LINEA);
            } 
            // fall through
          case 89: break;
          case 28: 
            { /* IGNORAR */
            } 
            // fall through
          case 90: break;
          case 29: 
            { yybegin(YYINITIAL);
            } 
            // fall through
          case 91: break;
          case 30: 
            { /* IGNORAR CUALQUIER COSA */
            } 
            // fall through
          case 92: break;
          case 31: 
            { string.append(yytext());
            } 
            // fall through
          case 93: break;
          case 32: 
            { yybegin(YYINITIAL);
                            error("Error: final de linea inesperado.");
            } 
            // fall through
          case 94: break;
          case 33: 
            { yybegin(YYINITIAL);
                            return symbol("`String Literal`", Sym.LIT_STRING, string.toString(), string.length());
            } 
            // fall through
          case 95: break;
          case 34: 
            { return symbol("`if`", Sym.IF);
            } 
            // fall through
          case 96: break;
          case 35: 
            { return symbol("`in`", Sym.IN);
            } 
            // fall through
          case 97: break;
          case 36: 
            { return symbol("`do`", Sym.DO);
            } 
            // fall through
          case 98: break;
          case 37: 
            { return symbol("`==`", Sym.IGUAL_QUE);
            } 
            // fall through
          case 99: break;
          case 38: 
            { return symbol("`=>`", Sym.LAMBDA);
            } 
            // fall through
          case 100: break;
          case 39: 
            { return symbol("`>=`", Sym.MAYOR_IGUAL_QUE);
            } 
            // fall through
          case 101: break;
          case 40: 
            { return symbol("`!=`", Sym.DIFERENTE_QUE);
            } 
            // fall through
          case 102: break;
          case 41: 
            { return symbol("`<=`", Sym.MENOR_IGUAL_QUE);
            } 
            // fall through
          case 103: break;
          case 42: 
            { return symbol("`%`",  Sym.MODULO);
            } 
            // fall through
          case 104: break;
          case 43: 
            { yybegin(COMENTARIO_TRADICIONAL);
            } 
            // fall through
          case 105: break;
          case 44: 
            { error("Error: no se esperaba el escape \\." + yytext()); string.append(yytext());
            } 
            // fall through
          case 106: break;
          case 45: 
            { string.append('\t');
            } 
            // fall through
          case 107: break;
          case 46: 
            { string.append('\r');
            } 
            // fall through
          case 108: break;
          case 47: 
            { string.append('\n');
            } 
            // fall through
          case 109: break;
          case 48: 
            { string.append('\"');
            } 
            // fall through
          case 110: break;
          case 49: 
            { string.append('\\');
            } 
            // fall through
          case 111: break;
          case 50: 
            { double valor = 0;
                            try {
                                valor = Double.parseDouble(yytext());
                            } catch (NumberFormatException ex) {
                                error("Error: "+ yytext () +" fuera del rango de un decimal.");
                            }
                            return symbol("`Decimal Literal`", Sym.LIT_DECIMAL, valor);
            } 
            // fall through
          case 112: break;
          case 51: 
            { return symbol("`for`", Sym.FOR);
            } 
            // fall through
          case 113: break;
          case 52: 
            { return symbol(yytext(), Sym.LIT_BOOLEANO, Boolean.parseBoolean(yytext()));
            } 
            // fall through
          case 114: break;
          case 53: 
            { return symbol("`else`", Sym.ELSE);
            } 
            // fall through
          case 115: break;
          case 54: 
            { return symbol("null", Sym.NULL);
            } 
            // fall through
          case 116: break;
          case 55: 
            { return symbol("`case`", Sym.CASE);
            } 
            // fall through
          case 117: break;
          case 56: 
            { return symbol("`while`", Sym.WHILE);
            } 
            // fall through
          case 118: break;
          case 57: 
            { return symbol("`break`", Sym.BREAK);
            } 
            // fall through
          case 119: break;
          case 58: 
            { return symbol("`return`", Sym.RETURN);
            } 
            // fall through
          case 120: break;
          case 59: 
            { return symbol("`switch`", Sym.SWITCH);
            } 
            // fall through
          case 121: break;
          case 60: 
            { return symbol("`default`", Sym.DEFAULT);
            } 
            // fall through
          case 122: break;
          case 61: 
            { return symbol("`function`", Sym.FUNCTION);
            } 
            // fall through
          case 123: break;
          case 62: 
            { return symbol("`continue`", Sym.CONTINUE);
            } 
            // fall through
          case 124: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
