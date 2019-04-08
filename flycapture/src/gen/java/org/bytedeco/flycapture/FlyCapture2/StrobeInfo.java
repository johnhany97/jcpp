// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /** A camera strobe property. */
    @Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class StrobeInfo extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public StrobeInfo(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public StrobeInfo(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public StrobeInfo position(long position) {
            return (StrobeInfo)super.position(position);
        }
    
        /** Source value. */
        public native @Cast("unsigned int") int source(); public native StrobeInfo source(int setter);
        /** Presence of strobe. */
        public native @Cast("bool") boolean present(); public native StrobeInfo present(boolean setter);
        /** Flag indicating if strobe value can be read out. */
        public native @Cast("bool") boolean readOutSupported(); public native StrobeInfo readOutSupported(boolean setter);
        /** Flag indicating if on/off is supported. */
        public native @Cast("bool") boolean onOffSupported(); public native StrobeInfo onOffSupported(boolean setter);
        /** Flag indicating if polarity is supported. */
        public native @Cast("bool") boolean polaritySupported(); public native StrobeInfo polaritySupported(boolean setter);
        /** Minimum value. */
        public native float minValue(); public native StrobeInfo minValue(float setter);
        /** Maximum value. */
        public native float maxValue(); public native StrobeInfo maxValue(float setter);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native StrobeInfo reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public StrobeInfo() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
