/*
 * Copyright 1999-2003 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */

package uk.ac.napier.javax.security.auth.callback;

import javax.security.auth.callback.Callback;

/**
 * Signals that a <code>CallbackHandler</code> does not
 * recognize a particular <code>Callback</code>.
 *
 */
public class UnsupportedCallbackException extends Exception {

    private static final long serialVersionUID = -6873556327655666839L;

    /**
     * @serial
     */
    private Callback callback;

    /**
     * Constructs a <code>UnsupportedCallbackException</code>
     * with no detail message.
     *
     * <p>
     *
     * @param callback the unrecognized <code>Callback</code>.
     */
    public UnsupportedCallbackException(Callback callback) {
        super();
        this.callback = callback;
    }

    /**
     * Constructs a UnsupportedCallbackException with the specified detail
     * message.  A detail message is a String that describes this particular
     * exception.
     *
     * <p>
     *
     * @param callback the unrecognized <code>Callback</code>. <p>
     *
     * @param msg the detail message.
     */
    public UnsupportedCallbackException(Callback callback, String msg) {
        super(msg);
        this.callback = callback;
    }

    /**
     * Get the unrecognized <code>Callback</code>.
     *
     * <p>
     *
     * @return the unrecognized <code>Callback</code>.
     */
    public Callback getCallback() {
        return callback;
    }
}
