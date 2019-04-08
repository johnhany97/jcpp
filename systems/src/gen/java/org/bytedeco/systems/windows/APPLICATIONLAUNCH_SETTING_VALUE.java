// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


//
// Package definition for an experience button device notification.  When
// someone registers for GUID_EXPERIENCE_BUTTON, this is the definition of
// the setting data they'll get.
//
@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class APPLICATIONLAUNCH_SETTING_VALUE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public APPLICATIONLAUNCH_SETTING_VALUE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public APPLICATIONLAUNCH_SETTING_VALUE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public APPLICATIONLAUNCH_SETTING_VALUE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public APPLICATIONLAUNCH_SETTING_VALUE position(long position) {
        return (APPLICATIONLAUNCH_SETTING_VALUE)super.position(position);
    }


    //
    // System time when the most recent button press ocurred.  Note that this is
    // specified in 100ns internvals since January 1, 1601.
    //
    public native @ByRef LARGE_INTEGER ActivationTime(); public native APPLICATIONLAUNCH_SETTING_VALUE ActivationTime(LARGE_INTEGER setter);

    //
    // Reserved for internal use.
    //
    public native @Cast("DWORD") int Flags(); public native APPLICATIONLAUNCH_SETTING_VALUE Flags(int setter);

    //
    // which instance of this device was pressed?
    //
    public native @Cast("DWORD") int ButtonInstanceID(); public native APPLICATIONLAUNCH_SETTING_VALUE ButtonInstanceID(int setter);


}
