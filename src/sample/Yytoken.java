package sample;
/** 
 * @author itzijing@gmail: 
 * @version 创建时间：2012-10-26 上午1:04:37 
 * 类说明 
 */
class Yytoken {
	  public int m_index;
	  public String m_text;
	  public int m_line;
	  public int m_charBegin;
	  public int m_charEnd;
	  
	  Yytoken (int index, String text, int line, int charBegin, int charEnd) {
	     m_index = index;
	    m_text = text;
	    m_line = line;
	    m_charBegin = charBegin;
	    m_charEnd = charEnd;
	  }

	  public String toString() {
	    return "Text   : "+m_text+
	           "\nindex : "+m_index+
	           "\nline  : "+m_line+
	           "\ncBeg. : "+m_charBegin+
	           "\ncEnd. : "+m_charEnd;
	  }
	}

