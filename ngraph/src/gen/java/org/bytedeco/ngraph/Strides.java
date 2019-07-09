// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

    /** \brief Strides for a tensor. */
    @Namespace("ngraph") @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class Strides extends SizeTVector {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Strides(Pointer p) { super(p); }
    

        public Strides(@Const @ByRef SizeTVector axis_strides) { super((Pointer)null); allocate(axis_strides); }
        private native void allocate(@Const @ByRef SizeTVector axis_strides);

        public Strides(@Const @ByRef Strides axis_strides) { super((Pointer)null); allocate(axis_strides); }
        private native void allocate(@Const @ByRef Strides axis_strides);

        public Strides(@Cast("size_t") long n, @Cast("size_t") long initial_value/*=0*/) { super((Pointer)null); allocate(n, initial_value); }
        private native void allocate(@Cast("size_t") long n, @Cast("size_t") long initial_value/*=0*/);
        public Strides(@Cast("size_t") long n) { super((Pointer)null); allocate(n); }
        private native void allocate(@Cast("size_t") long n);

        public Strides() { super((Pointer)null); allocate(); }
        private native void allocate();
        public native @ByRef @Name("operator =") Strides put(@Const @ByRef Strides v);
    }
