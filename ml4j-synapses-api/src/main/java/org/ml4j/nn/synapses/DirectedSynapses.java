/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.ml4j.nn.synapses;

import org.ml4j.nn.activationfunctions.DifferentiableActivationFunction;
import org.ml4j.nn.axons.Axons;
import org.ml4j.nn.neurons.NeuronsActivation;

/**
 * DirectedSynapses are containers for Axons with a DifferentiableActivationFunction applied
 * to the right hand Axons output on a push of data left-to-right during forward propagation.
 * 
 * @author Michael Lavelle
 *
 * @param <A> The type of Axons within these DirectedSynapses
 * @param <S> The type of DirectedSynapses
 */
public interface DirectedSynapses<A extends Axons<?, ?, ?>>
    extends Synapses<A, DirectedSynapses<A>> {

  /**
   * @return The DifferentiableActivationFunction applied
   *     to the right hand Axons output on a push of data left-to-right.
   */
  DifferentiableActivationFunction getActivationFunction();

  /**
   * Forward Propagates the activations through the Synapses via the Axons and 
   * DifferentiableActivationFunction.
   * 
   * @param neuronsActivation The NeuronsActivation at the left hand side of these DirectedSynapses
   * @param synapsesContext The context within which we forward propagate the activations
   * @return A DirectedSynapsesActivation encapsulating the artifacts generated by this forward 
   *        propagation  - including the NeuronsActivation output from the right hand side of these 
   *        DirectedSynapses.
   */
  DirectedSynapsesActivation forwardPropagate(NeuronsActivation neuronsActivation,
      DirectedSynapsesContext synapsesContext);

}