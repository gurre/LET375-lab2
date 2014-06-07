import java.util.*;
public class SignFunctor implements UnaryOp<Integer,Integer> {
	
	public Integer op(Integer x) {
		return x.compareTo(0);
	}
} 