/**
 *
 */
package test.source;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import lex.Entailment;
import lex.Term;
import model.direct.Nouns;
import model.direct.NounsId;

import org.junit.Test;

import source.DirectAdapter;
import source.Source;

/**
 * @author mishraki
 *
 */
public class DirectAdapterTest {
	/**
	 * Test method for {@link source.DirectAdapter#getEntailments(lex.Term)}.
	 */
	@Test
	public final void testGetEntailments() {
		Source source = new DirectAdapter();
		Term term = new Term("chair", "n");
		List<Entailment> target = new ArrayList<Entailment>();
		/*"chair", "bench", "0.007152960000000000000000000000"
		"chair", "chairwoman", "0.007899270000000000000000000000"
		"chair", "table", "0.016973550000000000000000000000"
		"chair", "umpire", "0.022624730000000000000000000000"
		"chair", "vice", "0.011889260000000000000000000000"*/
		target.add(new Entailment(term,new Term("bench","n"),new BigDecimal(0.007152960000000000000000000000),source));
		target.add(new Entailment(term,new Term("chairwoman","n"),new BigDecimal(0.007899270000000000000000000000),source));
		target.add(new Entailment(term,new Term("table","n"),new BigDecimal(0.016973550000000000000000000000),source));
		target.add(new Entailment(term,new Term("umpire","n"),new BigDecimal(0.022624730000000000000000000000),source));
		target.add(new Entailment(term,new Term("vice","n"),new BigDecimal(0.011889260000000000000000000000),source));
		List<Entailment> res=source.getEntailments(term);
		/*HashSet<Entailment> targetSet = new HashSet<Entailment>(target);
		HashSet<Entailment> resSet = new HashSet<Entailment>(res);*/
		for(int i=0;i<5;i++){
			System.out.println(res.get(i) +"\n" +target.get(i));
		}
		/*if(!target.equals(res)){
			fail("Noune entailmant failure");
		}*/

		term = new Term("eat", "v");
		target.clear();
		/*
		 * eat, catch, 0.007475500000000000000000000000
eat, consume, 0.013397030000000000000000000000
eat, cook, 0.013925010000000000000000000000
eat, drink, 0.016035120000000000000000000000
eat, feed, 0.009235680000000000000000000000
eat, freeze, 0.006463660000000000000000000000
eat, hand out, 0.006603190000000000000000000000
eat, like, 0.018242000000000000000000000000
eat, produce, 0.014238450000000000000000000000
eat, serve, 0.008121270000000000000000000000
eat, smoke, 0.006279730000000000000000000000

		 */
		target.add(new Entailment(term,new Term("catch","v"),new BigDecimal(0.007475500000000000000000000000),source));
		target.add(new Entailment(term,new Term("consume","v"),new BigDecimal(0.013397030000000000000000000000),source));
		target.add(new Entailment(term,new Term("cook","v"),new BigDecimal(0.013925010000000000000000000000),source));
		target.add(new Entailment(term,new Term("drink","v"),new BigDecimal(0.016035120000000000000000000000),source));
		target.add(new Entailment(term,new Term("feed","v"),new BigDecimal(0.009235680000000000000000000000),source));
		target.add(new Entailment(term,new Term("freeze","v"),new BigDecimal(0.006463660000000000000000000000),source));
		target.add(new Entailment(term,new Term("hand out","v"),new BigDecimal(0.006603190000000000000000000000),source));
		target.add(new Entailment(term,new Term("like","v"),new BigDecimal(0.018242000000000000000000000000),source));
		target.add(new Entailment(term,new Term("produce","v"),new BigDecimal(0.014238450000000000000000000000),source));
		target.add(new Entailment(term,new Term("serve","v"),new BigDecimal(0.008121270000000000000000000000),source));
		target.add(new Entailment(term,new Term("smoke","v"),new BigDecimal(0.006279730000000000000000000000),source));
		res=source.getEntailments(term);
		for(int i=0;i<11;i++){
			System.out.println(res.get(i) +"\n" +target.get(i));
		}
		/*if(!target.equals(res)){
			fail("Verb entailmant failure");
		}*/
	}

}
