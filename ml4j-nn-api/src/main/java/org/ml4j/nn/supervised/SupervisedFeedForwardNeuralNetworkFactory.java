package org.ml4j.nn.supervised;

import java.util.List;

import org.ml4j.nn.components.DefaultChainableDirectedComponent;

public interface SupervisedFeedForwardNeuralNetworkFactory {

	SupervisedFeedForwardNeuralNetwork createSupervisedFeedForwardNeuralNetwork(List<DefaultChainableDirectedComponent<?, ?>> 
		componentChain);
}