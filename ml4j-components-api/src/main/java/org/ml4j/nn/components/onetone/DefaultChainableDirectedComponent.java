package org.ml4j.nn.components.onetone;

import java.util.List;

import org.ml4j.nn.components.ChainableDirectedComponent;
import org.ml4j.nn.neurons.Neurons;
import org.ml4j.nn.neurons.NeuronsActivation;


/**
 * A default chainable component within a DirectedNeuralNetwork where an input NeuronsActivation 
 * flows in a left-to-right direction through forward propagation.  
 * 
 * Error information in the form of a gradient NeuronsActivation is then flowed right-to-left through the
 * resulting DirectedComponentActivation instances via back propagation.
 * 
 * DefaultChainableDirectedComponent instances can be composed together in a sequential chain, as the
 * type of input and output are both single NeuronsActivation instances.
 * 
 * @author Michael Lavelle
 *
 * @param <I> The type of input and output of the ChainableDirectedComponent
 * @param <A> The type of activation produced by the ChainableDirectedComponent on forward propagation
 * @param <C> The context provided to the ChainableDirectedComponent on forward propagation.
 */
public interface DefaultChainableDirectedComponent<A extends DefaultChainableDirectedComponentActivation, C> extends ChainableDirectedComponent<NeuronsActivation, A, C> {

	@Override
	DefaultChainableDirectedComponent<A, C> dup();

	@Override
	List<DefaultChainableDirectedComponent<?, ?>> decompose();
	
	Neurons getInputNeurons();
	
	Neurons getOutputNeurons();
	
}