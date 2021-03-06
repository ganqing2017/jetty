//
//  ========================================================================
//  Copyright (c) 1995-2017 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//

package org.eclipse.jetty.cdi.websocket;

import org.eclipse.jetty.webapp.AbstractConfiguration;
import org.eclipse.jetty.webapp.WebSocketConfiguration;

/**
 * <p>Websocket CDI Configuration</p>
 * <p>This configuration configures the WebAppContext server/system classes to
 * be able to see {@link WebSocketCdiInitializer}  
 * </p>
 */
public class WebSocketCdiConfiguration extends AbstractConfiguration
{
    public WebSocketCdiConfiguration()
    {
        addDependencies(WebSocketConfiguration.class);
        protectAndExpose("org.eclipse.jetty.cdi.websocket.");
    }
}
