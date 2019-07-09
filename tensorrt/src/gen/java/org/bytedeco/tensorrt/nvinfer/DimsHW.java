// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class DimsHW
 *  \brief Descriptor for two-dimensional spatial data.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class DimsHW extends Dims2 {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DimsHW(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DimsHW(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DimsHW position(long position) {
        return (DimsHW)super.position(position);
    }

    /**
     *  \brief Construct an empty DimsHW object.
     *  */
    
    
    //!
    //!
    //!
    public DimsHW() { super((Pointer)null); allocate(); }
    private native void allocate();

    /**
     *  \brief Construct a DimsHW given height and width.
     * 
     *  @param Height the height of the data
     *  @param Width the width of the data
     *  */
    
    
    //!
    //!
    //!
    public DimsHW(int height, int width) { super((Pointer)null); allocate(height, width); }
    private native void allocate(int height, int width);

    /**
     *  \brief Get the height.
     * 
     *  @return The height.
     *  */
    
    
    //!
    //!
    //!
    public native @ByRef IntPointer h();

    /**
     *  \brief Get the height.
     * 
     *  @return The height.
     *  */

    /**
     *  \brief Get the width.
     * 
     *  @return The width.
     *  */
    
    
    //!
    //!
    //!
    public native @ByRef IntPointer w();

    /**
     *  \brief Get the width.
     * 
     *  @return The width.
     *  */
}
