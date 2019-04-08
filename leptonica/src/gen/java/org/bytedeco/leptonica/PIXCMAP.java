// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.leptonica.global.lept.*;


/** Colormap of a Pix */
@Name("PixColormap") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class PIXCMAP extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PIXCMAP() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PIXCMAP(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PIXCMAP(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PIXCMAP position(long position) {
        return (PIXCMAP)super.position(position);
    }

    /** colormap table (array of RGBA_QUAD)     */
    public native Pointer array(); public native PIXCMAP array(Pointer setter);
    /** of pix (1, 2, 4 or 8 bpp)               */
    public native @Cast("l_int32") int depth(); public native PIXCMAP depth(int setter);
    /** number of color entries allocated       */
    public native @Cast("l_int32") int nalloc(); public native PIXCMAP nalloc(int setter);
    /** number of color entries used            */
    public native @Cast("l_int32") int n(); public native PIXCMAP n(int setter);
}
