
public class Assignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Parent {
	protected String forInternalUseOnly;
}
class LeakyChild extends Parent {
	public String forInternalUseOnly() {
		return forInternalUseOnly;
	}
	
	public void forInternalUseOnly(String forInternalUseOnly) {
		this.forInternalUseOnly = forInternalUseOnly;
	}
}
