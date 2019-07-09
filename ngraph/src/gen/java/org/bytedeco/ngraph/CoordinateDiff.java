// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

    /** \brief A difference (signed) of tensor element coordinates. */
    @Namespace("ngraph") @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class CoordinateDiff extends PtrDiffTVector {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CoordinateDiff(Pointer p) { super(p); }
    

        public CoordinateDiff(@Const @ByRef PtrDiffTVector diffs) { super((Pointer)null); allocate(diffs); }
        private native void allocate(@Const @ByRef PtrDiffTVector diffs);

        public CoordinateDiff(@Const @ByRef CoordinateDiff diffs) { super((Pointer)null); allocate(diffs); }
        private native void allocate(@Const @ByRef CoordinateDiff diffs);

        public CoordinateDiff(@Cast("size_t") long n, @Cast("std::ptrdiff_t") long initial_value/*=0*/) { super((Pointer)null); allocate(n, initial_value); }
        private native void allocate(@Cast("size_t") long n, @Cast("std::ptrdiff_t") long initial_value/*=0*/);
        public CoordinateDiff(@Cast("size_t") long n) { super((Pointer)null); allocate(n); }
        private native void allocate(@Cast("size_t") long n);

        public CoordinateDiff() { super((Pointer)null); allocate(); }
        private native void allocate();
        public native @ByRef @Name("operator =") CoordinateDiff put(@Const @ByRef CoordinateDiff v);
    }
