package org.mifos.application.customer.client.business;

import static org.mifos.framework.util.helpers.NumberUtils.SHORT_ZERO;

import org.mifos.application.productdefinition.business.LoanOfferingBO;
import org.mifos.application.productdefinition.business.PrdOfferingBO;
import org.mifos.application.util.helpers.YesNoFlag;
import org.mifos.framework.business.PersistentObject;
import org.mifos.framework.util.helpers.Transformer;

public class LoanCounter extends PersistentObject {
	public static Transformer<LoanCounter, Short> TRANSFORM_LOAN_COUNTER_TO_LOAN_CYCLE = new Transformer<LoanCounter, Short>() {
		public Short transform(LoanCounter input) {
			return input.getLoanCycleCounter();
		}
	};

	private final Integer loanCounterId;

	private final ClientPerformanceHistoryEntity clientPerfHistory;

	private Short loanCycleCounter = SHORT_ZERO;

	private final LoanOfferingBO loanOffering;

	protected LoanCounter() {
		this.loanCounterId = null;
		this.clientPerfHistory = null;
		this.loanOffering = null;
		this.loanCycleCounter = 0;
	}

	public LoanCounter(ClientPerformanceHistoryEntity clientPerfHistory,
			LoanOfferingBO loanOffering, YesNoFlag counterFlag) {
		this.loanCounterId = null;
		this.clientPerfHistory = clientPerfHistory;
		this.loanOffering = loanOffering;
		updateLoanCounter(counterFlag);
	}

	public ClientPerformanceHistoryEntity getClientPerfHistory() {
		return clientPerfHistory;
	}

	public LoanOfferingBO getLoanOffering() {
		return loanOffering;
	}

	public Integer getLoanCounterId() {
		return loanCounterId;
	}

	public Short getLoanCycleCounter() {
		return loanCycleCounter;
	}

	void setLoanCycleCounter(Short loanCycleCounter) {
		this.loanCycleCounter = loanCycleCounter;
	}

	void updateLoanCounter(YesNoFlag counterFlag) {
		if (counterFlag.yes())
			this.loanCycleCounter++;
		else this.loanCycleCounter--;
	}

	public boolean isOfSameProduct(PrdOfferingBO prdOffering) {
		return loanOffering.isOfSameOffering(prdOffering);
	}
}
