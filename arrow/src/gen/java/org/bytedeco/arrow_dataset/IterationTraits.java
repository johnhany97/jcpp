// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;
  // namespace dataset

@Name("arrow::IterationTraits<arrow::dataset::TaggedRecordBatch>") @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class IterationTraits extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IterationTraits() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IterationTraits(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IterationTraits(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IterationTraits position(long position) {
        return (IterationTraits)super.position(position);
    }
    @Override public IterationTraits getPointer(long i) {
        return new IterationTraits((Pointer)this).offsetAddress(i);
    }

  public static native @ByVal TaggedRecordBatch End();
  public static native @Cast("bool") boolean IsEnd(@Const @ByRef TaggedRecordBatch val);
}
