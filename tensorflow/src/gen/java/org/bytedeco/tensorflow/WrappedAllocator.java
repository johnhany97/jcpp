// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@NoOffset @Name("std::pair<tensorflow::Allocator*,tensorflow::TrackingAllocator*>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class WrappedAllocator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WrappedAllocator(Pointer p) { super(p); }
    public WrappedAllocator(Allocator firstValue, TrackingAllocator secondValue) { this(); put(firstValue, secondValue); }
    public WrappedAllocator()       { allocate();  }
    private native void allocate();
    public native @Name("operator=") @ByRef WrappedAllocator put(@ByRef WrappedAllocator x);


    @MemberGetter public native Allocator first(); public native WrappedAllocator first(Allocator first);
    @MemberGetter public native TrackingAllocator second();  public native WrappedAllocator second(TrackingAllocator second);

    public WrappedAllocator put(Allocator firstValue, TrackingAllocator secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }
}

