/*******************************************************************************
 * Copyright (c) 2011, 2012, 2013, 2014 Red Hat, Inc.
 * All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.eclipse.bpmn2.modeler.core.features;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.bpmn2.modeler.core.features.messages"; //$NON-NLS-1$
	public static String AbstractBpmn2CreateConnectionFeature_Create;
	public static String AbstractBpmn2CreateFeature_Create;
	public static String AbstractUpdateBaseElementFeature_Name;
	public static String BPMNDiagramFeatureContainer_Disable_Enable_Description;
	public static String BPMNDiagramFeatureContainer_Disable_Name;
	public static String BPMNDiagramFeatureContainer_Enable_Name;
	public static String BPMNDiagramFeatureContainer_Reroute_All_Description;
	public static String BPMNDiagramFeatureContainer_Reroute_All_Name;
	public static String ShowPropertiesFeature_Name;
	public static String ShowPropertiesFeature_Title;
	public static String CustomShapeFeatureContainer_Description;
	public static String CustomConnectionFeatureContainer_Description;
	public static String CustomElementFeatureContainer_Description;
	public static String CustomElementFeatureContainer_Create;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
