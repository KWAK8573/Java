package chapter.l20_12_04;

import java.util.function.Predicate;

public class MyPreadicate implements Predicate<Apple>{

	@Override
	public boolean test(Apple t) {

		return false;
    }
    public boolean test(Apple t,int w){
        return t.getWeight() > w;
    }
    
}
