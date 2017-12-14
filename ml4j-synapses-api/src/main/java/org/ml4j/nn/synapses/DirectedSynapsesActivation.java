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

import org.ml4j.nn.activationfunctions.DifferentiableActivationFunctionActivation;
import org.ml4j.nn.axons.AxonsActivation;
import org.ml4j.nn.costfunctions.CostFunctionGradient;
import org.ml4j.nn.neurons.NeuronsActivation;

/**
 * Encapsulates the artifacts generated by a forward propagation through DirectedSynapses -
 * including the NeuronsActivation output from the right hand side of the DirectedSynapses.
 * 
 * @author Michael Lavelle
 */
public interface DirectedSynapsesActivation {

  /**
   * @return The NeuronsActivation output from the right hand side of DirectedSynapses 
   *        following a forward propagation.
   */
  public NeuronsActivation getOutput();
  
  /**
   * @return The DirectedSynapses that generated this DirectedSynapsesActivation.
   */
  public DirectedSynapses<?, ?> getSynapses();

  public AxonsActivation getAxonsActivation();
  
  /**
   * @return The activation of the ActivationFunction.
   */
  public DifferentiableActivationFunctionActivation getActivationFunctionActivation();
  
  public NeuronsActivation getInput();


  /**
   * @param outerGradient The outer gradient to back propagate.
   * @param synapsesContext The synapses context.
   * @param regularisationLamdda The regularisation lambda for the axons of these 
   *        Synapses.
   * @return The back propagated DirectedSynapsesGradient.
   */
  public DirectedSynapsesGradient backPropagate(DirectedSynapsesGradient outerGradient,
      DirectedSynapsesContext synapsesContext, 
      double regularisationLamdda);
  
  
  /**
   * @param outerGradient The outer gradient to back propagate.
   * @param synapsesContext The synapses context.
   * @param regularisationLamdda The regularisation lambda for the axons of these 
   *        Synapses.
   * @return The back propagated DirectedSynapsesGradient.
   */
  public DirectedSynapsesGradient backPropagate(CostFunctionGradient outerGradient,
      DirectedSynapsesContext synapsesContext, 
      double regularisationLamdda);
  
  /**
   * The total regularisation cost of these synapse.
   * 
   * @param regularisationLambda The regularisation lambda
   * @return The total regularisation cost.
   */
  double getTotalRegularisationCost(double regularisationLambda);
  
  /**
   * The average regularisation cost of these synapse.
   * 
   * @param regularisationLambda The regularisation lambda
   * @return The total regularisation cost.
   */
  double getAverageRegularisationCost(double regularisationLambda);

}
