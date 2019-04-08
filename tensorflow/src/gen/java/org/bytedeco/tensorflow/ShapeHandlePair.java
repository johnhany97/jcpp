// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@NoOffset @Name("std::pair<tensorflow::shape_inference::ShapeHandle,tensorflow::shape_inference::ShapeHandle>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ShapeHandlePair extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ShapeHandlePair(Pointer p) { super(p); }
    public ShapeHandlePair(ShapeHandle firstValue, ShapeHandle secondValue) { this(); put(firstValue, secondValue); }
    public ShapeHandlePair()       { allocate();  }
    private native void allocate();
    public native @Name("operator=") @ByRef ShapeHandlePair put(@ByRef ShapeHandlePair x);


    @MemberGetter public native @ByRef ShapeHandle first(); public native ShapeHandlePair first(ShapeHandle first);
    @MemberGetter public native @ByRef ShapeHandle second();  public native ShapeHandlePair second(ShapeHandle second);

    public ShapeHandlePair put(ShapeHandle firstValue, ShapeHandle secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }
}

