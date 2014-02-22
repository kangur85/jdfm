/* Generated By:JavaCC: Do not edit this line. DfmParser.java */
/*
 * The MIT License
 *
 * Copyright 2014 Krzysztof Kaszkowiak.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package eu.kaszkowiak.jdfm.parser;

import java.io.Reader;
import java.io.StringReader;
import eu.kaszkowiak.jdfm.model.*;

public class DfmParser implements DfmParserConstants {

     public DfmParser(String source) {
        this((Reader)(new StringReader(source)));
    }

  final public DfmObject parse() throws ParseException {
    DfmObject res;
    res = dfmObject();
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ENDLINE:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      jj_consume_token(ENDLINE);
    }
    jj_consume_token(0);
      {if (true) return res;}
    throw new Error("Missing return statement in function");
  }

  final private DfmObject dfmObject() throws ParseException {
    DfmObject res = new DfmObject();
    DfmProperty prop;
    DfmObject obj;
    String name;
    String type;
    jj_consume_token(OBJECT);
    name = identifier();
                            res.setName( name );
    jj_consume_token(COLON);
    type = type();
                            res.setType( type );
    jj_consume_token(ENDLINE);
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OBJECT:
        obj = dfmObject();
                                   res.addChild(obj);
        jj_consume_token(ENDLINE);
        break;
      case IDENTIFIER:
        prop = property();
                                   res.addProperty(prop);
        break;
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OBJECT:
      case IDENTIFIER:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_2;
      }
    }
    jj_consume_token(END);
      {if (true) return res;}
    throw new Error("Missing return statement in function");
  }

  final private String identifier() throws ParseException {
    Token tStr;
    tStr = jj_consume_token(IDENTIFIER);
        {if (true) return tStr.image;}
    throw new Error("Missing return statement in function");
  }

  final private String type() throws ParseException {
    Token tStr;
    tStr = jj_consume_token(IDENTIFIER);
        {if (true) return tStr.image;}
    throw new Error("Missing return statement in function");
  }

  final private DfmProperty property() throws ParseException {
    String propertyName;
    DfmProperty res;
    propertyName = identifier();
    jj_consume_token(EQUAL);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case STRING_SQ:
    case HASH_STRING:
      res = stringProperty();
      break;
    case PARENS:
    case BRACKETS:
    case CROCODILE_BRACKETS:
    case IDENTIFIER:
      res = unknownProperty();
      break;
    case HEX_DATA:
      res = byteArrayProperty();
      break;
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(ENDLINE);
            res.setName(propertyName);
            {if (true) return res;}
    throw new Error("Missing return statement in function");
  }

  final private DfmStringProperty unknownProperty() throws ParseException {
    Token tStr;
    DfmStringProperty res = new DfmStringProperty();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PARENS:
      tStr = jj_consume_token(PARENS);
      break;
    case BRACKETS:
      tStr = jj_consume_token(BRACKETS);
      break;
    case CROCODILE_BRACKETS:
      tStr = jj_consume_token(CROCODILE_BRACKETS);
      break;
    case IDENTIFIER:
      tStr = jj_consume_token(IDENTIFIER);
      break;
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
        res.convertFromString(tStr.image);
        {if (true) return res;}
    throw new Error("Missing return statement in function");
  }

  final private DfmStringProperty stringProperty() throws ParseException {
    Token tStr;
    DfmStringProperty res = new DfmStringProperty();
    String resValue = "";
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case STRING_SQ:
        tStr = jj_consume_token(STRING_SQ);
        break;
      case HASH_STRING:
        tStr = jj_consume_token(HASH_STRING);
        break;
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
       resValue += tStr.image;
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case STRING_SQ:
      case HASH_STRING:
        ;
        break;
      default:
        jj_la1[6] = jj_gen;
        break label_3;
      }
    }
        res.convertFromString(resValue);
        {if (true) return res;}
    throw new Error("Missing return statement in function");
  }

  final private DfmByteArrayProperty byteArrayProperty() throws ParseException {
    Token tStr;
    DfmByteArrayProperty res = new DfmByteArrayProperty();
    tStr = jj_consume_token(HEX_DATA);
        res.convertFromString(tStr.image);
        {if (true) return res;}
    throw new Error("Missing return statement in function");
  }

  /** Generated Token Manager. */
  public DfmParserTokenManager token_source;
  JavaCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[7];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x400000,0xa00000,0xa00000,0x1812490,0x802480,0x1000010,0x1000010,};
   }

  /** Constructor with InputStream. */
  public DfmParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public DfmParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new JavaCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new DfmParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public DfmParser(java.io.Reader stream) {
    jj_input_stream = new JavaCharStream(stream, 1, 1);
    token_source = new DfmParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public DfmParser(DfmParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(DfmParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[25];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 7; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 25; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
