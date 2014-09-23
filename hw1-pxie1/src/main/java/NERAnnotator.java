import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.tutorial.RoomNumber;



public class NERAnnotator extends JCasAnnotator_ImplBase {


	private PosTagNamedEntityRecognizer myner;
	public NERAnnotator()  {

		try {
			myner=new PosTagNamedEntityRecognizer();
		} catch (ResourceInitializationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int[] getPosition(String stccontent, String entity)
	{
      int []idx=new int[2];
	  stccontent=stccontent.replaceAll("\\s+", "");
	  entity=entity.replaceAll("\\s+", "");
	  idx[0]=stccontent.indexOf(entity);
	  idx[1]=idx[0]+entity.length()-1;
	  return idx;
	}
	public void process(JCas aJCas) {
	    
		FSIterator it = aJCas.getAnnotationIndex(Sentence.type).iterator();
		   
	    if (it.hasNext()) {
	    	Sentence s=(Sentence)it.next();
		    Map<Integer, Integer> etts=myner.getGeneSpans(s.getContent());
		    for(Integer key: etts.keySet())
		    {
		      String entity=(s.getContent()).substring(key, etts.get(key));
		      int []entitypos=getPosition(s.getContent(), entity);
		      EntityMention em=new EntityMention(aJCas);
			  em.setStart(entitypos[0]);
			  em.setEnd(entitypos[1]);
			  em.setId(s.getId());
			  em.setContent(entity);
			  em.addToIndexes();
		      //System.out.println(entity);
		    }

	    }
	  }
}


