package org.ml4j.nn.components.onetone;

import org.ml4j.nn.components.DirectedComponentGradient;
import org.ml4j.nn.costfunctions.CostFunctionGradient;
import org.ml4j.nn.neurons.NeuronsActivation;

public interface TrailingActivationFunctionDirectedComponentChainActivation
		extends DefaultDirectedComponentChainActivation {

	/**
	 * @param outerGradient
	 *            The outer gradient to back propagate.
	 * @param synapsesContext
	 *            The synapses context.
	 * @return The back propagated DirectedComponentGradient.
	 */
	DirectedComponentGradient<NeuronsActivation> backPropagate(CostFunctionGradient outerGradient);
	
	
}