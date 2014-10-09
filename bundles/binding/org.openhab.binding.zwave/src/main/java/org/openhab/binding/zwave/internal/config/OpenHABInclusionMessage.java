/**
 * Copyright (c) 2010-2014, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.zwave.internal.config;

import java.util.Date;


/**
 * Defines the configuration record. Used to pass configuration information from
 * a binding in openHAB to a GUI via the REST interface
 * 
 * @author Chris Jackson
 * @since 1.4.0
 * 
 */
public class OpenHABInclusionMessage  extends OpenHABConfigurationRecord {
	public String domain;
	public String name;
	public Date date;
	public MESSAGESTATE state;
	public String message;
	public String messagetype;
	public int messagevalue;
	public int nodeid;
	
	enum MESSAGESTATE {
		OK, WARNING, ERROR, INITIALIZING, LISTENING
	}
	
	/**
	 * Default constructor
	 */
	OpenHABInclusionMessage() {
	}

	/**
	 * Constructor for a record.
	 * 
	 * @param domain
	 *            Domain in which this record sits. The domain allows the system
	 *            to identify a record in a multitierd array. If the domain
	 *            terminates in a / it is assumed to have children
	 * @param name
	 *            The name is the identifier that the system uses to uniquely
	 *            identify the record within the domain. It is not shown to the
	 *            user.
	 * @param label
	 *            The label is the record name presented to the user
	 * @param readonly
	 *            If set to true, the record will be read only.
	 */
	OpenHABInclusionMessage(String domain, String name, String label) {
		this.domain = domain + name;
		this.name = name;
		
	}

	/**
	 * Constructor for top level domain. This constructor is intended for use with top level domains
	 * 
	 * @param domain
	 *            Domain in which this record sits. The domain allows the system
	 *            to identify a record in a multitierd array. If the domain
	 *            terminates in a / it is assumed to have children
	 * @param label
	 *            The label is the record name presented to the user
	 */
	OpenHABInclusionMessage(String domain, String label) {
		this.domain = domain;
	}


	class Action {
		String name;
	}
}
