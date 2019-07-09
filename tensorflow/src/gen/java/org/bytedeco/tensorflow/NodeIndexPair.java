// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@NoOffset @Name("std::pair<tensorflow::Node*,tensorflow::ImportGraphDefResults::Index>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class NodeIndexPair extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NodeIndexPair(Pointer p) { super(p); }
    public NodeIndexPair(Node firstValue, int secondValue) { this(); put(firstValue, secondValue); }
    public NodeIndexPair()       { allocate();  }
    private native void allocate();
    public native @Name("operator=") @ByRef NodeIndexPair put(@ByRef NodeIndexPair x);


    @MemberGetter public native Node first(); public native NodeIndexPair first(Node first);
    @MemberGetter public native @Cast("tensorflow::ImportGraphDefResults::Index") int second();  public native NodeIndexPair second(int second);

    public NodeIndexPair put(Node firstValue, int secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }
}

