/*
 * Copyright 2019 the original author or authors.
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
package org.ml4j.nn.components.builders.synapses;

import org.ml4j.nn.components.NeuralComponent;
import org.ml4j.nn.components.builders.axons.ActivationFunctionPermitted;
import org.ml4j.nn.components.builders.axonsgraph.Axons3DGraphBuilder;

public interface CompletedSynapsesAxons3DGraphBuilder<P, Q, T extends NeuralComponent> extends Axons3DGraphBuilder<CompletedSynapsesAxons3DGraphBuilder<P, Q, T>, CompletedSynapsesAxonsGraphBuilder<Q, T>, T>, ActivationFunctionPermitted<SynapsesEnder<P>>{

	P endSynapses();
}
