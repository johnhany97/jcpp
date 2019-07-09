// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.spinnaker.Spinnaker_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.spinnaker.global.Spinnaker_C.*;


/**
* Options for saving JPEG 2000 images. Used in saving PPM images
* with a call to spinImageSaveJpg2().
*/
@Properties(inherit = org.bytedeco.spinnaker.presets.Spinnaker_C.class)
public class spinJPG2Option extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public spinJPG2Option() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public spinJPG2Option(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public spinJPG2Option(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public spinJPG2Option position(long position) {
        return (spinJPG2Option)super.position(position);
    }

    /** JPEG saving quality in range (1-512). */
    public native @Cast("unsigned int") int quality(); public native spinJPG2Option quality(int setter);
    /** Reserved for future use. */
    public native @Cast("unsigned int") int reserved(int i); public native spinJPG2Option reserved(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();
    /*
    _spinJPG2Option()
    {
        quality = 16;
        memset(reserved, 0, sizeof(reserved));
    }*/
}
