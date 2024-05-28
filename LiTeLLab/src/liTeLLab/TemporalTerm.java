/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */

package liTeLLab;

public abstract class TemporalTerm extends OLTLFormula {
	public abstract String getDataObjectName();
	public abstract String getAtTime(int t);
}
