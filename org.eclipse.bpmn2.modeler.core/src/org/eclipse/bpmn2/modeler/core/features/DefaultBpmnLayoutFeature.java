package org.eclipse.bpmn2.modeler.core.features;

import org.eclipse.bpmn2.di.BPMNEdge;
import org.eclipse.bpmn2.di.BPMNShape;
import org.eclipse.bpmn2.modeler.core.utils.AnchorUtil;
import org.eclipse.bpmn2.modeler.core.utils.FeatureSupport;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

public class DefaultBpmnLayoutFeature extends AbstractLayoutFeature {

	public DefaultBpmnLayoutFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canLayout(ILayoutContext context) {
		return true;
	}

	@Override
	public boolean layout(ILayoutContext context) {
		layoutConnections(context.getPictogramElement());
		return true;
	}

	@Override
	protected void layoutPictogramElement(PictogramElement pe) {
		super.layoutPictogramElement(pe);
	}
	
	public void layoutConnections(PictogramElement shape) {
		Diagram diagram = getDiagram();
		if (diagram!=null) {
			if (shape.getLink()!=null) {
				for (Object object : shape.getLink().getBusinessObjects()) {
					if (object instanceof BPMNShape) {
						AnchorUtil.reConnect((BPMNShape) object, diagram);
					}
					else if (object instanceof BPMNEdge) {
						AnchorUtil.reConnect((BPMNEdge) object, diagram);
					}
				}
			}
			
			if (shape instanceof ContainerShape) {
				for (PictogramElement pe : FeatureSupport.getContainerChildren((ContainerShape)shape)) {
					if (pe.getLink()!=null) {
						for (Object object : pe.getLink().getBusinessObjects()) {
							if (object instanceof BPMNShape) {
								AnchorUtil.reConnect((BPMNShape) object, diagram);
							}
							else if (object instanceof BPMNEdge) {
								AnchorUtil.reConnect((BPMNEdge) object, diagram);
							}
						}
					}
				}
			}
		}
	}
}
