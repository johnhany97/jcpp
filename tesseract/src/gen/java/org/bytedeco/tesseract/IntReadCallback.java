// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.lept.*;

import static org.bytedeco.tesseract.global.tesseract.*;


@Name("TessResultCallback2<bool,tesseract::TFile*,int*>") @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class IntReadCallback extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IntReadCallback() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IntReadCallback(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IntReadCallback(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IntReadCallback position(long position) {
        return (IntReadCallback)super.position(position);
    }

  @Virtual(true) public native @Cast("bool") boolean Run(TFile arg0,IntPointer arg1);
}
