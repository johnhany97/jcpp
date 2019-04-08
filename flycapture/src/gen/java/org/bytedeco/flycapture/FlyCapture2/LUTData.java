// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /** Information about the camera's look up table. */
    @Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class LUTData extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public LUTData(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public LUTData(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public LUTData position(long position) {
            return (LUTData)super.position(position);
        }
    
        /** Flag indicating if LUT is supported. */
        public native @Cast("bool") boolean supported(); public native LUTData supported(boolean setter);
        /** Flag indicating if LUT is enabled. */
        public native @Cast("bool") boolean enabled(); public native LUTData enabled(boolean setter);
        /** The number of LUT banks available (Always 1 for PGR LUT). */
        public native @Cast("unsigned int") int numBanks(); public native LUTData numBanks(int setter);
        /** The number of LUT channels per bank available. */
        public native @Cast("unsigned int") int numChannels(); public native LUTData numChannels(int setter);
        /** The input bit depth of the LUT. */
        public native @Cast("unsigned int") int inputBitDepth(); public native LUTData inputBitDepth(int setter);
        /** The output bit depth of the LUT. */
        public native @Cast("unsigned int") int outputBitDepth(); public native LUTData outputBitDepth(int setter);
        /** The number of entries in the LUT. */
        public native @Cast("unsigned int") int numEntries(); public native LUTData numEntries(int setter);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native LUTData reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public LUTData() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
