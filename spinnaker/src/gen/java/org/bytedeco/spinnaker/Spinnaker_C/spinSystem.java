// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.spinnaker.Spinnaker_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.spinnaker.global.Spinnaker_C.*;


 /**
 * \defgroup SpinnakerHandlesC Spinnaker C Handles
 *
 * Spinnaker C handle definitions
 */
 /*@{*/

/**
* Handle for system functionality. Created by calling
* spinSystemGetInstance(), which requires a call to
* spinSystemReleaseInstance() to release.
*/
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.spinnaker.presets.Spinnaker_C.class)
public class spinSystem extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public spinSystem() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public spinSystem(Pointer p) { super(p); }
}
