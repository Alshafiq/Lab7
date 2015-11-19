
final class BagImpl implements Bag {
	/**
	 * 
	 */
	private final BagExample bagImpl;

	/**
	 * @param bagExample
	 */
	BagImpl(BagExample bagExample) {
		bagImpl = bagExample;
	}

	Object o;

	public Object get()
	 {
	    return o;
	 }

	public void set(Object o)
	 {
	    this.o = o;
	 }
}