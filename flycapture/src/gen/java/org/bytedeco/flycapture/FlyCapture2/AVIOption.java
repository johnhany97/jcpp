// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /** Options for saving AVI files. */
    @Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class AVIOption extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public AVIOption(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public AVIOption(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public AVIOption position(long position) {
            return (AVIOption)super.position(position);
        }
    
        /** Frame rate of the stream */
        public native float frameRate(); public native AVIOption frameRate(float setter);

        /** Reserved for future use */
        public native @Cast("unsigned int") int reserved(int i); public native AVIOption reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public AVIOption() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
