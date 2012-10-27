package sample;
/** 
 * @author itzijing@gmail: 
 * @version 创建时间：2012-10-26 上午1:03:56 
 * 类说明 
 */
class Utility {
	  
	  private static final String errorMsg[] = {
	    "Error: Unmatched end-of-comment punctuation.",
	    "Error: Unmatched start-of-comment punctuation.",
	    "Error: Unclosed string.",
	    "Error: Illegal character."
	    };
	  
	  public static final int E_ENDCOMMENT = 0; 
	  public static final int E_STARTCOMMENT = 1; 
	  public static final int E_UNCLOSEDSTR = 2; 
	  public static final int E_UNMATCHED = 3; 

	  public static void error(int code) {
		  System.out.println(errorMsg[code]);
	  }
	}

