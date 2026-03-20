package com.kh.chap01.Run;

import com.kh.chap01.condition.ConditionIf;
import com.kh.chap02.loop.LoopFor;
import com.kh.chap01.condition.ConditionElse;
import com.kh.chap02.loop.LoopWhile;
import com.kh.chap03.escape.EscapeBreak;

public class Run {

	public static void main(String[] args) {
		
		//ConditionIf ci = new ConditionIf();
		//ci.method1();
		//ci.quiz();
		//ConditionElse ce = new ConditionElse();
		//ce.method1();
		//LoopFor lf = new LoopFor();
		//lf.gugudan();
		//lf.mainMenu();
		LoopWhile lw = new LoopWhile();
		//lw.method1();
		//lw.method2();
		//lw.method3();
		EscapeBreak eb = new EscapeBreak();
		//eb.method1();
		eb.checkId();
	}
	
}
