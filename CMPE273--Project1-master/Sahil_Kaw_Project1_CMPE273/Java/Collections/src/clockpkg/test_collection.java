package clockpkg;

import java.util.List;

import org.junit.Test;

public class test_collection {
	
	
		
		Graph gh = new Graph(new String[]{"A","B","C"});
		@Test
		public void test(){
			gh.setEdge("A", "B");
			
			
		}
		@Test
		public void test1(){
			gh.getEdge("A");
			
			
		}
		@Test
		public void test2(){
			gh.main(null);
			
			
		}
		}

