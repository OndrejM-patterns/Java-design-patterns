package mihalyi.ondrej.javapatterns.builder;

/**
 * 
 * 
 * <p>Builder Design pattern is a creational pattern and should be used when number of parameter required in constructor is more than manageable usually 4 or at most 5. Don't confuse with Builder and Factory pattern there is an obvious difference between Builder and Factory pattern, as Factory can be used to create different implementation of same interface but Builder is tied up with its Container class and only returns object of Outer class.
 * </p>
 * <p>Read more: http://javarevisited.blogspot.com/2012/06/builder-design-pattern-in-java-example.html#ixzz24k0lvkil</p>
 *
 */
public class BuilderExample {
	public static void main(String[] args) {
		CarToBuild car = new CarToBuild.Builder().color("blue")
				.manufacturer("Ford").brand("T").build();
		System.out.println(car);
	}
}
